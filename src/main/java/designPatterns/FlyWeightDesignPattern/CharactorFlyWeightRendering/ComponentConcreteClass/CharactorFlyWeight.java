package designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ComponentConcreteClass;

import designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ComponentInterface.Charactor;

public class CharactorFlyWeight implements Charactor {
	private int fontSize;
	private String fontFamily;
	private String fontColor;
	private Character fontSymbol;

	public CharactorFlyWeight(int fontSize,String fontFamily,String fontColor,Character fontSymbol) {
		this.fontSize = fontSize;
		this.fontFamily = fontFamily;
		this.fontColor = fontColor;
		this.fontSymbol = fontSymbol;
	}
	
	@Override
	public void draw(int x, int y) {
		System.out.println("Below charcator is Render with fonr Detail :");
		System.out.println("fontSize : "+fontSize+"  fontFamily : "+fontFamily+" fontColor : "+fontColor+"    fontSymbol : "+fontSymbol+"      With "+ x +" "+ y +" dimesion");
	}

}
