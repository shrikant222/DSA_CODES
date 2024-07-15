package Multi_Threading;
import java.net.URL;
import java.io.*;

 class FileDownloader implements Runnable {
    private String fileUrl;
    private String destinationFile;

    public FileDownloader(String fileUrl, String destinationFile) {
        this.fileUrl = fileUrl;
        this.destinationFile = destinationFile;
    }

    public void run() {
        try {
            downloadFile(fileUrl, destinationFile);
            System.out.println("Downloaded " + destinationFile + " successfully.");
        } catch (IOException e) {
            System.out.println("Error downloading " + destinationFile + ": " + e.getMessage());
        }
    }

    private void downloadFile(String fileUrl, String destinationFile) throws IOException {
        URL url = new URL(fileUrl);
        try (BufferedInputStream in = new BufferedInputStream(url.openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) {
        String[] fileUrls = {"https://example.com/file1.txt", "https://example.com/file2.txt"};
        String[] destinationFiles = {"file1.txt", "file2.txt"};

        for (int i = 0; i < fileUrls.length; i++) {
            Thread thread = new Thread(new FileDownloader(fileUrls[i], destinationFiles[i]));
            thread.start();
        }
    }
}
