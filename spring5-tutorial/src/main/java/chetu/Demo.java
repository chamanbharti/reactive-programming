package chetu;

public class Demo {
	public static void main(String[] args) {
	try{
	System.out.println("A");
	throw new Exception("B");
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("F");
		e.printStackTrace();
	}
	finally{
		System.out.println("G");
		}
	}
}