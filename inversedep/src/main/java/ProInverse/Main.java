package ProInverse;

import BookType.NewBook;
import BookType.ScienceBook;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    static double exampleOrder(){
        IBook nbk = (IBook) new NewBook(11);
        IBook scbk = (IBook) new ScienceBook(12);

        ArrayList<IBook> books = new ArrayList<IBook>();
        books.add(nbk);
        books.add(scbk);
        return new Payment().getTotalBill(books);
    }
    public static void main(String[] args) {
        System.out.println("Welcome ");
        System.out.println("Total price : "+exampleOrder());

    }
}
