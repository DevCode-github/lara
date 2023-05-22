package pack5_Generics;

class R<E extends Number>{
	E fields;
}
public class M10_Generic_extends {
	public static void main(String[] args) {
		
		R<Integer> r1 = new R<Integer>();
		r1.fields = 200;
		
		R<Double> r2 = new R<Double>();
		r2.fields = 3.4;
		
		/*
		 * E should be a Number or Subclasses to Number.
		 */
		R<String> r3 = new R<String>();//Error
		System.out.println(r3);
		
		System.out.println("done");
	}

}
