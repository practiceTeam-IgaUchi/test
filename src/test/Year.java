package test;

import java.util.Scanner;

public class Year {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("生まれた年を入力してください:");
		int year = scan.nextInt();
		System.out.println("生まれた月を教えてください:");
		int month = scan.nextInt();
		System.out.println("生まれた日を入力してください:");
		int day = scan.nextInt();
		System.out.println("あなたの生年月日は" + year + "年" + month + "月" + day + "日です");

		scan.close();
	}
}
