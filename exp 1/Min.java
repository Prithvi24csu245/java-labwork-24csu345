//Monish rao
//24csu321
import java.util.Scanner;

class Min {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Monish Rao, rollno. = 24csu321 ");
        System.out.print("\nEnter minutes = ");
        int a = sc.nextInt();

        // Use double for accurate division
        double years = a / (60.0 * 24 * 365);
        double months = a / (60.0 * 24 * 30);
        double days = a / (60.0 * 24);

        System.out.println("Year  = " + years);
        System.out.println("Month = " + months);
        System.out.println("Days  = " + days);
    }
}
