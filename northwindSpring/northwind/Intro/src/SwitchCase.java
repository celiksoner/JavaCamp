
public class SwitchCase {

	public static void main(String[] args) {

		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.print("M�kemmel : Ge�tiniz");
			break;
		case 'B':
			System.out.print("�ok g�zel : Ge�tiniz");
			break;
		case 'C':
			System.out.print("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.print("Fena De�il : Ge�tiniz");
			break;
		case 'F':
			System.out.print("Maalesef kald�n�z.");
			break;
		default:
			System.out.print("Ge�ersiz not girdiniz");
		}

	}

}
