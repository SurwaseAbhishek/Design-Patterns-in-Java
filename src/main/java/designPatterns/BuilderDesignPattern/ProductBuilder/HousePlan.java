package designPatterns.BuilderDesignPattern.ProductBuilder;

public interface HousePlan {
	public void setInterior(String interior);
	public void setBasement(String interior);
	public void setRoofing(String interior);
	public void setPiller(String interior);

}
