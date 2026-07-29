package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Search search = new Search();
		ShowInfo show = new ShowInfo();
		Scanner scan = new Scanner(System.in);

		String command = "";

		List<Myname> accounts = new ArrayList<>();

		accounts.add(new Myname("吉永歩", "0", "非常に温厚"));
		accounts.add(new Myname("内田りょう", "24", "穏やか"));
		accounts.add(new Myname("野口柊大", "19", "？"));

		List<String> checkList01 = new ArrayList<>();
		checkList01.add("0");
		checkList01.add("1");
		checkList01.add("2");
		checkList01.add("3");
		checkList01.add("4");

		List<String> checkList02 = new ArrayList<>();
		checkList01.add("0");
		checkList01.add("1");
		checkList01.add("2");

		System.out.println("個人情報管理システム");

		while (true) {
			System.out.println("=====タスク一覧=====");
			System.out.println("0：終了");
			System.out.println("1：新規登録");
			System.out.println("2：データ修正");
			System.out.println("3：検索表示");
			System.out.println("4：全件表示");
			System.out.println("==================");

			System.out.print("タスクを値で入力してください→");
			command = scan.next();

			if (!checkList01.contains(command)) {
				System.out.println("不正な値です");
				System.out.println("0-4の値で入力してください");
				continue;
			}

			switch (command) {
			case "0":
				System.out.println("システムを終了します");
				scan.close();
				return;

			case "1":
				System.out.println("新規登録");
				accounts.add(new Myname());
				System.out.println("完了");
				break;

			case "2":
				System.out.println("データ修正");
				String StringIndex = search.searchIndex(accounts);
				int index = Integer.parseInt(StringIndex);

				System.out.println(accounts.get(index).getName() + "どの情報を修正しますか？");

				System.out.println("----------------");
				System.out.println("0：名前");
				System.out.println("1：年齢");
				System.out.println("2：性格");
				System.out.println("----------------");

				System.out.print("修正項目を値で入力してください→");
				String option = scan.next();

				if (!checkList02.contains(command)) {
					System.out.println("不正な値です");
					System.out.println("0-2の値で入力してください");
					continue;
				}

				switch (option) {
				case "0":
					System.out.println("名前修正");
					System.out.print("名前を入力してください→");
					String name = scan.next();
					accounts.get(index).setName(name);
					System.out.println("完了");

					break;

				case "1":
					System.out.println("年齢修正");
					System.out.print("年齢を入力してください→");
					String age = scan.next();
					accounts.get(index).setAge(age);
					System.out.println("完了");

					break;

				case "2":
					System.out.println("性格修正");
					System.out.print("性格を入力してください→");
					String personality = scan.next();
					accounts.get(index).setPersonality(personality);
					System.out.println("完了");

					break;
				}
				break;

			case "3":
				System.out.println("検索表示");
				String StringIndex01 = search.searchIndex(accounts);
				int index01 = Integer.parseInt(StringIndex01);

				show.showInfo(accounts.get(index01));
				break;

			case "4":
				System.out.println("全件表示");
				for (Myname account : accounts) {
					show.showInfo(account);
				}
			}
		}
	}

}