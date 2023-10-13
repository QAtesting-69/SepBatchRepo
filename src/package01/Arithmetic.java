package package01;

public class Arithmetic {
	
	public int sum(int a, int b) {
		
		int c;
		c=a+b;
	System.out.println("sum results is"+ c ); //
	return c;
	}
	
	public int substract (int x, int y) {
		int z;
		z=x-y;
		System.out.println(" sub result is" + z);
		return z;                 
	}

 public int multip (int a1, int a2) {
	 int a3;
	 a3=a1*a2;
	 System.out.println("multip resul");
	 return a3;
 }
 
 public static void main (String[] args) {
	 
 Arithmetic obj= new Arithmetic();
 int sumresult=obj.sum(3, 4);
 int subresult=obj.substract(33, 12);
 int multiresul=obj.multip(12, 5);
	 
 }
 
}
