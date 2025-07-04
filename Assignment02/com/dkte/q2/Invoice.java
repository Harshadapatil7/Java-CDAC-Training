package com.dkte.q2;

public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;

	// constructor
	public Invoice() {
		this("", "", 0, 0.0);
	}

	public Invoice(String number, String description, int quantity, double price) {
		this.number = number;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	// setters
	public void setNumber(String number) {
		this.number = number;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0)
			this.quantity = 0;
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		if (price < 0)
			this.price = 0.0;
		this.price = price;
	}

	// getters
	public String getNumber() {
		return number;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	// calculate invoice
	public double calculateInvoice() {
		return quantity * price;
	}

	public void displayInvoice() {
		System.out.println("Invoice");
		System.out.println("Part no: " + number);
		System.out.println("Description: " + description);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		System.out.print("Total Price: ");
	}
}
