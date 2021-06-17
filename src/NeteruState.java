class NeteruState extends DogState{
	private static NeteruState s = new NeteruState();
	private NeteruState() {}

	public static DogState getInstance() {
		return s;
	}

	public void okita(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
	}
	public void nemoi(Dog moto) {
		//なにも市内
	}
	public String toString() {
		return"寝ている状態";
	}

	@Override
	public void tukareta(Dog yobidashimoto) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void tabeta(Dog yobidashimoto) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
