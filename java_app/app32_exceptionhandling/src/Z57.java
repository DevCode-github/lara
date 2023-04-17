import java.io.*;
class Z57{
	public static void main(String[] args){//error handled by jvm
		System.out.println(1);
		try{
			test1();
		}
		finally{
		    System.out.println("from finally main");
		}		
		System.out.println(2);
	}
	public static void test1(){
		System.out.println(3);
		try{
			test2();
		}
		finally{
		    System.out.println("from finally 1");
		}
		System.out.println(4);
	}
	public static void test2(){
		System.out.println(5);
		try{
			new FileWriter("");
		}
		catch (IOException ex){
			System.out.println("from catch");
		}
		finally{
		    System.out.println("from finally 2");
		}
		System.out.println(6);
	}
}