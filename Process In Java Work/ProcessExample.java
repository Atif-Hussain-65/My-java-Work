import java.io.IOException;

public class ProcessExample {
    public static void main(String[] args) {
        // Create a ProcessBuilder to run the "cmd" command with "/c dir"
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "dir");
        System.out.println("Process starting... ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the process
        try {
            Process process = processBuilder.start();
            System.out.println("Process started! ");

            // Wait for the process to complete and get the exit value
            Thread.sleep(3000);
            int exitCode = process.waitFor();

            // Print the exit code
            System.out.println("Process exited with code: " + exitCode);
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("InterruptedException: " + e.getMessage());
            Thread.currentThread().interrupt(); // Restore interrupted status
        }

        // Exit the program
        System.exit(0);
    }
}
