class S23{
	// mehtod to return middle space index
	static int midspace(String s1){
		int mid = (s1.length())/2;
		int left = s1.lastIndexOf(' ',mid);
		int right = s1.indexOf(' ',mid);
		if (mid - left <= right - mid){
			return left;
		}
		else
			return right;
	}
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO yash siva";
//                     0123456789 
		int middle_space = midspace(s1);
		if (s1.charAt(middle_space) != ' '){
			for (int i = s1.lastIndexOf(' ',middle_space)+1; i <= s1.indexOf(' ',middle_space)-1 ; i++){
				System.out.print(s1.charAt(i));
			}
		}
		else
			for (int i = s1.lastIndexOf(' ',middle_space-1)+1; i <= s1.indexOf(' ',middle_space+1)-1 ; i++){
				System.out.print(s1.charAt(i));
			}

	}
}
