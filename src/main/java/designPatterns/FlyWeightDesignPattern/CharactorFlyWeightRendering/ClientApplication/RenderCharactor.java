package designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ClientApplication;

import designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ComponentConcreteClass.CharactorFlyWeight;

public class RenderCharactor {
	private final CharactorFlyWeight glymph;
	private int x,y;
	
	public RenderCharactor(CharactorFlyWeight glymph,int x,int y) {
		this.glymph = glymph;
		this.x=x;
		this.y=y;
	}
	
	public void render() {
		glymph.draw(x, y);
	}
}
