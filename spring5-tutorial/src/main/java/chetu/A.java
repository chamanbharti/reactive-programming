package chetu;

public class A {

		{
			System.out.println("A");
		}
		static{
			System.out.println("B");
			}
		public static void main(String[] args) {
			A a1 = new A();
			A a2 = new A();
			System.out.println("C");
			Integer x=8;
			System.out.println(x.SIZE+x.BYTES);
		}
}
