class S24{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		String s2[] = s1.split(" ");
		int length = 0;
		int index = 0;
		for (int i = 0 ; i <= s2.length-1 ; i++){
			if (length >= s2[i].length()){
				continue;
			}
			else{
				length = s2[i].length();
				index = i;
			}
		}
		System.out.println("the longest word " + s2[index]);
	}
}
