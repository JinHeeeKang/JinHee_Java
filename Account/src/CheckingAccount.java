//import java.util.Scanner;

public class CheckingAccount extends Account{
	
	private int creditLimit;
	private double interest;
	private double loanInterest;
	private double balance;
	
	public CheckingAccount(double balance,int creditLimit,double interest,double loanInterest) {
		super(balance);
		this.balance = balance;
		this.creditLimit = creditLimit; 
		this.interest =interest;
		this.loanInterest = loanInterest;	
	}

	public double getBalance(){
		return balance;
	}
	@Override
	public double debit(double amount){

		balance -= amount;
		return balance;
	}

	@Override
	public double getWithdrawableAccount(){ //��ݰ����� �ݾ� Ȯ��
		if(getBalance()+creditLimit<0){
			return 0;
		}else{
		return getBalance()+creditLimit;
		}
	}
	@Override
	public double passTime(int month){//�ش�Ⱓ�� ������ ���� ���
		
		balance +=  balance * (month*Math.pow(loanInterest,1));
		return getBalance();
	}
	boolean isBankrupted(){//���� �ݾ��� �Ļ�(���Ⱑ�ɾ��� �ʰ�)�ߴ��� Ȯ�� 
		
		if(getBalance()<-50){
			return false ;
		}else{
			return true ;
		}
	}
		
}


