package chetu;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
//			try {
//				//System.out.println("A");
//				//throw new Exception("B");
//				//System.out.println("C");
//				catch(IOException e) {
//					System.out.println("D");
//				} catch(Exception e) {
//					System.out.println("F");
//				} 
//				finally{
//					System.out.println("G");
//				}
//			}

//		try {
//			 System.out.println("Hello");
//			 //throw new Exception("B");
//			 try {
//				 System.out.println("D");
//				 throw new Exception("B");
//			} 
//			 catch (Exception e) {
//				System.out.println("D");
//				throw new Exception("B");
//			}
//			 finally{
//					System.out.println("G");
//				}
//			// System.out.println("Hello2");
//			 //System.out.println("Hello3");
//			 
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

			//HashMap hm = new HashMap();
			Map hm = new HashMap();
			hm.put("abc", 1);
			hm.put("abc", 20);
			hm.put("pqr", 2);
			hm.put("dfp", 3);
			hm = new LinkedHashMap(hm);
			System.out.println(hm);
	}
}
