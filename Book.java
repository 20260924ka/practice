public class Book extends TangibleAsset{
	private String number;
	public Book(String name,int price, String color,String number) {
		super(name,price,color);
		this.number = number;
	}
	public String getIsdn() {return this.number;}

}
