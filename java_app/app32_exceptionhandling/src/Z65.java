import java.io.*;
class Z65{
	public static void main(String[] args) throws Throwable{
		try{
			new FileWriter("");
			Class.forName("");
			Thread.sleep(100);
		}
		catch (ClassNotFoundException ex){
		}
		catch (IOException ex){
			System.out.println(ex);
		}
		catch (InterruptedException ex){
		}
		System.out.println("Hello World!");
	}
}
