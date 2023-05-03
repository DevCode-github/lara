class Q47{
	public static void main(String[] args){
		String s1 = "ABCDEFGHIJKLMN";
		int toggle = 0;
		int i = 0;
		while (i <= s1.length()-1){
			if (toggle == 0){
				System.out.print(s1.charAt(i));
				toggle = 1;
				i++;
			}
			else{
				toggle = 0;
				i++;
			}
		}
	}
}
