class C
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
Access levels/Access specifiers/Access modifiers
1.private :
	-Should be used within the same class.
	-Private members are not inheriting to subclass.
2.default :
	-No private, no public, no protected
	-Default scope/package scope through out the package
	-Usage limited to package, inheritance limited to package
3.protected :
	-Protected usage within the same package is like default
	-Usage limited to subclass package
	-Inheriting to any subclass from any package. whether bangeluru or maysore
4.public :
	-No restrictions
	-Can be used anywhere, inherited anywhere.

