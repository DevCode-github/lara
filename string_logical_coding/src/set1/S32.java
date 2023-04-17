class S32{
	static void print_12thto3rd_index_dowhileloop(String s1){
		int i = s1.length()-1;
		do{
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

		}while( i >= 0 );
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_12thto3rd_index_dowhileloop(s1);
	}
}
