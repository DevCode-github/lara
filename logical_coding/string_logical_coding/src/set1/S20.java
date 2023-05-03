class S20{
	static void print_string_whileloop(String s1){
		int i = 0;
		while(i <= s1.length()-1){
			System.out.print(s1.charAt(i));
			i++;
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_string_whileloop(s1);
	}
}
