import java.util.Scanner;

public class IT26101804Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, average;

        System.out.println("Enter marks for four subjects:");

        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextDouble();

        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextDouble();

        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextDouble();

        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextDouble();

        average = (mark1 + mark2 + mark3 + mark4) / 4;

        System.out.println();
        System.out.println("Average is : " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is : Distinction");
        } else if (average >= 50) {
            System.out.println("Overall Grade is : Credit");
        } else {
            System.out.println("Overall Grade is : Fail");
        }
    }
}