package designPatterns.FlyWeightDesignPattern.CharactorFlyWeightRendering.ClientApplication;


public class ClientApp {
	public static void main(String[] args) {
		TextEditor text = new TextEditor();
		String str= "Hello";
		for(int i=0;i<str.length();i++){
			text.addCharctor(10, 20,5,"Arial", "Green", str.charAt(i));
		}
		text.RenderingCharctor();

	}
}
