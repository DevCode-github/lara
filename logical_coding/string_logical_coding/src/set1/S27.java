class S27{
	static void print_string_reverse_dowhileloop(String s1){
		int i = s1.length()-1;
		do{
			System.out.print(s1.charAt(i));
			i--;
		}
		while (i >= 0);
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_string_reverse_dowhileloop(s1);
	}
}