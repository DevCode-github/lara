class S16{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		String s2[] = s1.split(" ");
		int sum = s2.length-1;
		for (int i = 0 ; i <= 2 ; i++){
			sum += s2[i].length();
		}
		System.out.println("Fourth word middle char " + (sum + (s2[3].length()/2)));
	}
}
