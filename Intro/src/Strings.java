
public class Strings {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel";
		System.out.print(mesaj);
		
		/*
		 * System.out.print("Eleman say�s�: " + mesaj.length());
		 * System.out.println("5. Eleman: " + mesaj.charAt(4)); //Mesaj�n sonuna ekleme
		 * yapar System.out.print(mesaj.concat("Ya�as�n")); //Verilen harf ile
		 * ba�l�yorsa bool tipinde sonu� d�nd�r�r
		 * System.out.print(mesaj.startsWith("B"));
		 * System.out.print(mesaj.endsWith(".")); //Verilen index aral���n� bir array'in
		 * i�ine y�kler char[] karakterler=new char[5]; mesaj.getChars(0, 3,
		 * karakterler, 0); //Verilen karakterin ka��nc� index'te oldu�unu bulur.
		 * System.out.print(mesaj.indexOf('a'));
		 * System.out.print(mesaj.lastIndexOf('a'));
		 */
		//De�i�mesini istedi�imiz kelimeyi veya harfi de�i�tirmek i�in kullan�r�z.
		String yeniMesaj = mesaj.replace('a', 'b');
		System.out.print(yeniMesaj);
		//Substring bir metnin i�erisinden par�a almak i�in kullan�l�r. Tek parametre ile verilenden sonras�n�
		//�ki paramtetre verilirse aral���n� al�r.
		System.out.print(mesaj.substring(5));
		
		//Verilen parametreyi g�rd��� yerleri par�alar.
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//B�t�n harfleri k���ltme ve b�y�tme
		System.out.print(mesaj.toLowerCase());
		System.out.print(mesaj.toUpperCase());
		//C�mlenin ba��ndaki ve sonundaki bo�luklar� siler.
		System.out.print(mesaj.trim());


	}

}
