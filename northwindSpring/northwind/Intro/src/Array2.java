
public class Array2 {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "�zmir";
		sehirler[0][2] = "Ankara";
		sehirler[1][0] = "Bursa";
		sehirler[1][1] = "�anakkale";
		sehirler[1][2] = "Ayd�n";
		sehirler[2][0] = "Kocaeli";
		sehirler[2][1] = "Sakarya";
		sehirler[2][2] = "Erzincan";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sehirler[i][j] + "\n");
			}
		}

	}

}
