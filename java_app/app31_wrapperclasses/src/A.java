class A{
	public static void main(String[] args){
		Integer obj1 = Integer.valueOf(10);	//boxing
		int i = obj1.intValue();			//unboxing
		System.out.println("done");
	}
}
//primitive data type  wrapper classes
//-------------------   --------------
//	byte				Byte
//	short				Short
//	int					Integer
//	long				Long
//	float				Float
//	double				Double
//	char				Character
//	boolean				Boolean
/*
1. java.lang -- has all wrapper classes
2. All wrapper classes are final.
3. All wrapper classes are implementing interface | eligible for writing in the file system
4. All wrapper classes are implementing comaparable interface.
5. All wrapper classes are overriding object class toString() method.| Print object content through reference variable
6. All wrapper classes are overriding object class equals() and hashCode(). | Because of this duplication can be indentified in the collection framework.
7. Except Character wrapper class all the other wrapper classes supports converting string to primitive.
8. why do we require wrapper classes
   ---------------------------------
   1. Wrapping/Boxing primitive content into object.
   2. Un-wrapping object content to primitive.
   3. Converting primitive to string
   4. Converting string to primitive. | Except Character since string may have multiple character.
*/