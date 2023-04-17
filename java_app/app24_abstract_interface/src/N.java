interface A{
	static int i = 10;
	final int j = 10;
	final static int k = 10;
	static final int m  = 10;
	public static final int n = 10;
	static public final int p = 10;
	int q = 200;
}
class N{
	public static void main(String[] args){
		System.out.println(A.i);
		System.out.println(A.j);
		System.out.println(A.k);
		System.out.println(A.m);
		System.out.println(A.n);
		System.out.println(A.p);
		System.out.println(A.q);
	}
}
