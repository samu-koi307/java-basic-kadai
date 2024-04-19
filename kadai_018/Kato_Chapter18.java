package kadai_018;

abstract public class Kato_Chapter18 {

	String familyName = "加藤";//性
	String givenName;//名
	String address = "東京都中野区〇×/住所";

	public void commonlntroduce() {//共通
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	abstract void eachlntduce();//個別

	public void execlntroduce() {//紹介

		commonlntroduce();
		eachlntduce();
		System.out.println();
	}

}
