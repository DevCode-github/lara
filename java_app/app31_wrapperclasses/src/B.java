class B{
	public static void main(String[] args){
		double d1 = 1.5;
		Double d2 = Double.valueOf(d1);		//boxing
		double d3 = d2.doubleValue();	//unboxing
		System.out.println("done " + d3);
	}
}
