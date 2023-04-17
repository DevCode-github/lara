class S37{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		for (int i = s1.indexOf(' ',s1.indexOf(' ')+1); i >= 0 ; i--){
			if (s1.charAt(i) != ' '){
					System.out.print(s1.charAt(i));
				}
		}
	}
}
