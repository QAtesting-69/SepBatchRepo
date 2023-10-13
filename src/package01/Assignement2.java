package package01;

public class Assignement2 {

	
	public int add (int a , int b) {
		
		return a+b;
		
	}
	public int sub (int a, int b) {
		
		return a-b;
	}
	
	public int multip (int a , int b) {
		
		return a*b;
		
	}
	
	public int div (int a, int b) {
		
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignement2 ass= new Assignement2();
		int result= ass.add(10,2);
		result=ass.add(result, 2);
		result=ass.sub(result, 2);
		result=ass.multip(result,2);
		
		System.out.println(ass.div(result,2));

	}

}
