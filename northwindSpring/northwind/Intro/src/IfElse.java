
public class IfElse {

	public static void main(String[] args) {
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		

		System.out.print(internetSubeButonu + "\n");

		if (dolarBugun > dolarDun) {
			System.out.print("Dolar y�kseli�te\n");
		} else if (dolarBugun < dolarDun) {
			System.out.print("Dolar d����te\n");
		} else {
			System.out.print("Dolar kuru ayn�\n");
		}		
		
	}

}
