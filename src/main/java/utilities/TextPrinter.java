package utilities;

public class TextPrinter {
	public static final String ANSI_RESET    = "\u001B[0m";
    public static final String ANSI_BOLD     = "\u001B[1m";
    public static final String ANSI_UNDERLINE= "\u001B[4m";
    
	public static void main(String[] args) {
		String text = "Hey Abhishek";
		System.out.println(ANSI_BOLD + text + ANSI_BOLD);
        System.out.println(ANSI_UNDERLINE + text + ANSI_UNDERLINE);
        System.out.println(ANSI_RESET + text + ANSI_RESET);	}
}
