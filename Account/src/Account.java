import java.util.Scanner;
public class Account {

public int num;
public String name;

public Account(int num,String name){
	this.num = num;
	this.name = name;	
}

public double accountBalance = 0;
public void credit(){
	System.out.printf("input money to %s:",name);
	Scanner input = new Scanner(System.in);
	double money = input.nextDouble();
	accountBalance += money;
	
}
	public void debit(){
		System.out.printf("\n");
		System.out.printf("Enter withdrawal amount for %s:",name);
		
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		accountBalance -= money;
		// System.out.printf("There's too much money to withdraw. Enter again. \n");
		
		if(accountBalance<0){
			accountBalance=0;
		}
		System.out.printf("subtractoing %.2f from %s balance",money,name);
		System.out.printf("\n");
	}

 	public void print(){
 	System.out.printf("%s balance:$%.2f",name,accountBalance);
 	System.out.printf("\n");
}
 
}
