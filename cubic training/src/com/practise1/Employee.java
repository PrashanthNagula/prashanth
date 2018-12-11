package com.practise1;

public class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
void display(){
	System.out.println(address.city+" "+address.state+" "+address.country);
	System.out.println(id+" "+name);
}
	public static void main(String[] args) {
		Address address1=new Address("hyderabad","telangana","india");
		Address address2=new Address("guntur","vizag","india");
		Employee e=new Employee(100,"prashanth",address1);
		Employee e2=new Employee(200,"manoj",address2);
		e.display();
		e2.display();
		// TODO Auto-generated method stub

	}

}
