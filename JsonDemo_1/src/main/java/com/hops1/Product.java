package com.hops1;

public class Product {
	private String proId;
	private String proName;
	private String price;
	
	
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", price=" + price + "]";
	}
	
	

}
