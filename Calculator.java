package Week1.day2;

public class Calculator {
	
	int sum;
	int sub;
	double mul;
	float div;

	public int add(int num1, int num2, int num3) {
		sum = num1 + num2 + num3;
		System.out.println("Sum of " +num1+ " + " +num2+ " + " +num3+ " = " +sum);
		return sum;
	}

	public int sub(int num1, int num2) {
		sub = num1 - num2;
		System.out.println("Difference between " +num1 + "-" + num2 + " = "+ sub);
		return sub;
	}

	public double mul(double num1, double num2) {
		mul = num1 * num2;
		System.out.println("Increment of: " +num1+ "*" +num2+ " = "+ mul);
		return mul;
	}

	public float divide(float num1, float num2) {
		div = num1 / num2;
		System.out.println("Division of: " +num1+ "/"+num2 + " = "+ div);
		return div;
	}


}
