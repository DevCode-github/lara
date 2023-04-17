class S11{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		String s2[] = s1.split(" ");
		int check = 0
		for (int i = 0 ; i <= s2.length-1 ; i++){
			if (s2[i].length() == 3){
				System.out.print(s2[i] + " ");
				check = 1;
			}			
		}
		if (check = 0){
			System.out.println("no word length = 3");
		}
	}
}
