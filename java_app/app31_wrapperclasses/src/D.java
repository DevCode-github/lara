class D{
	public static void main(String[] args){
		char c1 = 't';
		Character obj = Character.valueOf(c1);	//boxing
		char c2 = obj.charValue();				//unboxing
		System.out.println("done " + c2);
	}
}
