package ie.atu;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        multiple();

    }
    public static void multiple()
    {
        System.out.println("Please enter your first number to multiply : ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter your second number to multiply : ");
        int secondNum = inputs.nextInt();

        int total1 = firstNum * secondNum;
        System.out.println("The total is : " + total1);
    }
    public static void delete()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNum = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNum = inputs.nextInt();

        int delete = firstNum - secondNum;
        System.out.println("The delNumb is : " + delete);
    }
}
