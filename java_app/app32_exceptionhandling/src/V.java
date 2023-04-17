class V{
	public static void main(String[] args){
		System.out.println("main begin");
		try{
			System.out.println("try begin");
			int[] elements = {10, 20, 40, 50, 60};
			int i = elements[5];
			System.out.println("try end");
		}
		catch (ArrayIndexOutOfBoundsException ex){ //incompatible exception
			System.out.println("from catch" + ex.getMessage());
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.getMessage();
			ex.printStackTrace();
			System.out.println("dfs");
		}
		System.out.println("main end");
	}
}
