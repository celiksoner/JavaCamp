
public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.print("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.print("Çok güzel : Geçtiniz");
			break;
		case 'C':
			System.out.print("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.print("Fena Deðil : Geçtiniz");
			break;
		case 'F':
			System.out.print("Maalesef kaldýnýz.");
			break;
		default:
			System.out.print("Geçersiz not girdiniz");
		}

	}

}
