
public class Obliczenia {
	private int liczba;

	public int getLiczba() {
		return liczba;
	}

	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}

	public Obliczenia(int liczba) {
		this.liczba = liczba;
	}
	
	public void funkcja() {
		int i = 1;
		
		while(i <= liczba) {
			if(liczba % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
