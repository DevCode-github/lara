class S33{
	static void print_12thto3rd_index_forloop(String s1){
		for (int i = s1.length()-1 ; i >= 0 ; i--){
			if (i <= 12 & i >=3){
				System.out.print(s1.charAt(i));
			}
			else{
				continue;
			}
		}
	}
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		print_12thto3rd_index_forloop(s1);
	}
}
