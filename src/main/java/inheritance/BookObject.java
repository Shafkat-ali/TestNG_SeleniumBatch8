package inheritance;

public class BookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Book b1 = new Book();
	
	b1.title = "Java";
	b1.price = 80.99;
		
		
	EBook b2 = new EBook();
	 b2.author = "John w.";
	 b2.page = 120;
	 b2.price = 80.99;
	 b2.title ="Java";
		
	b2.readBook();	
		
		
		
	}

}
