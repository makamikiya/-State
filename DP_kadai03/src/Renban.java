
public class Renban {

	private static Renban renban = new Renban();
	int number;
	private Renban() {
		number = 1;
	}
	public static Renban getinstance() {
		return renban;
	}
	public String getNumber() {
		String str = String.format("%04d",number);
		number++;
		return str;
	}
}
