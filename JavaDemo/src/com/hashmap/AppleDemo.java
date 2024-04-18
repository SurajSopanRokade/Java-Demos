package com.hashmap;

public class AppleDemo {
	int price;
    String type;
    
	@Override
	public String toString() {
		return "AppleDemo [price=" + price + ", type=" + type + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AppleDemo(int price, String type) {
		super();
		this.price = price;
		this.type = type;
	}

	public AppleDemo() {
		super();
	}
	@Override
	public int hashCode() {
		System.out.println("In Hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		//System.out.println(result);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppleDemo other = (AppleDemo) obj;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
