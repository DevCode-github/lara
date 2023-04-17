class Job{
	String title;
	int salary;
	String manager_name;
	Job(){}
	Job(String title, int salary, String manager_name){
		this.title = title;
		this.salary = salary;
		this.manager_name = manager_name;
	}
	void display(){
		System.out.println("title: " + title);
		System.out.println("salary: " + salary);
		System.out.println("manager_name: " + manager_name);
	}
}
class Employee{
	String emp_name;
	Job[] jobs;
	private int location;
	Employee(){}
	Employee(String emp_name, Job jobs[]){
		this.emp_name = emp_name;
		this.jobs = jobs;
	}
	boolean hasNext(){
		if (location == jobs.length){
			location = 0;
			return false;
		}
		return true;
	}
	Job nextJob(){
		return jobs[location++];
	}
}
class App2{
	public static void main(String[] args){
		Job j1 = new Job("Soft.", 50000, "vijay");
		Job j2 = new Job("Hard.", 40000, "bhanu");
		Job j3 = new Job("Sales", 60000, "bharath");
		Job j4 = new Job("admin", 10000, "rupa");
		Job[] jobs = {j1, j2, j3, j4};
		Employee e1 = new Employee("kumar", jobs);
		Job currentJob;
		while(e1.hasNext()){
			currentJob = e1.nextJob();
			System.out.println(currentJob.title +", "+ currentJob.salary +", "+ currentJob.manager_name);
		}
		System.out.println("---------");
		while(e1.hasNext()){
			currentJob = e1.nextJob();
			System.out.println(currentJob.title +", "+ currentJob.salary +", "+ currentJob.manager_name);
		}
	}
}
