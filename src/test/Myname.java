package test;

import java.util.Scanner;

public class Myname {

	// ① 受け取り口（すべて String に統一！）
	private String name;
	private String age;
	private String personality;

	private Scanner scanner = new Scanner(System.in);

	// ゲッター・セッター（名前）
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ゲッター・セッター（年齢）
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	// ゲッター・セッター（性格）
	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	// ② 処理（受け取りメソッド）
	public void inputProfile() {

		// 名前の入力処理
		System.out.print("名前を入力: ");
		String inputName = scanner.next();
		setName(inputName);

		// 年齢の入力処理
		System.out.print("年齢を入力: ");
		String inputAge = scanner.next();
		while (!inputAge.matches("\\d+")) {
			System.out.print("年齢は何歳ですか？（数字で入力してください）: ");
			inputAge = scanner.next();
		}
		setAge(inputAge);
		// 性格の入力処理
		System.out.print("性格を入力: ");
		String inputPersonality = scanner.next();
		setPersonality(inputPersonality);
	}

}