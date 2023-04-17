class S29{
	public static void main(String[] args){
		String s1 = "ABC XYZ 123 TEST HELLO";
		//           0123456789
		int i = 1;
		int index = 0;
		while (true){
			index = s1.indexOf(' ',index);
			if (index == -1){
				break;
			}
			else
				System.out.println("The " + i + "th space index is " + index);
			index++;
			i++;
		}
	}
}
