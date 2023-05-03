class S32{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELO hello";
		String s2[] = s1.split(" ");
		for (int i = 0 ; i <= s2.length-1 ; i++){
			String s3 = s2[i];
			int match = 0;
			new_word:
			for (int j = 0 ; j <= s3.length()-2 ; j++){
				for (int k = j+1 ; k < s3.length()-1 ; k++){
					if (s3.charAt(j) == s3.charAt(k)){
						match = 1; 
					}
					else 
						continue;
					if (match == 1){
						System.out.println(s3);
						break new_word;
					}
				}
			}

		}	

	}
}
