
public class Array {

	public static void main(String[] args) {

		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total += number;
		}
		System.out.print("En b�y�k say�: " + max);
		System.out.print("\nSay�lar�n toplam�: " + total);

	}

}
