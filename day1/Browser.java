package week2.day1;

public class Browser {

	
	public void launchBrowser() {
		System.out.println(" launched Successfully");
		
	}
	public void loadUrl() {
		System.out.println(" Url loaded successfully");
	}
	
public static void main(String[] args) {
	
	Browser browser1 = new Browser();
	browser1.launchBrowser ();
	browser1.loadUrl ();
		
	}
}
