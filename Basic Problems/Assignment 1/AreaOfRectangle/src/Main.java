import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to AreaOfRectangle!");
        areaOfRectangle();
    }

    public static void areaOfRectangle() {
        double length, breadth;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of length: ");
        length = sc.nextDouble();
        System.out.println("Enter value of breadth: ");
        breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }
}