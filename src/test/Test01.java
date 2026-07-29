package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class Test01 {
	public static void main(String[] args) {
		SearchIndex search = new SearchIndex();
		ShowInfo show = new ShowInfo();
		Scanner scan = new Scanner(System.in);
		
		String command = "";
		
		List<MyName> accounts = new ArrayList<>();
		
		accouts.add(new MyName("吉永歩", 0, "非常に温厚"));
		
		List<String> numberList = new ArrayList<>();
		numberList.add("0");
		numberList.add("1");
		numberList.add("2");
		numberList.add("3");
		numberList.add("4");
		
		
		System.out.println("個人情報管理システム");
		
		while (true) {
			System.out.println("----------------");
			System.out.println("0：終了");
			System.out.println("1：新規登録");
			System.out.println("2：データ修正");
			System.out.println("3：検索表示");
			System.out.println("4：全件表示");
			System.out.println("----------------");
			
			System.out.print("タスクを値で入力してください→");
			command = scan.next();
			
			if (numberList.contains(command) {
				System.out.println("不正な値です");
				System.out.println("0-4の値で入力してください");
				continue;
			}
			
			switch (command) {
				case "0" :
					System.out.println("システムを終了します");
					scan.close();
					return;
					
				case "1":
					System.out.println("新規登録");
					accounts.add(new MyName());
					
				case "2": //
					System.out.println("データ修正");
					int index = search.searchIndex();
					
					System.out.println(accounts[index] + "のどの情報を修正しますか？");
					
					System.out.println("----------------");
					System.out.println("0：名前");
					System.out.println("1：年齢");
					System.out.println("2：性格");
					System.out.println("----------------");
					
					System.out.print("修正項目を整数値で入力してください→");
					String option = scan.next();
					
					switch (option) {
					case "0" :
						System.out.println("名前修正");
						System.out.print("名前を入力してください→");
						String name = scan.next();
						accounts[index].setName(name);
						
						break;
						
					case "1":
						System.out.println("年齢修正");
						System.out.print("年齢を入力してください→");
						String age = scan.next();
						accounts[index].setAge(age);
						
						break;
					
					case "2":
						System.out.println("性格修正");
						System.out.print("性格を入力してください→");
						String personality = scan.next();
						accounts[index].setPersonality(personality);
						
						break;
					
				case "3":
					System.out.println("検索表示");
					int index1 = search.searchIndex();
					
					show.showInfo(accounts[index1]);
					
				case "4":
					System.out.println("全件表示");
					for (MyName account : accounts) {
						show.showInfo(account)
					}
			}
		}
		                 
	}
}
