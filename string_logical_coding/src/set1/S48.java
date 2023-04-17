class Q48{
	public static void main(String[] args){
		String s1 = "ABCDEFGHIJKLMN";
		int toggle = 0;
		for (int i = s1.length()-1 ; i >= 0 ; i--){
			if (toggle == 0){
				System.out.print(s1.charAt(i));
				toggle = 1;
			}
			else{
				toggle = 0;
			}
		}
	}
}
