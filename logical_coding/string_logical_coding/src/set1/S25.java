class S25{
	static void print_string_reverse_forloop(String s1){
		for (int i = s1.length()-1 ; i >= 0; i--){
			System.out.print(s1.charAt(i));
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_string_reverse_forloop(s1);
	}
}
