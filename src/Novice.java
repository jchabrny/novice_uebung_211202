import java.util.Scanner;

public class Novice {

    public static void main(String[] args) {
        outputName();
        groesserAlsNull(4);
        quadratZahl();
        sayHello();
    }

    public static void outputName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println(name);
        for (int i = 0; i < 4; i++) {
            System.out.println(name);
        }
    }

    public static void groesserAlsNull(int num) {
        if (num > 0) {
            System.out.println(num + " ist größer als " + 0);
        }
    }

    public static void quadratZahl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int zahl = scan.nextInt();
        int square = zahl * zahl;
        System.out.println("Square of " + zahl + " is: " + square);
    }

    public static void sayHello() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String username = scan.nextLine();
        System.out.println("Hello " + username + "! Welcome!");
    }
}


