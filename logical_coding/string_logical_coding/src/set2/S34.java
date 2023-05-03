class S34{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		String s2[] = s1.split(" ");
		for (int i = s2.length-1 ; i >= 0 ; i--){
			System.out.print(s2[i].charAt(s2[i].length()-1));
		}

	}
}
