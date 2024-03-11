import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

 class IPAddressInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the IP Address (in the format IP/Block): ");
        String input = scanner.nextLine();
        scanner.close();

        try {
            String[] parts = input.split("/");
            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid input format. Please enter IP Address/Block.");
            }

            String ipAddress = parts[0];
            String block = parts[1];

            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            String ipType = "";
            String ipClass = "";
            String defaultMask = "";
            String firstIp = "";
            String lastIp = "";
            String networkAddress = "";
            String maskInDecimal = "";
            String ipCount = "";
            String firstIpClassless = "";
            String lastIpClassless = "";

            // Check if IP is reserved, public, or private
            if (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress()
                    || inetAddress.isMulticastAddress() || inetAddress.isSiteLocalAddress()) {
                ipType = "Reserved";
            } else if (isPublicIP(ipAddress)) {
                ipType = "Public";
            } else {
                ipType = "Private";
            }

            // Determine classful addressing information
            byte[] addressBytes = inetAddress.getAddress();
            if (addressBytes.length == 4) {
                int firstByte = addressBytes[0] & 0xFF;
                if (firstByte >= 0 && firstByte < 128) {
                    ipClass = "A";
                    defaultMask = "255.0.0.0";
                } else if (firstByte >= 128 && firstByte < 192) {
                    ipClass = "B";
                    defaultMask = "255.255.0.0";
                } else if (firstByte >= 192 && firstByte < 224) {
                    ipClass = "C";
                    defaultMask = "255.255.255.0";
                }

                // Calculate network address, first and last IP for classful addressing
                byte[] networkAddressBytes = new byte[4];
                networkAddressBytes[0] = addressBytes[0];
                networkAddressBytes[1] = addressBytes[1];
                networkAddressBytes[2] = addressBytes[2];
                networkAddressBytes[3] = 0; // For classful addressing, last byte is 0
                networkAddress = InetAddress.getByAddress(networkAddressBytes).getHostAddress();

                firstIp = networkAddress;
                lastIp = InetAddress.getByAddress(networkAddressBytes).getHostAddress();
                lastIp = lastIp.substring(0, lastIp.lastIndexOf('.') + 1) + "255"; // Last IP for classful addressing
            } else {
                ipClass = "Unknown";
                defaultMask = "Unknown";
            }

            // Split IP address and block if given
            int prefixLength = Integer.parseInt(block);

            // Calculate mask in decimal and IP count for classless addressing
            StringBuilder sb = new StringBuilder();
            int[] maskBytes = new int[4];
            for (int i = 0; i < 4; i++) {
                if (prefixLength >= 8) {
                    maskBytes[i] = 255;
                    prefixLength -= 8;
                } else {
                    maskBytes[i] = (0xFF << (8 - prefixLength)) & 0xFF;
                    prefixLength = 0;
                }
                sb.append(maskBytes[i]);
                if (i < 3) sb.append('.');
            }
            maskInDecimal = sb.toString();

            ipCount = String.valueOf((long) Math.pow(2, 32 - Integer.parseInt(block)));

            // Calculate network address
            byte[] networkBytes = new byte[4];
            String[] ipBytes = ipAddress.split("\\.");
            for (int i = 0; i < 4; i++) {
                networkBytes[i] = (byte) (Integer.parseInt(ipBytes[i]) & maskBytes[i]);
            }
            networkAddress = InetAddress.getByAddress(networkBytes).getHostAddress();

            // Calculate first and last IP
            int[] ipAddressBytes = new int[4];
            for (int i = 0; i < 4; i++) {
                ipAddressBytes[i] = Integer.parseInt(ipBytes[i]);
            }
            int hostAddressEnd = (ipAddressBytes[3] | (0xFFFFFFFF >>> Integer.parseInt(block)));

            firstIpClassless = ipAddressBytes[0] + "." + ipAddressBytes[1] + "." + ipAddressBytes[2] + "." + (ipAddressBytes[3] + 1);
            lastIpClassless = ipAddressBytes[0] + "." + ipAddressBytes[1] + "." + ipAddressBytes[2] + "." + hostAddressEnd;

            // Print the results
            System.out.println("\nClassful Addressing:");
            System.out.println("Given IP is: " + ipType);
            System.out.println("This IP Address Belongs to Class: " + ipClass);
            System.out.println("Default Mask: " + defaultMask);
            System.out.println("Block: " + block);
            System.out.println("First IP: " + firstIp);
            System.out.println("Last IP: " + lastIp);
            System.out.println("Network Address: " + networkAddress);

            System.out.println("\nFor Classless Addressing:");
            System.out.println("/ Value: " + block);
            System.out.println("Mask in Decimal: " + maskInDecimal);
            System.out.println("No of IP Addresses in Block: " + ipCount);
            System.out.println("First IP: " + firstIpClassless);
            System.out.println("Last IP: " + lastIpClassless);
            System.out.println("Network Address: " + networkAddress);

        } catch (UnknownHostException e) {
            System.out.println("Invalid IP Address!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid block size. Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to check if an IP address is public
    private static boolean isPublicIP(String ip) {
        try {
            InetAddress addr = InetAddress.getByName(ip);
            return !addr.isSiteLocalAddress() && !addr.isAnyLocalAddress() && !addr.isLoopbackAddress()
                    && !addr.isLinkLocalAddress() && !addr.isMulticastAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return false;
        }
    }
}
