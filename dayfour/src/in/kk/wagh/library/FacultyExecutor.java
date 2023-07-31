package in.kk.wagh.library;
import in.bkc.met.library.Library;


public class FacultyExecutor {

	public static void main(String[] args) {
		Library l=new Library();
		l.LibraryName="Bhujbul library";
		l.displayPublic();
		
	/* userId and displayPrivate method is private,so we can access into another package or class
	 * only we can access inside the same class*/	
	 
		//l.UserId=12345l;
		//l.displayPrivate();
	 
	 //book name displayDefault() method is default ,
	 //we can't access it  another packages only we can access it within same package
	 	//l.BookName;
	 	//l.displayDefault();
	}
	
	
	

}
