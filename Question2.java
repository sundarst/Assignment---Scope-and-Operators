package scopeandOperators;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter coefficient a");
		double coefficientA=scan.nextDouble();
		System.out.println("Enter coefficient B");
		double coefficientB=scan.nextDouble();
		System.out.println("Enter coefficient c");
		double coefficientC=scan.nextDouble();
		
		double discriminant= (coefficientB*coefficientB)- (4*coefficientA*coefficientC);
		if(discriminant> 0)
		{
			double root1=(-coefficientB+(Math.sqrt(discriminant)/(2*coefficientA)));	
			double root2=(-coefficientB-(Math.sqrt(discriminant)/(2*coefficientA)));
			System.out.println("Real and different:"+root1);
			System.out.println("real and equal:"+root2);

		}
		else if(discriminant==0)
		{
			double root = -coefficientB/(2*coefficientA);
			System.out.println("real and equal");
			System.out.println("root:"+root);
		}
		else 
		{
			double realPart = -coefficientB/(2*coefficientA);
			double ImageryPart = Math.sqrt(-discriminant)/(2*coefficientA);
			System.out.println("Complext Logic");
			System.out.println("real part:"+realPart+"+"+ImageryPart+"i");
			System.out.println("ImageryPart"+realPart+"-"+ImageryPart+"i");
		}
	}

}
