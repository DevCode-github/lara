class A{
}
class B extends A{
}
class C extends B{
}
class P{
	B test(){
		return null;
	}
}
class Q extends P{
	C test(){//A test() will give error | cannot override
		return null;
	}
}
