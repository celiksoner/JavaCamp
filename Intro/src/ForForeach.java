
public class ForForeach {

	public static void main(String[] args) {
		
		String[] krediler = {"Hýzlý Kredi", "Konut Kredisi", "Tarým Kredisi", "Araç Kredisi"};
		
		//For Döngüsü
				for (int i = 0; i < krediler.length; i++) {
					System.out.println(krediler[i]);
				}
				
				//Foreach Döngüsü
				for (String kredi : krediler) {
					System.out.print(kredi + "\n");
				}

	}

}
