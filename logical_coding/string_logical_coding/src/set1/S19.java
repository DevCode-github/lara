class S19{
	static void print_string_forloop(String s1){
		for (int i = 0 ; i <= s1.length()-1 ; i++){
			System.out.print(s1.charAt(i));
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_string_forloop(s1);
	}
}
