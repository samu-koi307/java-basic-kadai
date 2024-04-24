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

		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			scanner.close();
		} else {
			getMyChoice();
		}

		return input;
	}

	public String getRandom() {//相手のじゃんけん

		String junken[] = { "r","s","p" };
		int num = (int) (Math.floor(Math.random() * (junken.length)));
		String output = junken[num];
		return output;

	}

	public void playGame() {//じゃんけんを行う

		HashMap<String, String> judMap = new HashMap<String, String>();

		judMap.put("r", "グー");
		judMap.put("s", "チョキ");
		judMap.put("p", "パー");

		String myChoice = getMyChoice();
		String choice = getRandom();

		System.out.println("自分の手は" + judMap.get(myChoice) + ",対戦相手の手は" + judMap.get(choice));

		if (myChoice.equals(choice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && choice.equals("s")) ||
				(myChoice.equals("s") && choice.equals("p")) ||
				(myChoice.equals("p") && choice.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
			;
		}
	}
}
