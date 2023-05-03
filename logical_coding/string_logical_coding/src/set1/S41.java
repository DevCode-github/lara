class S41{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		int i = s1.lastIndexOf(' ')+1;
		while (i <= s1.length()-1){
			System.out.print(s1.charAt(i));
			i++;
		}
	}
}
