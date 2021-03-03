package ProInverse;

import java.util.ArrayList;
import java.util.Iterator;

public class Payment {
    public double getTotalBill(ArrayList<IBook> books) {
        Iterator itr = books.iterator();
        double total = 0.0;
        while(itr.hasNext()){
            IBook bk = (IBook) itr.next();
            total = total + bk.getBill();
        }
        return total;
    }
}
