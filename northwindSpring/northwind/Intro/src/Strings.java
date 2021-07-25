
public class Strings {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.print(mesaj);
		
		/*
		 * System.out.print("Eleman sayýsý: " + mesaj.length());
		 * System.out.println("5. Eleman: " + mesaj.charAt(4)); //Mesajýn sonuna ekleme
		 * yapar System.out.print(mesaj.concat("Yaþasýn")); //Verilen harf ile
		 * baþlýyorsa bool tipinde sonuç döndürür
		 * System.out.print(mesaj.startsWith("B"));
		 * System.out.print(mesaj.endsWith(".")); //Verilen index aralýðýný bir array'in
		 * içine yükler char[] karakterler=new char[5]; mesaj.getChars(0, 3,
		 * karakterler, 0); //Verilen karakterin kaçýncý index'te olduðunu bulur.
		 * System.out.print(mesaj.indexOf('a'));
		 * System.out.print(mesaj.lastIndexOf('a'));
		 */
		//Deðiþmesini istediðimiz kelimeyi veya harfi deðiþtirmek için kullanýrýz.
		String yeniMesaj = mesaj.replace('a', 'b');
		System.out.print(yeniMesaj);
		//Substring bir metnin içerisinden parça almak için kullanýlýr. Tek parametre ile verilenden sonrasýný
		//Ýki paramtetre verilirse aralýðýný alýr.
		System.out.print(mesaj.substring(5));
		
		//Verilen parametreyi gördüðü yerleri parçalar.
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//Bütün harfleri küçültme ve büyütme
		System.out.print(mesaj.toLowerCase());
		System.out.print(mesaj.toUpperCase());
		//Cümlenin baþýndaki ve sonundaki boþluklarý siler.
		System.out.print(mesaj.trim());


	}

}
