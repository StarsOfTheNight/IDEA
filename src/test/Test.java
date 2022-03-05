package test;
public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		TravelStrategy s = new AirplaneStrategy();
		person.setStrategy(s);
        person.travel();
        System.out.println("--------------");
		s = new TrainStrategy();
		person.setStrategy(s);
		person.travel();
        System.out.println("--------------");
        s = new BicycleStrategy();
		person.setStrategy(s);
        person.travel();
	}

}
interface TravelStrategy{
	
	public void travel();
}
class AirplaneStrategy implements TravelStrategy{
	
	public void travel() {
		System.out.println("AirplaneStrategy被调用");
	}
}
class TrainStrategy implements TravelStrategy{
	
	public void travel() {
		System.out.println("TrainStrategy被调用");
	}
}
class BicycleStrategy implements TravelStrategy{
	
	public void travel() {
		System.out.println("BicycleStrategy 被调用");
	    
	}
}
class Person{
	
	private TravelStrategy strategy ;
	public void setStrategy(TravelStrategy strategy) {
		this.strategy=strategy;
	}
	public void travel(){
		
		strategy.travel();
		
	}
}
