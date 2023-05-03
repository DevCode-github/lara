class S40{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		for (int i = s1.length()-1 ; i >= s1.lastIndexOf(' ',s1.lastIndexOf(' ',s1.lastIndexOf(' ')-1)-1); i--){
			if (s1.charAt(i)!=' '){
				System.out.print(s1.charAt(i));
			}
		}
	}
}
