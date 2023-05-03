class S31{
	static void print_12thto3rd_index_whileloop(String s1){
		int i = s1.length()-1;
		while ( i >= 0){
			if (i <= 12 & i >=3){
				System.out.print(s1.charAt(i));
				i--;
			}
			else{
				i--;
				if (i < 3){
					break;
				}
				continue;
			}


		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_12thto3rd_index_whileloop(s1);
	}
}
