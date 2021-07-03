
public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo ThinkPad",1500,"8 GB Ram");

		
		Product product2 = new Product();
		product2.id=2;
		product2.name="HP EliteBook";
		product2.unitPrice=1300;
		product2.detail="16 GB Ram";
		
		Product product3 = new Product();
		product3.id=3;
		product3.name="Acer Aspire";
		product3.unitPrice=1200;
		product3.detail="12 GB Ram";
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Dizüstü Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Cep Telefonu";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
	}

}
