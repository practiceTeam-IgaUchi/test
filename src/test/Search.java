package test;

import java.util.List;
import java.util.Scanner;

public class Search {

	public int searchIndex(List<MyName> data) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("一覧:");
		for (int i = 0; i < data.length; i++) {
			System.out.println(i + " : " + data[i].getName());
		}

		System.out.print("選んでください: ");
		int index = scanner.nextInt();

		scanner.close();

		return index;
	}
}