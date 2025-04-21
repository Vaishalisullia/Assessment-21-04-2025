package SwitchCase;
import java.util.Scanner; 
public class GameStorePurchase {
	public static void main(String[] args) {
int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Game Store Purchase System\n----------------------------");
		while(true) {
		System.out.println("1.Call of Warfare - ₹1500\n2.Speed Racers - ₹1200\n3.Mystery Mansion - ₹1000\n4.Pixel Adventure - ₹800\n5.Puzzle Mania - ₹500\n6.Checkout/Exit");
		System.out.println("Enter a choice:");
		int n=sc.nextInt();
		
			
//			System.out.println("Total cost of all selected games are:"+total);
			
	
		
	
	switch(n) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		System.out.println("How many copies you'd like to purchase:\n");
		int copies=sc.nextInt();
		System.out.println("Game(s) added to your cart!");
		if(n==1) {
			System.out.println("cost:"+1500*copies);
		}
		if(n==2) {
			System.out.println("cost:"+1200*copies);
		}
		if(n==3) {
			System.out.println("cost:"+1000*copies);
		}
		if(n==4) {
			System.out.println("cost:"+800*copies);
		}
		if(n==5) {
		
			System.out.println("cost:"+500*copies);
			
		}
		
		if(n==6) {
			System.out.println("Exit");
		}
		if(n>6) {
			System.out.println("Invalid");
		}
	
		
		}
	}}

}