package day06;

public class SmartTv extends Product{
	
	String resolution;
	
	public SmartTv(String pname, int price, String resolution) {
		this.pname= pname;
		this.price = price;
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사: " + resolution);
		
	}
	

}
