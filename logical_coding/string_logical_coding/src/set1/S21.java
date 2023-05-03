class S21{
	static void print_string_dowhileloop(String s1){
		int i = 0;
		do{
			System.out.print(s1.charAt(i));
			i++;
		}
		while (i <= s1.length()-1);
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_string_dowhileloop(s1);
	}
}
