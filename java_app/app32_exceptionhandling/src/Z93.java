import java.io.Closeable;
class A implements Closeable{
	//several members
	public void close(){ System.out.println("from close"); }
}
class Z93{
	public static void main(String[] args){
		System.out.println("main begin");
		try( A a1 = new A() ; A a2 = new A() ; A a3 = new A() ){//Auto resource closing |  all are local and final. Automatically closes.
			System.out.println("try begin");
			System.out.println("try end");
//			a1 = a2;
		}
		catch (Exception ex){
		}
		finally{
		    System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
