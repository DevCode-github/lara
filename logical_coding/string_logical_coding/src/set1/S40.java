class S40{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		for (int i = s1.lastIndexOf(' ')+1 ; i <= s1.length()-1 ; i++){
			System.out.print(s1.charAt(i));
		}
	}
}
