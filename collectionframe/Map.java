package collectionframe;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map {

	public static void main(String[] args) {

	    //Store Book Name and price
        HashMap<String,Integer> books = new HashMap<String,Integer>();
        books.put("C", 200);
        books.put("Java", 500);
        books.put("HTML", 250);
        
        System.out.println(books);
        //check if any data is present
        System.out.println("Contains:" + books.containsKey("C")); //true
        
        for(String bookName: books.keySet()) {
            Integer price =books.get(bookName);
            System.out.println("Book Name:" + bookName + " ,Price:" + price);
        }
        System.out.println("------------------------");
        
      //Store Book Name and price
        LinkedHashMap<String,Integer> book = new LinkedHashMap<String,Integer>();
        book.put("C", 200);
        book.put("Java", 500);
        book.put("HTML", 250);
        book.put("JS", 700);
        book.put("HTML", null);

        System.out.println(book);

        System.out.println("Contains:" + books.containsKey("CSS")); //false
        
        for(String bookName: book.keySet()) {
            Integer price =book.get(bookName);
            System.out.println("Book Name:" + bookName + " ,Price:" + price);
        }
    }
}



