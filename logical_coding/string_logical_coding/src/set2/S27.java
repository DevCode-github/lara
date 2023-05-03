class S27{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		String s2[] = s1.split(" ");
		for (int i = 0 ; i <= s2.length-1 ; i++){
			if ((s2[i].length()%2) == 0){
				continue;
			}
			else
				System.out.println(s2[i]);
		}
	}
}
