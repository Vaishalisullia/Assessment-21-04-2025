package Pattern;

public class PatternAsterik {
public static void main(String[] args) {
	for(int i =1;i<=5;i++) {
		for(int j=2;j<2*i+1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
