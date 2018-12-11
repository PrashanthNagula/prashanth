package com.practise1;
import com.cubic.*;

public class Mo1 extends Mo {
	public void add(int a){
		super.add(8);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Mo1 o1=new Mo1();
		o1.add(2);
		Mo o=new Mo();
		o.add(5);
		// TODO Auto-generated method stub

	}

}
