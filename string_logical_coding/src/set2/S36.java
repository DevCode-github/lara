class S36{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		int count = 0;
		for (int i = s1.length()-1 ; i >= 0 ; i--){
			if (s1.charAt(i) != ' '){
				System.out.print(s1.charAt(i));
				count++;
			}
			if (count == 7){
				break;
			}
		}
	}
}
