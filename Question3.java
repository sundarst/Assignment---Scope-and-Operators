package scopeandOperators;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x value");
		int x=scan.nextInt();
		System.out.println("Enter y value");
		int y=scan.nextInt();
		
		
   System.out.println("bitwise AND: " +(x&y));
   System.out.println("Bitwise OR: "+(x|y));
   System.out.println("Bitwise XOR: "+(x^y));
   
   System.out.println("Right shift: "+(x>>1));
   System.out.println("Left shift: "+(x<<1));
			
		
		
		
		
		
	}

}
