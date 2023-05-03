class S12{
	static String concat(String s1){
		String s2 = new String();
		for (int i = 0 ; i <= s1.length()-1 ; i++){
			if (s1.charAt(i) != ' '){
				s2 = s2 + s1.charAt(i);
			}
		}
		return s2;
	}
	public static void main(String[] args){
		String s1= "ABC DEFGH IJKLMN";
		String s2= s1.substring(0,3) + s1.substring(4,9) + s1.substring(10,s1.length()-1);
		
		for (int i = 0; i <= s2.length()-1 ; i++){
			System.out.println(s2.charAt(i));
		}
		s2 = concat(s1);
		System.out.println(s2);
	}
}