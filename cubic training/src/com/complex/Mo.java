package com.complex;

  public class Mo {
	int add(int a,int b,int c){
		return a+b+c;
	}
	int add(int a,int b){
		return a+b;
	}

}
  class Test{
		public static void main(String args[]){
			Mo o=new Mo();
			System.out.println(o.add(1,3,6));
			System.out.println(o.add(2, 4));
		}
	}
 
 