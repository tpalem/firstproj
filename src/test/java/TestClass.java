package com.sankar.padma.realtime.project;

import java.util.ArrayList;
import java.util.List;

class addEmployee implements Runnable {
	public List<addEmployee> list;
	public addEmployee() {
	}

	public addEmployee(int id, String name) {
		int d = id;
		String n = name;

	}

	public  synchronized void run() {

		for (int i = 0; i <= list.length; i++) {

			System.out.println(addEmployee[i]);
		}

	}
}

class deleteEmployee implements Runnable {
	public List<addEmployee> list;
	public  synchronized void run() {

		for (int i = 0; i <= list.length; i++) {
			list.remove[i];
		}
	}

}

public class TestClass {
	;
	public static void main(String[] args) {
		addEmployee empadd = new addEmployee();
		List<addEmployee> list = new ArrayList<addEmployee>();
		list.add(new addEmployee(1, "padma"));
		list.add(new addEmployee(2, "sankar"));
		list.add(new addEmployee(3, "bhavya"));

		Thread t = new Thread(empadd);
		deleteEmployee del = new deleteEmployee();
		Thread td = new Thread(del);
		t.start();
		td.start();

	}

}
