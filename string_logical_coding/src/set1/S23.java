class S23{
	static void print_10char_string_dowhileloop(String s1){
		int i = s1.length()-1;
		do{
			System.out.print(s1.charAt(i));
			i--;
		}
		while (i >= (s1.length()-1)-10);
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_10char_string_dowhileloop(s1);
	}
}