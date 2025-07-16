package designPatterns.BuilderDesignPattern.ProductBuilder;

public class House implements HousePlan {
	private String basement;
	private String piller;
	private String roofing;
	private String interior;


	@Override
	public void setInterior(String basement) {
		this.basement=basement;
	}

	@Override
	public void setBasement(String piller) {
		this.piller=piller;
	}

	@Override
	public void setRoofing(String roofing) {
		this.roofing=roofing;
	}

	@Override
	public void setPiller(String interior) {
		this.interior=interior;
	}

	@Override
	public String toString() {
		return "House [basement=" + basement + ", piller=" + piller + ", roofing=" + roofing + ", interior=" + interior + "]";
	}

	
}
