public class SavingsAccount extends Account implements Valuable{ 
 	//1���ุ ���� 
 	//��� ������ �߰� ���ھ���, ��ݸ� ���� 
 	//�����ڸ� ���� balance,interest �ʱ�ȭ 
  
 	 
 	private double balance; 
 	private double interest; 
 	public int month=0; 
 	 
 	public SavingsAccount(double balance, double interest){ 
 		super(balance); 
 		this.balance = balance; 
 		this.interest = interest; 
 	} 
 	public double getBalance(){ 
 		return balance; 
 	} 
 	public double debit(double amount)throws Exception { 
 		//���Ⱓ�߿��� ��� �Ұ� 
 		//lab6 �����Է�,�ѵ��ʰ��� ���� ����ó��
 		if(month <12){ 
 		//	System.out.println("���� ����� �� �����ϴ�."); 
 			throw new Exception("���� ����� �� �����ϴ�.");
  
 		}else if(balance<amount){
 			throw new Exception("Debit amount excceded account balance.");
 		}else if(amount<0){
 			throw new Exception("�����Է�!");
 		}else{ 
 			balance-=amount; 
 			return getBalance(); 
 		} 
 		 
 	}  
 	@Override 
 	public double getWithdrawableAccount(){ //��ݰ����� �ݾ� Ȯ�� 
 		if(month <12){ 
 			return 0; 
 		}else{ 
 		return getBalance(); 
 		} 
 	} 
 	@Override 
 	public double passTime(int time){//�ش�Ⱓ�� ������ ���� ��� 
 		month +=time; 
 		if(month == 12){ 
 			balance = balance * (Math.pow((1+interest),month)); 
 			return getBalance(); 
 		}else{ 
 			return getBalance(); 
 		} 	 
 	} 
	public String toString(){
		return String.format("SavingsAccount_Balance: %.2f",balance);
	}
 	@Override 
	public double EstimateValue(int month){
 		return  balance * (Math.pow((1+interest),month));
 	}
 	
 	
 	 
 } 
