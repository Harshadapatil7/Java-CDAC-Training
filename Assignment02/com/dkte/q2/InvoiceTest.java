package com.dkte.q2;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();

		invoice.setNumber("p1");
		invoice.setDescription("part 1");
		invoice.setQuantity(5);
		invoice.setPrice(55.4);

		invoice.displayInvoice();
		double totalPrice = invoice.calculateInvoice();
		System.out.println(totalPrice);
	}

}
