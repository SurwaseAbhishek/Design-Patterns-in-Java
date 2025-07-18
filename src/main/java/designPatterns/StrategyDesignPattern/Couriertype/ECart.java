package designPatterns.StrategyDesignPattern.Couriertype;

public class ECart implements Courier{

	@Override
	public String deliverProduct() {
		return "Your Product is Deliver Through ECart Service !!";
	}

}
