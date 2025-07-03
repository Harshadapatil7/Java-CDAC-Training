package com.app.entities;

public class Employee extends Person {
	int empId;
	String department;
	double salary;
	MyDate dateOfJoining;

	public Employee() {
		super();
		dateOfJoining = new MyDate();
	}

	public Employee(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, int empId, String department,
			double salary, int dayOfJoining, int monthOfJoining, int yearOfJoining) {
		super(name, dayOfBirth, monthOfBirth, yearOfBirth);
		this.empId = empId;
		this.department = department;
		this.salary = salary;
		this.dateOfJoining = new MyDate(dayOfJoining, monthOfJoining, yearOfJoining);
	}

	public int getEmpId() {
		return empId;
	}

	public String getDepartment() {
		return department;
	}

	public MyDate getDateOfJoining() {
		return dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDateOfJoining(MyDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "\n" + "Employee ID: " + empId + "\n" + super.toString() + "\n" + "Department: " + department + "\n"
				+ "Salary: " + salary + "\n" + "Date of Joining: " + dateOfJoining;
	}
}
