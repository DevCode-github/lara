class S10{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		String s2 = "";
		for (int i = s1.lastIndexOf(' ') ; i <= s1.length()-1 ; i++){
			s2 += s1.charAt(i);
		}
		System.out.println("Last word " + s2.trim().length());
	}
}
