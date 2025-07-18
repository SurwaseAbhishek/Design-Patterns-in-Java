package designPatterns.StrategyDesignPattern.Couriertype;

public class Delhivery implements Courier{

	@Override
	public String deliverProduct() {
		return "Your Product is Deliver Through Delhivery Service !!";
	}

}
