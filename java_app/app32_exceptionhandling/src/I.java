class I{
	public static void main(String[] args){
		System.out.println("main begin");
		StringBuffer[] elements = new StringBuffer[999999999];
		for (int i = 0; i < elements.length ; i++){
			elements[i] = new StringBuffer("abc");
		}
		System.out.println("main end");
	}
}
