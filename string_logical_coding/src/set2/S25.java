class S25{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		String first_w = s1.substring(0,s1.indexOf(' ')+1);
		String last_w = s1.substring(s1.lastIndexOf(' ')+1,s1.length());
		System.out.println("first " + first_w + " last " + last_w);
	}
}
