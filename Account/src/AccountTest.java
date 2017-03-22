import java.util.Scanner;
public class AccountTest {
	public static void main(String[] args){
		Account account1 = new Account(1,"account1");
		Account account2 = new Account(2,"account2");
		
		account1.credit();
		account2.credit();
		account1.print();
		account2.print();
		
		account1.debit();
		account1.print();
		account2.print();
		
		account2.debit();
		account1.print();
		account2.print();
		
		
	}

}
