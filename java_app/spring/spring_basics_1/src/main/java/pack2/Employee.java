package pack2;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	public String first;
	public String last;
	public Address add;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public Address getAdd() {
		return add;
	}
	@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}
	
}
