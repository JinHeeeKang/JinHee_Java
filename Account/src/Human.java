
public class Human implements Valuable{
	public String name;
	public int age;
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
/*	
	public double getValuable(){
		return Double.POSITIVE_INFINITY;
	}*/
	@Override 
	public double EstimateValue(int month){
 		return Double.POSITIVE_INFINITY;
 }
	public String toString(){
		return String.format("human name: %s \nregistered age: %d",name,age);
	}
	
}