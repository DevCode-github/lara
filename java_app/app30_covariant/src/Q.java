class A{
}
class B extends A{
}
class C extends B{
}
class P{
	A test(){
		return null;
	}
}
class Q extends P{
	B test(){//A test() will give error | cannot override
		return null;
	}
}
