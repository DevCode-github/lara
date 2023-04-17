class O{
	final int i;
	O(){
		i = 10;
	}
	O(String s1){
		i = 300;
	}
	public static void main(String[] args){
		O o1 = new O();
		O o2 = new O("abc");
		System.out.println(o1.i + ", " + o2.i);
	}
}
