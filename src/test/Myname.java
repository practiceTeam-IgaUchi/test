package test;

import java.util.Scanner;

public class Myname {
	private String name;
	private Scanner scanner = new Scanner(System.in);

	public void inputName() {
		System.out.print("名前を入力: ");
		this.name = scanner.nextLine();
	}

	public void printName() {
		System.out.println("こんにちは、" + this.name + "さん！");
	}

}