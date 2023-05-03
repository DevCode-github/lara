class S17{
	public static void main(String[] args){
		String s1 = "ABC XYZ TEST HELLO";
		System.out.print("Index of 3rd word last character is "+(s1.indexOf(' ',s1.indexOf(' ',s1.indexOf(' ')+1)+1)-1));
	}
}
