package HackerRank;
import java.util.*;
public class If_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N%2 == 0) {
			if(N>=2 && N<=5) {
				System.out.println("Not Weird");
			}
			else if(N>=6 && N<=20) {
				System.out.println("Weird");
			}
			else {
				System.out.println("Not Weird");
			}
		}
		else {
			System.out.println("Weird");
		}
	}
}
