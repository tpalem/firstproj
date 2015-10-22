package com.sankar.padma.realtime.project;



class addEmployee implements Runnable{
	
	ArrayList<int id,String name> ad1=new ArrayList<int id,String name>();
	public  addEmployee(int id,String name){
		
		ad1.add(1,padma);
		ad1.add(2,sankar);
		ad1.add(3,bhavya);
		
	}
	public synchronized void run(){
		for(int i=0;i<=ad1.length;i++){
			System.out.println(ad1(i));
		}
		
	}
}


public class TestClass {
	public static void main (String[] args){
		addEmployee add=new addEmployee(int id,String name);
		Thread t=new Thread(add);
		t.start();
		
	}

}

