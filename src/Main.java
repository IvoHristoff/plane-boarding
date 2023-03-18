package src;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning){
            menu();
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            if (choice >= 5) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("0-4");
                continue;
            }
            if (choice == 1) {
                System.out.println("choice1");
            }
            if (choice == 2) {
                System.out.println("choice2");
            }
            if (choice == 3) {
                System.out.println("choice3");
            }
            if (choice == 4) {
                System.out.println("choice4");
            }
            if (choice == 0) {
                System.out.println("Closing the boarding");
                isRunning = false;
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        scanner.close();
    }

    public static void menu(){
        System.out.println("Boarding .. .... ... ..");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("1.Check-in passengers");
        System.out.println("2.Passenger info");
        System.out.println("3.Remove passenger");
        System.out.println("4.Flight info");
        System.out.println("0.Close boarding");
    }
}