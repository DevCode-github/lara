class G{
	public static void main(String[] args){
		Double ref = Double.valueOf("1.5");	//boxing
		double d2 = ref.doubleValue();		//unboxing
		System.out.println("done " + d2);
	}
}
