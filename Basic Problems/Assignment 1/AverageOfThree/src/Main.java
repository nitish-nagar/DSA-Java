import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to AverageOfThree!");
        averageOfThree();
    }

    public static void averageOfThree() {
        Scanner sc = new Scanner(System.in);
        double firstNum, secondNum, thirdNum;
        System.out.println("Enter value of first number: ");
        firstNum = sc.nextDouble();
        System.out.println("Enter value of second number: ");
        secondNum = sc.nextDouble();
        System.out.println("Enter value of third number: ");
        thirdNum = sc.nextDouble();
        double average = (firstNum + secondNum + thirdNum) / 3;
        System.out.println("The average of the three numbers is: " + average);
        sc.close();
    }
}