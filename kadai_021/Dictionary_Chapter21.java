package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void seachWord() {

		HashMap<String, String> fruitoMap = new HashMap<String, String>();

		fruitoMap.put("apple", "りんご");
		fruitoMap.put("peach", "桃");
		fruitoMap.put("banana", "バナナ");
		fruitoMap.put("lemon", "レモン");
		fruitoMap.put("pear", "梨");
		fruitoMap.put("kiwi", "キウイ");
		fruitoMap.put("strawberry", "いちご");
		fruitoMap.put("grape", "ぶどう");
		fruitoMap.put("muscat", "マスカット");
		fruitoMap.put("cherry", "さくらんぼ");

		String[] wordArray = { "apple", "banana", "grape", "orange" };

		for (int i = 0; i < wordArray.length; i++)

			if (fruitoMap.containsKey(wordArray[i])) {
				System.out.println(wordArray[i] + "の意味は" + fruitoMap.get(wordArray[i]));
			} else {
				System.out.println(wordArray[i] + "は辞書に存在しません");
			}
	}
}
