/**
 * 
 */
package basicprograms;

/**
 * @author swamy
 *
 */
public class Helloworld {
	
	public static void main(String[] args) {
		System.out.println("First java programs");
		
		Helloworld obj=new Helloworld();
		int result2 = obj.add(10, 10);
		System.out.println("Addition of A and B is = "  + result2);
		
		int mulresult2= obj.mul(10, 10);
		System.out.println("Multiplication of C and D is ="  +mulresult2);
		
		System.out.println("Addition of two numbers without method");
		
		int p=10,q=10;
		int addresult=p+q;
		System.out.println(addresult);
		
		int divresult2=obj.div(4, 2);
		System.out.println("Div of E and F is = " +divresult2);
		
		
	}
	
	public int add(int a,int b) {
		return  a+b;
		
	}
	
	public int mul(int c,int d) {
		return c*d;
	}
	
	public int  div(int e,int f) {
		int divresult = e/f;
		return divresult;
		
		
	}

}




