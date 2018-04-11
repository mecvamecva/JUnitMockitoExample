package br.inatel.ec.ec206.example.report;

public class Product {

	private String name;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product withName(String name) {
		setName(name);
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product withQuantity(int quantity) {
		setQuantity(quantity);
		return this;
	}

}
