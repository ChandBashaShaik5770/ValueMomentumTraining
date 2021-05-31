package com.vm.session.assignment;

public class Product 
{
	private int productId;
	private String name;
	private String category;
	private int price;
	private int quantity;
	public Product(int productId, String name, String category, int price, int quantity) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	

}
