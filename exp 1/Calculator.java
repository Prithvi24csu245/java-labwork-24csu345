//Monish rao
//24csu321
import java.util.Scanner;
class Calculator
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Monish Rao,rollno. = 24csu321 ");
	System.out.print("\nEnter 1st no. = ");
	int a = sc.nextInt();
	System.out.print("\nEnter 2nd no. = ");
	int b = sc.nextInt();
	int sum =a+b;
	System.out.print("\nAddition of two numbers = "+sum);
	if(a>b){
	int dif =a-b;
	System.out.print("\nDifference of two numbers = "+dif);
	}
	else if(a<b){
	int dif =b-a;
	System.out.print("\nDifference of two numbers = "+dif);
	}
	else{
	System.out.print("\nDifference of two numbers = 0");
	}
	int pro =a*b;
	System.out.print("\nMultiplication of two numbers = "+pro);
	if(a>b){
	int div =a/b;
	System.out.print("\nDivision of two numbers = "+div);
	}
	else if(a<b){
	int div =b/a;
	System.out.print("\nDivision of two numbers = "+div);
	}
	else{
	System.out.print("\nDivision of two numbers = 1");
	}
	}
}