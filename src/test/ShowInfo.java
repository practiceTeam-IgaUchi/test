package test;

public class ShowInfo {
	public void showInfo(Myname account) {
		System.out.println("------------------");
		System.out.println("名前:" + account.getName());
		System.out.println("年齢:" + account.getAge());
		System.out.println("性格" + account.getPersonality());
		System.out.println("------------------");
	}
}
