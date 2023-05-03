class S42{
	public static void main(String[] args){
		int i = s1.lastIndexOf(' ');
		do{
			System.out.print(s1.charAt(i));
			i++;
		}
		while (i <= s1.length()-1);
	}
}
