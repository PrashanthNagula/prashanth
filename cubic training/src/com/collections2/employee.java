package com.collections2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class employee  {
	int id;
	String name;
	String dept;
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public static void main(String[] args) {
		
		employee[] e=new employee[3];
		e[0]=new employee(111, "sai", "java");
		e[1]=new employee(115, "rajesh", "dotnet");
		e[2]=new employee(77, "avinash", "testing");
//		Arrays.sort(e);
//		System.out.println(Arrays.toString(e));
//	}
		Comparator<employee> idcom=new Comparator<employee>() {
			
			@Override
			public int compare(employee o1, employee o2) {
				// TODO Auto-generated method stub
				return o1.id-o2.id;
			}
		};
		Arrays.sort(e, idcom);
		System.out.println(Arrays.toString(e));
Comparator<employee> namecom=new Comparator<employee>() {
			
			@Override
			public int compare(employee o1, employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
				
			}
		};
		Arrays.sort(e, namecom);
		System.out.println(Arrays.toString(e));
		
Comparator<employee> deptcom=new Comparator<employee>() {
			
			@Override
			public int compare(employee o1, employee o2) {
				// TODO Auto-generated method stub
				return o1.dept.compareTo(o2.dept);
			}
		};
		Arrays.sort(e, deptcom);
		System.out.println(Arrays.toString(e));
		
	}

//	@Override
//	public int compareTo(employee o) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o.name);
//	}

	
	

}
