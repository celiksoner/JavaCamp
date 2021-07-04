
public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo ThinkPad",1500,"8 GB Ram",10);

		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Acer Aspire");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(15);
		product2.setUnitPrice(14000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Product product3 = new Product();
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			//System.out.println(product.name);
		}
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Dizüstü Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Cep Telefonu");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
	}

}
