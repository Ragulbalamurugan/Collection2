package Collection2;

public class Bike {
	private String brand;
	private int price;
	private String color;
	private String module;
	private int cc;
	private String noPlate;

	public Bike(String brand, int price, String color, String module, int cc, String noPlate) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.module = module;
		this.cc = cc;
		this.noPlate = noPlate;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getNoPlate() {
		return noPlate;
	}

	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}



	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", color=" + color + ", module=" + module + ", cc=" + cc
				+ ", noPlate=" + noPlate + "]";
	}

	
	
	
	}
