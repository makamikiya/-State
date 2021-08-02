
public class SingletonTest {

	public static void main(String[] args) {
		Renban renbanA = Renban.getinstance();
		Renban renbanB = Renban.getinstance();
		//Renban renbanc = new Renban();
		//System.out.println(renbanc.getNumber());
		//System.out.println(renbanc.getNumber());
		//System.out.println(renbanA.getNumber());
		//System.out.println("****");
		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());
	}
}
