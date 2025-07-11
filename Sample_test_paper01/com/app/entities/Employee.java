package com.app.entities;

import com.app.exceptions.EmptyFieldException;
import com.app.exceptions.InvalidJoiningDateException;
import com.app.exceptions.NegativeEmpIdException;
import com.app.exceptions.NegativeSalaryException;

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

		if (empId <= 0)
			throw new NegativeEmpIdException("Employee id must be positive");
		this.empId = empId;

		if (department == null)
			throw new EmptyFieldException();
		this.department = department;

		if (salary < 0)
			throw new NegativeSalaryException("Salary is never negative");
		this.salary = salary;

		if (getAgeAtJoining(yearOfBirth, yearOfJoining) < 20)
			throw new InvalidJoiningDateException("Employee's age must be greater then 20 before joining");
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
		if (salary < 0)
			throw new NegativeSalaryException("Salary is never negative");
		this.salary = salary;
	}

	public void setEmpId(int empId) {
		if (empId <= 0)
			throw new NegativeEmpIdException("Employee id must be positive");
		this.empId = empId;
	}

	public void setDepartment(String department) {
		if (department == null)
			throw new EmptyFieldException();
		this.department = department;
	}

	public void setDateOfJoining(MyDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getAgeAtJoining(int yearOfBirth, int yearOfJoining) {
		return yearOfJoining - yearOfBirth;
	}

	@Override
	public String toString() {
		return "\n" + "Employee ID: " + empId + "\n" + super.toString() + "\n" + "Department: " + department + "\n"
				+ "Salary: " + salary + "\n" + "Date of Joining: " + dateOfJoining;
	}
}
