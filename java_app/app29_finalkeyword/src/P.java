class P{
	final int i;
	P(){
		this("xyx");
	}
	P(String s1){
		i = 300;
	}
	public static void main(String[] args){
		P p1 = new P();
		P p2 = new P("abc");
		System.out.println(p1.i + ", " + p2.i);
	}
}
