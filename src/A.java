import java.util.Scanner;

 class BankersAlgorithm {
    private int need[][];
    private int allocation[][];
    private int max[][];
    private int available[];
    private int numberOfProcesses;
    private int numberOfResources;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        numberOfProcesses = scanner.nextInt();

        System.out.print("Enter number of resources: ");
        numberOfResources = scanner.nextInt();

        need = new int[numberOfProcesses][numberOfResources];
        allocation = new int[numberOfProcesses][numberOfResources];
        max = new int[numberOfProcesses][numberOfResources];
        available = new int[numberOfResources];

        System.out.println("Enter allocation matrix:");
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < numberOfResources; j++) {
                allocation[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter max matrix:");
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < numberOfResources; j++) {
                max[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter available matrix:");
        for (int j = 0; j < numberOfResources; j++) {
            available[j] = scanner.nextInt();
        }


    }

    public void calculateNeed() {
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < numberOfResources; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
    }

    public boolean isSafe() {
        boolean[] finish = new boolean[numberOfProcesses];
        int[] safeSequence = new int[numberOfProcesses];
        int[] work = new int[numberOfResources];

        for (int i = 0; i < numberOfResources; i++) {
            work[i] = available[i];
        }

        int count = 0;
        while (count < numberOfProcesses) {

           count++;
        }

        if (count == numberOfProcesses) {
            System.out.println("System is in safe state.");
            System.out.print("Safe sequence is: ");
            for (int i = 0; i < numberOfProcesses; i++) {
                System.out.print(safeSequence[i] + " ");
            }
            System.out.println();
            return true;
        } else {
            System.out.println("System is in unsafe state.");
            return false;
        }
    }

    public static void main(String[] args) {
        BankersAlgorithm bankersAlgorithm = new BankersAlgorithm();
        bankersAlgorithm.input();
        bankersAlgorithm.calculateNeed();
        bankersAlgorithm.isSafe();
    }
}
