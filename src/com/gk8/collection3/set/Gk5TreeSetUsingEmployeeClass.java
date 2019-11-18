package com.gk8.collection3.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Gk5TreeSetUsingEmployeeClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		TreeSet<Employee> empSet = new TreeSet<Employee>();
		empSet.add(new Employee(5, "Gk25"));
		empSet.add(new Employee(35, "Gk10"));
		empSet.add(new Employee(25, "Gk15"));
		empSet.add(new Employee(15, "Gk4"));
		empSet.add(new Employee(15, "Gk4")); // Employee Number wont be duplicate.
		System.out.println("Default Natural Sorting Order by Employee Id: " + empSet);
		System.out.println("********************************");

		// To Create a Custom Sort Order, Need to Create a Class
		EmpNameCustSortOrder custComparatorObj = new EmpNameCustSortOrder();
		TreeSet<Employee> empCustSorSet = new TreeSet<Employee>(custComparatorObj);
		empCustSorSet.add(new Employee(5, "A"));
		empCustSorSet.add(new Employee(35, "V"));
		empCustSorSet.add(new Employee(25, "R"));
		empCustSorSet.add(new Employee(15, "Z"));
		empCustSorSet.add(new Employee(15, "X"));
		empCustSorSet.add(new Employee(55, "X")); // Sort Field wont be duplicate. Here employeeName wont be duplicate
		System.out.println("Custom Sorting Order by Employee Name: " + empCustSorSet);
	}

}

@SuppressWarnings("rawtypes")
class Employee implements Comparable {

	int employeeId;
	String name;

	public Employee(int employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	// Method(AlreadyInsertedObject)
	public int compareTo(Object o) {

		Integer newObj = this.employeeId; // Assigning calling id Object
		Employee emp = (Employee) o;
		Integer oldObj = emp.employeeId;

		// Ascending Order
		if (newObj < oldObj) {
			return -1;
		} else if (newObj > oldObj) {
			return +1;
		} else
			return 0;

		// return newObj.compareTo(oldObj); // Using Object CompareTo Method
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

}

@SuppressWarnings("rawtypes")
class EmpNameCustSortOrder implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee newObj = (Employee) o1;
		Employee oldObj = (Employee) o2;
		
		String newObjEmpName = newObj.name;
		String oldObjEmpName = oldObj.name;
		
		// Ascending Order by Name
		return newObjEmpName.compareTo(oldObjEmpName);
	}

}
