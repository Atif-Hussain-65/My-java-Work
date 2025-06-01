import java.util.*;

class MProcess {
    int pid, arrivalTime, burstTime, remainingTime, completionTime, waitingTime, turnaroundTime;

    MProcess(int pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}


 class cpuscheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MProcess> processes = new ArrayList<>();

        System.out.print("Enter the number of processes: ");
        int numProcesses = sc.nextInt();

        // Input process details
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter arrival time and burst time for process " + (i + 1) + ": ");
            int arrivalTime = sc.nextInt();
            int burstTime = sc.nextInt();
            processes.add(new MProcess(i + 1, arrivalTime, burstTime));
        }

        System.out.print("Enter time quantum for Round Robin: ");
        int timeQuantum = sc.nextInt();

        // Run scheduling algorithms
        fcfs(processes);
        sjfNonPreemptive(new ArrayList<>(processes));
        sjfPreemptive(new ArrayList<>(processes));
        roundRobin(new ArrayList<>(processes), timeQuantum);

        sc.close();
    }

    private static void fcfs(List<MProcess> processes) {
        System.out.println("\nFCFS Scheduling:");
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        int currentTime = 0;

        for (MProcess p : processes) {
            if (currentTime < p.arrivalTime) currentTime = p.arrivalTime;
            currentTime += p.burstTime;
            p.completionTime = currentTime;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;
        }

        printResults(processes);
    }

    private static void sjfNonPreemptive(List<MProcess> processes) {
        System.out.println("\nSJF Non-Preemptive Scheduling:");
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        int currentTime = 0;

        while (!processes.isEmpty()) {
            int finalCurrentTime = currentTime;
            MProcess currentProcess = processes.stream()
                    .filter(p -> p.arrivalTime <= finalCurrentTime)
                    .min(Comparator.comparingInt(p -> p.burstTime))
                    .orElse(null);

            if (currentProcess != null) {
                currentTime += currentProcess.burstTime;
                currentProcess.completionTime = currentTime;
                currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
                currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
                processes.remove(currentProcess);
                printProcess(currentProcess);
            } else {
                currentTime++;
            }
        }
    }

    private static void sjfPreemptive(List<MProcess> processes) {
        System.out.println("\nSJF Preemptive Scheduling:");
        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));
        int currentTime = 0;
        while (!processes.isEmpty()) {
            int finalCurrentTime = currentTime;
            MProcess currentProcess = processes.stream()
                    .filter(p -> p.arrivalTime <= finalCurrentTime && p.remainingTime > 0)
                    .min(Comparator.comparingInt(p -> p.remainingTime))
                    .orElse(null);

            if (currentProcess != null) {
                currentProcess.remainingTime--;
                currentTime++;
                if (currentProcess.remainingTime == 0) {
                    currentProcess.completionTime = currentTime;
                    currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
                    currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
                    processes.remove(currentProcess);
                    printProcess(currentProcess);
                }
            } else {
                currentTime++;
            }
        }
    }

    private static void roundRobin(List<MProcess> processes, int timeQuantum) {
        System.out.println("\nRound Robin Scheduling:");
        int currentTime = 0;
        Queue<MProcess> queue = new LinkedList<>(processes);

        while (!queue.isEmpty()) {
            MProcess currentProcess = queue.poll();
            if (currentProcess.arrivalTime > currentTime) {
                currentTime = currentProcess.arrivalTime;
            }
            int executedTime = Math.min(timeQuantum, currentProcess.remainingTime);
            currentProcess.remainingTime -= executedTime;
            currentTime += executedTime;

            if (currentProcess.remainingTime == 0) {
                currentProcess.completionTime = currentTime;
                currentProcess.turnaroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
                currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
                printProcess(currentProcess);
            } else {
                queue.add(currentProcess);
            }
        }
    }

    private static void printResults(List<MProcess> processes) {
        double avgWaitingTime = 0, avgTurnaroundTime = 0;

        System.out.println("PID\tArrival\tBurst\tCompletion\tTurnaround\tWaiting");
        for (MProcess p : processes) {
            avgWaitingTime += p.waitingTime;
            avgTurnaroundTime += p.turnaroundTime;
            System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" + p.completionTime + "\t\t" + p.turnaroundTime + "\t\t" + p.waitingTime);
        }

        int n = processes.size();
        System.out.println("Average Waiting Time: " + avgWaitingTime / n);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime / n);
    }

    private static void printProcess(MProcess p) {
        System.out.println("Process " + p.pid + ": Completion Time = " + p.completionTime + ", Turnaround Time = " + p.turnaroundTime + ", Waiting Time = " + p.waitingTime);
    }
}
