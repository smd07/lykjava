package tr.org.linux.kamp.account;

public class AccountApp {

	public static void main(String[] args) {

		Account myAc1 = new Account("isim", 122);
		myAc1.deposit(222);
		System.out.println(myAc1.getBalance() + "  " + myAc1.getName());

	}

}
