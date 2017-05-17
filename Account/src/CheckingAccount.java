public class CheckingAccount extends Account  implements Valuable{ 
 	 
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
 	/*
 	public double credit(double amount){
 		
 		return 
 	}
 	*/
 	
 	@Override 
 	public double debit(double amount) throws Exception { 
  //������ �̷����������
 		if(balance<amount){
 			throw new Exception("Debit amount excceded account balance.");
 		}else if(amount<0){
 			throw new Exception("�����Է�!");
 		}else{
 		balance -= amount; 
 		return balance; 
 		} 
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
 	@Override
 	public double passTime(){
 		balance +=  balance * (1*Math.pow(loanInterest,1)); 
 		return getBalance(); 
 	}
 	boolean isBankrupted(){//���� �ݾ��� �Ļ�(���Ⱑ�ɾ��� �ʰ�)�ߴ��� Ȯ��  
 		if(getBalance()<-50){ 
 			return false ; 
 		}else{ 
 			return true ; 
 		} 
 	} 
 	public String toString(){
		return String.format("CheckingAccount_Balance: %.2f",balance);
	}
	@Override 
	public double EstimateValue(int month){
 		return balance + ((balance*interest)*month) ;
 	}
	@Override
	public double EstimateValue(){
		return balance + ((balance*interest)*1) ;
	}
 		 
 } 
