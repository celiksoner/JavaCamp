package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("�r�n eklendi.");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
		
	}
}
