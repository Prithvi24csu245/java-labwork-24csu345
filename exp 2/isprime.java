

import java.util.Scanner;
class isprime{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Monish Rao,rollno. = 24csu321 ");
	System.out.print("Enter a no. = ");
	int a = sc.nextInt();
	int count = 0;
	for(int i=2;i<=(a-1);i++){
		if(a%i==0){
			count++;
		}else{
			continue;
		}
	}
	if(count==0){
		System.out.print("Entered number is a prime number");
	}else{
		System.out.print("Entered number is not a prime number");
	}
	}
}