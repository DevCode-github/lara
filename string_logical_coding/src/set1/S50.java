class S50{
	public static void main(String[] args){
		String s1 = "ABC DEFGH IJKLMN";
		//           0123456789
		int mid = (s1.length()-1)/2;
		int right = s1.indexOf(' ',mid);
		int left = s1.lastIndexOf(' ',mid);
		if ((mid - left) >= (right-mid)){
			System.out.print("the index is " + right);
		}
		else
			System.out.print("the index is " + left);
	}
}
