import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);

		Scanner scan = new Scanner(System.in);
		double amount;
		
		try{
			System.out.println("Enter deposit amount for Account1:");
			amount = scan.nextDouble();
			account1.debit(amount);
			System.out.printf("Account1 balance: $"+account1.getBalance()+"\n");
			
			
			System.out.println("Enter deposit amount for Account2:");
			amount = scan.nextDouble();
			account2.debit(amount);
			System.out.printf("Account2 balance: $"+account2.getBalance());
		}catch(InputMismatchException e){
			System.out.println("예외발생 : 숫자를 입력하세요\n"+ e.toString());
		}catch(Exception e){
			System.out.println("예외발생    "+ e.toString());
		}finally{
			account1.passTime(2);
			System.out.printf("2 month later Account1 : $"+account1.getBalance());
		}
			
		
	}
}
		
		/*
		 //CheckingAccount
		System.out.printf("Account1 balance: $ %.2f \t 현재출금가능액: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
		
		System.out.println("Enter withdrawal amount for Account1:");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f \t 현재출금가능액: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		}//파산여부확인1
		//isBankrupt 이용 - typecasting 사용
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f \t 현재출금가능액: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
	
		if(((CheckingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		} //파산여부확인2
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f \t 현재출금가능액: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
		
		if(((CheckingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		} //파산여부확인3
		
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $ %.2f \t 현재출금가능액: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t 현재출금가능액: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		account2.debit(50);
	
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t 현재출금가능액: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f \t 현재출금가능액: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $ %.2f \t 현재출금가능액: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
	
	}
*/
