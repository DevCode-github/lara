class S37{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		int counter = 0;
		for (int i = s1.length()-1 ; i >= 0 ; i--){
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
class S37_1{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		String s2 = "";
		for (int i = s1.indexOf(' ') ; i < s1.indexOf(' ', i+1) ; i++){
			s2 = s2 + s1.charAt(i);
			System.out.print(i + " ");
		}
		System.out.println(s2);
	}

}
