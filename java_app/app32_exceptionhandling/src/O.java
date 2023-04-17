class N{
	static int i;
	N(){
	}
}
class O{
	public static void main(String[] args){
		System.out.println("main begin");
		System.out.println(N.i);
		N n = new N();
		System.out.println(n.N());
		System.out.println("main end");
	}
}