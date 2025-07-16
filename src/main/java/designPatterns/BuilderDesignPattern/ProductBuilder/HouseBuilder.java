package designPatterns.BuilderDesignPattern.ProductBuilder;

public interface HouseBuilder {
	
	public void builtBasement();
	public void builtInterior();
	public void builtPiller();
	public void builtRoofing();
	
	public House getHouse();
}
