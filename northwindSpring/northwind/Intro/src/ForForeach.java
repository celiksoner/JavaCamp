
public class ForForeach {

	public static void main(String[] args) {
		
		String[] krediler = {"H�zl� Kredi", "Konut Kredisi", "Tar�m Kredisi", "Ara� Kredisi"};
		
		//For D�ng�s�
				for (int i = 0; i < krediler.length; i++) {
					System.out.println(krediler[i]);
				}
				
				//Foreach D�ng�s�
				for (String kredi : krediler) {
					System.out.print(kredi + "\n");
				}

	}

}
