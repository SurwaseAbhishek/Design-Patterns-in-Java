package designPatterns.StrategyDesignPattern.Couriertype;

public class BlueDart implements Courier{

	@Override
	public String deliverProduct() {
		return "Your Product is Deliver Through Blue Dart Service !!";
	}

}
