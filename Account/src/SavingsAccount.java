
public class SavingsAccount extends Account{
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
	public double debit(double amount){
		//���Ⱓ�߿��� ��� �Ұ�
		if(month <12){
			System.out.println("���� ����� �� �����ϴ�.");
			return 0;
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
	
}