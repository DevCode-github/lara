class S24{
	static void print_10char_string_forloop(String s1){
		for (int i = s1.length()-1 ; i >= (s1.length()-1)-10 ; i--){
			System.out.print(s1.charAt(i));
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_10char_string_forloop(s1);
	}
}
