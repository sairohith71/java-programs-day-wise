import java.util.Scanner;
public class SwapNumbersusingScanner {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first number:");
int num1 = scanner.nextInt();
System.out.println("Enter second number:");
int num2 = scanner.nextInt();
System.out.println("Before swapping:");
System.out.println("Number 1: " + num1);
System.out.println("Number 2: " + num2);
num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;
System.out.println("After swapping:");
System.out.println("Number 1: " + num1);
System.out.println("Number 2: " + num2);
    }
}

