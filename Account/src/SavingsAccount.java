public class SavingsAccount extends Account implements Valuable{ 
 	//1년계약만 가능 
 	//계약 종료후 추가 이자없음, 출금만 가능 
 	//생성자를 통해 balance,interest 초기화 
  
 	 
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
 		//계약기간중에는 출금 불가 
 		//lab6 음수입력,한도초과에 대한 예외처리
 		if(month <12){ 
 		//	System.out.println("아직 출금할 수 없습니다."); 
 			throw new Exception("아직 출금할 수 없습니다.");
  
 		}else if(balance<amount){
 			throw new Exception("Debit amount excceded account balance.");
 		}else if(amount<0){
 			throw new Exception("음수입력!");
 		}else{ 
 			balance-=amount; 
 			return getBalance(); 
 		} 
 		 
 	}  
 	@Override 
 	public double getWithdrawableAccount(){ //출금가능한 금액 확인 
 		if(month <12){ 
 			return 0; 
 		}else{ 
 		return getBalance(); 
 		} 
 	} 
 	@Override 
 	public double passTime(int time){//해당기간이 지난후 이자 계산 
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
