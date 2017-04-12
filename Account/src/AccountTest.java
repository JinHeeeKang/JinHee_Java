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
			System.out.println("���ܹ߻� : ���ڸ� �Է��ϼ���\n"+ e.toString());
		}catch(Exception e){
			System.out.println("���ܹ߻�    "+ e.toString());
		}finally{
			account1.passTime(2);
			System.out.printf("2 month later Account1 : $"+account1.getBalance());
		}
			
		
	}
}
		
		/*
		 //CheckingAccount
		System.out.printf("Account1 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
		
		System.out.println("Enter withdrawal amount for Account1:");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
		if(((CheckingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		}//�Ļ꿩��Ȯ��1
		//isBankrupt �̿� - typecasting ���
		
		account1.passTime(1);
		System.out.printf("Account1 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
	
		if(((CheckingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		} //�Ļ꿩��Ȯ��2
		
		account1.passTime(5);
		System.out.printf("Account1 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account1.getBalance()
				,account1.getWithdrawableAccount());
		
		if(((CheckingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		} //�Ļ꿩��Ȯ��3
		
		
		//SavingAccount
		System.out.println();
		System.out.printf("Account2 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		account2.debit(50);
	
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account2 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance: $ %.2f \t ������ݰ��ɾ�: %.2f\n",account2.getBalance()
				,account2.getWithdrawableAccount());
	
	}
*/
