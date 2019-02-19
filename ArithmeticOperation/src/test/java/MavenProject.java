package test.java;

public class MavenProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Adding Comments
		ArithmeticOperation op = new ArithmeticOperation();
		ArithmeticOperation op1 = new ArithmeticOperation();
		int a = 30;
		int b = 10;
		op = op1.multiply(a, b);
		System.out.printf("Value of Operation = " + op.val);
	}

}