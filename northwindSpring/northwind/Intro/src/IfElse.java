
public class IfElse {

	public static void main(String[] args) {
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		

		System.out.print(internetSubeButonu + "\n");

		if (dolarBugun > dolarDun) {
			System.out.print("Dolar yükseliþte\n");
		} else if (dolarBugun < dolarDun) {
			System.out.print("Dolar düþüþte\n");
		} else {
			System.out.print("Dolar kuru ayný\n");
		}		
		
	}

}
