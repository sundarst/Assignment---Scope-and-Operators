package scopeandOperators;

public class Question4 {

	public static void main(String[] args) {
		int outsideVariable =10;
		if(outsideVariable>0)
		{
			int insideVariable=20;
			System.out.println("Out side variable"+outsideVariable);
			System.out.println("Inside variable"+insideVariable);
		}
		System.out.println("outsideVariable"+outsideVariable);
	}

}
/*
Write a program with an if statement. Declare one variable inside the if block and another one outside. 
Print both variables inside and outside the if block to understand variable scope. 
Comment the compiler error in your program while submitting)

*/
