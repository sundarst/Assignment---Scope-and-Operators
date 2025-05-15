package scopeandOperators;
import java.util.Scanner;
public class Fahrenheit {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the celsius ");
     double celsius = scan.nextDouble();
     double fahrenhit=( celsius*9.0/5.0)+32;
     
     System.out.println("convert Celsius to Fahrenheit "+fahrenhit);
	}

}

/*Question 1
Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions

*/

// learning 
/*in real time example we going to use in  weather apps, healthcare 
automobiles Any system dealing with global temperature data requires this conversion.
 * 
 * 
 * 
 */
