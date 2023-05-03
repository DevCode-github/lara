class S44{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		int i = s1.indexOf(' ')-1;
		while (i >= 0){
			System.out.print(s1.charAt(i));
			i--;
		}
	}
}
