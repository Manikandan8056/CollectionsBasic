package list;

import java.util.ArrayList;

public class VectorInit {

	public static void main(String[] args) {

		 VectorDecl book1 = new VectorDecl();
	        book1.bookName = "Java";
	        book1.price = 500;
	        book1.authorName = "Gosling";
	        
	        VectorDecl book2 = new VectorDecl();
	        book2.bookName = "C";
	        book2.price = 500;
	        book2.authorName = "Balag";
	        
	        
	        ArrayList<VectorDecl> list = new ArrayList<VectorDecl>();
	        list.add(book1);
	        list.add(book2);
	        
	        for(VectorDecl book: list) {
	            System.out.println(book.bookName + "-" + book.price + "-" + book.authorName);
	        }

	}

}
