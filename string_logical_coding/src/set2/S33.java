class S33{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		String s2[] = s1.split(" ");
		for (int i = 0 ; i <= s2.length-1 ; i++){
			System.out.print(s2[i].charAt(0));
		}

	}
}
