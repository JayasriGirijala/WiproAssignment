package project;

public class Calculator {
	public void add(int a,int b) {
		int result=a+b;
		System.out.println("Addition is "+result);
		
	}
	public void diff(int a,int b) {
		int result=a+b;
		System.out.println("Difference is "+result);
	}
	public void mull(int a,int b) {
		int result=a*b;
		System.out.println("multiplication is "+result);
		
	}
	public void div(int a,int b) {
		int result=a/b;
		System.out.println("Division is "+result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(5, 5);
		cal.diff(5, 5);
		cal.mull(5, 5);
		cal.div(5, 5);
		}
}
/*Addition is 10
Difference is 10
multiplication is 25
Division is 1
*/
