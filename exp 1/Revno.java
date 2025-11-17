
import java.util.Scanner;

class Revno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        int rev = 0;

        while (a != 0) {
            int digit = a % 10;     // get last digit
            rev = rev * 10 + digit; // build reverse
            a = a / 10;             // remove last digit
        }

        System.out.println("Reverse of this number = " + rev);
        System.out.print(" Prithviraj 24csu345")
            
    }
}

