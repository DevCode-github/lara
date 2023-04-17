class Unary
{
	public static void main(String[] args) 
	{ 
		/* 
		Operator biringing one unit effect in the variable, incrementing one unit and decrementing one unit 
		two types:
		1) Increment unary operator (++)
		2) Decrement unary operator (--)
		we can use unary operator in two ways:
		1) post way of using (value is incremeted or decremented in the next usage and not in the current usage)(first use and then change)
		2) pre way of using (value is incremeted or decremented at the point of usage)(first change and then use)
		*/
		int i = 1;
		System.out.println(i++);
		System.out.println(i);
	}
}

