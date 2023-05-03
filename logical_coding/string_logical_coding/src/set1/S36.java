class S36{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		int counter = 0;
		int i = 0;
		do{
			if (s1.charAt(i) == ' '){
				counter++;
				if (counter == 2){
					break;
				}
				i++;
				continue;
			}
			if (counter == 1){
				System.out.print(s1.charAt(i));
			}
			i++;
		}while( i <= s1.length()-1);
	}
}
