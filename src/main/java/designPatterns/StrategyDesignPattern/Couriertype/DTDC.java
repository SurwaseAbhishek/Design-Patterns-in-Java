package designPatterns.StrategyDesignPattern.Couriertype;

public class DTDC implements Courier{

	@Override
	public String deliverProduct() {
		return "Your Product is Deliver Through DTDC Service !!";
	}

}
