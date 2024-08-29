import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int HH = scanner.nextInt();
        int MM = scanner.nextInt();

        int startMinutes = 9 * 60; 
        int currentMinutes = HH * 60 + MM;

        int minutesPassed = currentMinutes - startMinutes;

        System.out.println(minutesPassed);
    }
}