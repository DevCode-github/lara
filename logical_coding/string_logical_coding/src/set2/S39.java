class S39{
	static int mid_space(String s1){
		int mid = s1.length()/2;
		int left = s1.lastIndexOf(' ',mid);
		int right = s1.indexOf(' ',mid);
		if (mid - left < right - mid){
			return left;
		}
		else
			return right;
	}
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		int middle_space = mid_space(s1);
		if (s1.charAt(middle_space)==' '){
			for (int i = s1.indexOf(' ',middle_space+1); i >= s1.lastIndexOf(' ',middle_space-1) ; i--){
				if (s1.charAt(i) != ' '){
					System.out.print(s1.charAt(i));
				}
			}
		}
		else{
			for (int i = s1.indexOf(' ',middle_space); i >= s1.lastIndexOf(' ',middle_space) ; i--){
				if (s1.charAt(i) != ' '){
					System.out.print(s1.charAt(i));
				}
			}
		}
	}
}
