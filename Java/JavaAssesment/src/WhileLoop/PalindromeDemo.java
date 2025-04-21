package WhileLoop;
import java.util.Scanner;
public class PalindromeDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int rev=0;
	int origin=num;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	if(origin==rev) {
		System.out.println(origin+" is a Palindrome.");
	}
	else {
		System.out.println(origin+" is not a Palindrome.");
	}
}
}
