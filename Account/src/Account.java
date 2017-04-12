import java.util.Scanner;
public abstract class Account {

public int num;
public String name;
private double balance;

public Account(double balance){
	this.balance = balance;
}

public double getBalance(){
	return balance;
}
/*
public double setBalance(){
	return balance;
}//잔액수정
public void credit(){
	System.out.printf("input money to %s:",name);
	Scanner input = new Scanner(System.in);
	double money = input.nextDouble();
	balance += money;
}
	public void debit(double amount){
		System.out.printf("\n");
		System.out.printf("Enter withdrawal amount for %s:",name);	
		
		//Scanner input = new Scanner(System.in);
		//double money = input.nextDouble();
		if(balance<amount){
			System.out.printf("subtracting %.2f from %s balance",amount,name);
			System.out.printf("There's no Balance\n");
		}else{
			balance -= amount;
			System.out.printf("subtracting %.2f from %s balance\n",amount,name);
		
		}
	}
*/
	public double debit(double amount){
		if(getBalance()<amount){
			System.out.println("금액이 너무 큽니다");
			return getBalance();
		}else{
			balance -= amount;
			return getBalance();
		}
	}


	public double getWithdrawableAccount(){ //출금가능한 금액 확인
		return getBalance();
	}
	
	public double passTime(int month){//해당기간이 지난후 이자 계산
		return balance;
	}
}