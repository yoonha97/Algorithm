import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseNumber = 1;

        while (true) {
            int o = scanner.nextInt();
            int w = scanner.nextInt();
            if (o == 0 && w == 0) break;

            boolean isDead = false;
            int currentWeight = w;

            while (true) {
                String action = scanner.next();
                int n = scanner.nextInt();
                if (action.equals("#")) break;

                if (action.equals("E")) {
                    currentWeight -= n;
                } else if (action.equals("F")) {
                    currentWeight += n;
                }

                if (currentWeight <= 0) {
                    isDead = true;
                }
            }

            if (isDead) {
                System.out.println(testCaseNumber + " RIP");
            } else if (currentWeight > o / 2 && currentWeight < o * 2) {
                System.out.println(testCaseNumber + " :-)");
            } else {
                System.out.println(testCaseNumber + " :-(");
            }

            testCaseNumber++;
        }
    }
}