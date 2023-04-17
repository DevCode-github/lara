class S43{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		for (int i = s1.indexOf(' ')-1 ; i >= 0 ; i--){
			System.out.print(s1.charAt(i))
				;
		}
	}
}
