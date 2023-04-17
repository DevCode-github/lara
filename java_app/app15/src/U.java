class U
{
/*
memory
i = 0 -> 1(i test1) -> 6(i test1 return) -> 7(j test1) -> 10(j test2) ->53(from main)
j = 0 -> 2(i test1) -> 4(j test2) -> 8(j test2) -> 37(j test1+test2 return)->97(from main)
P:
from test1: 0 0
from test1: 6 2
from test2: 7 4
main: 10 37
main: 53 97
*/
	static int i = test1();
	static int test1()
	{
		System.out.println("from test:" + i + ", " + j);
		i += 1;
		j += 2;
		return i + j + 3;
	}
	static int test2()
	{
		System.out.println("from test:" + i + ", " + j);
		i += 3;
		j += 4;
		return i + j + 5;
	}
	public static void main(String[] args) 
	{
		System.out.println("main: "+i + ", " + j);
		i = i + j + 6;
		j = i + j + 7;
		System.out.println("main: "+i + ", " + j);
	}
	static int j = test1() + test2();// 14 + 23
}