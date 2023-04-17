class S26{
	static void print_string_reverse_whileloop(String s1){
		int i = s1.length()-1;
		while(i >= 0){
			System.out.print(s1.charAt(i));
			i--;
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_string_reverse_whileloop(s1);
	}
}
