package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {//自分のじゃんけん
		System.out.println("自分なじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		while (true) {
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
			} else {
				System.out.println("r s pのどれかを入れてください");
				input = scanner.next();
			}
			return input;
		}
	}

	public String getRandom() {//相手のじゃんけん

		String junken[] = { "r", "s", "p" };
		int num = (int) (Math.floor(Math.random() * (junken.length)));
		String output = junken[num];
		return output;

	}

	public void playGame(String user, String you) {//じゃんけんを行う

		HashMap<String, String> judMap = new HashMap<String, String>();

		judMap.put("r", "グー");
		judMap.put("s", "チョキ");
		judMap.put("p", "パー");

		System.out.println("自分の手は" + judMap.get(user) + ",対戦相手の手は" + judMap.get(you));

		if (user.equals(you)) {
			System.out.println("あいこです");
		} else if ((user.equals("r") && you.equals("s")) ||
				(user.equals("s") && you.equals("p")) ||
				(user.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
			;
		}
	}
}
