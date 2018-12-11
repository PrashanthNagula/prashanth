package com.cubic;

public class Mo {
	public void add(int a){
		
		System.out.println(a);
		add(8,9);
	}
	public void add(int a,int b){
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		Mo o=new Mo();
		o.add(8);
		//o.add(8,9);
		// TODO Auto-generated method stub

	}

}
