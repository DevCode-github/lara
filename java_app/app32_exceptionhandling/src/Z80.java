class A{
	A() throws ClassNotFoundException{}
}
class Z80 extends A{
	Z80(){
		try{
			super();
		}
		catch (ClassNotFoundException ex){
		}
	}
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
