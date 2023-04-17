class S34{
	 public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		int counter = 0;
		for (int i = 0 ; i <= s1.length()-1 ; i++){
			if (s1.charAt(i) == ' '){
				counter++;
				if (counter == 2){
					break;
				}
				continue;
			}
			if (counter == 1){
				System.out.print(s1.charAt(i));
			}
		}
	}
}
class S34_1{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKL MN";
		String s2 = "";
		for (int i = s1.indexOf(' ') + 1; i < s1.indexOf(' ',i) ; i++){
			s2 += s1.charAt(i);
		}
		System.out.println(s2.trim());
	}
}
class S34_2{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		String s2 = "";
		for (int i = s1.indexOf(' ') ; i <= s1.indexOf(' ',i+1) ; i++){
			s2 += s1.charAt(i);
		}
		System.out.println(s2.trim());
	}
}
