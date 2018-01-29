public class HydrogenMovement extends Movement {

	@Override
	public void forward() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("シュウィーン「前進します」");
	}

	@Override
	public void back() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("シュッ「バックします」");
	}

	@Override
	public void turn(Boolean side) {
		// TODO 自動生成されたメソッド・スタブ
		if(side) {
			System.out.println("シュッ「右に曲がります」");
		}else {
			System.out.println("シュッ「左に曲がります」");
		}
	}

}
