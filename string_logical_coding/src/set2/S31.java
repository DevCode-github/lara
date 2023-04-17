class S31{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		String s2[] = s1.split(" ");
		String s3 = "";
		for (int i = 0 ; i <= s2.length-1 ; i++){
			if (s2[i].length()%2 != 0){
				s3 = s2[i];
				char a = s3.charAt(s2[i].length()/2);
				System.out.println(s2[i] + " mid char " + a);
			}
			else{
				s3 = s2[i];
				char a = s3.charAt(s2[i].length()/2);
				char b = s3.charAt(s2[i].length()/2-1);
				System.out.println(s2[i] + " mid chars " + a + " " + b);
			}
		}
	}
}
