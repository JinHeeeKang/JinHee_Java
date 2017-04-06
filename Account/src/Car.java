
public class Car implements Valuable {
	public String name;
	public double price;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}

 	@Override 
	public double EstimateValue(int month){
 		if(month ==1){
 			return price*0.8; 
 		}else{
 			return price*0.99; 
 		}
 	}
 	public String toString(){
		return String.format("car name: %s \ninitial price: %.2f",name,price);
	}
}
