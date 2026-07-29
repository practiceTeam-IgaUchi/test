package test;

import java.util.List;
import java.util.Scanner;

public class Search {
	public String searchIndex(List<Myname> data) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("一覧:");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + " : " + data.get(i).getName());
		}

		System.out.print("情報を表示する人を選んでください: ");
		String index = scanner.next();

		return index;
	}
}