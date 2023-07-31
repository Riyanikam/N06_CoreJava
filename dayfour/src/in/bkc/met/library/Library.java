//program to demostate the Aecess specifer
package in.bkc.met.library;

public class Library {
	//differnt Aecess specifier
	public String LibraryName;
	private long userId;
	String BookName;
	
	
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name"+LibraryName);
	}
	private void displayPrivate(){
		System.out.println("user id"+userId);
		
	}
	void displayDefault() {
		System.out.println("BookName is"+BookName);
	}

}
