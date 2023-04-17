class S22{
	static void print_10char_string_whileloop(String s1){
		int i = s1.length()-1;
		while(i >= (s1.length()-1)-10){
			System.out.print(s1.charAt(i));
			i--;
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_10char_string_whileloop(s1);
	}
}
