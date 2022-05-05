import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("vaish");
        al.add("xyzz");
        al.add(1);
        al.add(10.5);
        System.out.println(al);
        al.add('a');
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
        //al.get(3);
        //System.out.println(al);
        Iterator itr = al.iterator();  // iterator has three method hasnext() , next() , remove()
         while (itr.hasNext())
         {
             System.out.println(itr.next());
         }


    }

}
