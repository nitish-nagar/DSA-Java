import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to VolumeOfCuboid!");
        volumeOfCuboid();
    }

    public static void volumeOfCuboid() {
        double length, breadth, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of length: ");
        length = sc.nextDouble();
        System.out.println("Enter value of breadth: ");
        breadth = sc.nextDouble();
        System.out.println("Enter value of height: ");
        height = sc.nextDouble();
        double volume = length * breadth * height;
        System.out.println("The volume of the cuboid is: " + volume);
        sc.close();
    }
}