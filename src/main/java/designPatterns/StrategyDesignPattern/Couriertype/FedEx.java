package designPatterns.StrategyDesignPattern.Couriertype;

public class FedEx implements Courier{

	@Override
	public String deliverProduct() {
		return "Your Product is Deliver Through FedEx Service !!";
	}

}
