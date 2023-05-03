class S17{
	static void print_10char_without_space(String s1){
		for (int i = 0 ; i <= 9 ; i++){
			if (s1.charAt(i) != ' '){
				System.out.print(s1.charAt(i));
			}
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_10char_without_space(s1);
	}
}
