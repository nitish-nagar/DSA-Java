import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to SimpleInterest!");
        simpleInterest();
    }

    public static void simpleInterest() {
        Scanner sc = new Scanner(System.in);
        double principal, rate, time;
        System.out.println("Enter value of principal: ");
        principal = sc.nextDouble();
        System.out.println("Enter value of rate: ");
        rate = sc.nextDouble();
        System.out.println("Enter value of time: ");
        time = sc.nextDouble();
        double simpleInterestValue = (principal * rate * time) / 100;
        System.out.println("The simple interest of the loan is: " + simpleInterestValue);
        sc.close();
    }
}