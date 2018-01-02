import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int liczba = in.nextInt();
		
		Obliczenia obl = new Obliczenia(liczba);
		
		obl.funkcja();
		
		in.close();
		
	}
}
