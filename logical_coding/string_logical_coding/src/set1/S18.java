class S18{
	static void print_10char_without_space_dowhile(String s1){
		int i = 0;
		do{
			if (s1.charAt(i) != ' '){
				System.out.print(s1.charAt(i));
			}		
			i++;
		}while (i <= s1.length()-1);
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_10char_without_space_dowhile(s1);
	}
}
