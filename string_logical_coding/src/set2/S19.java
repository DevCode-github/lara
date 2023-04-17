class S19{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		for (int i = s1.indexOf(' ',s1.indexOf(' ')+1)-1 ; i >= s1.indexOf(' ')+1 ; i--){
			System.out.print(s1.charAt(i));
		}
	}
}
