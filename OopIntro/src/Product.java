
public class Product {
	
	public Product() {
		
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		//Baþlangýçtaki constructor'u çaðýrýr.
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
