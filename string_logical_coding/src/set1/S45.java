class S45{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		int i = s1.indexOf(' ')-1;
		do{
			System.out.print(s1.charAt(i));
			i--;
		}while (i >= 0);
	}
}
