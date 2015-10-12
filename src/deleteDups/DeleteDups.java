package deleteDups;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
//import java.util.Set;

public class DeleteDups {
	

	
	    public static void main(String[] args) {

	        LinkedList<Integer> list = new LinkedList<Integer>();
	        list.addLast(1);
	        list.addLast(2);
	        list.addLast(3);
	        list.addLast(5);
	        list.addLast(3);
	        list.addLast(4);
	        list.addLast(4);
	        
	        System.out.println(list);
	        deleteDups(list);
	        System.out.println(list);
	    }

	    public static void deleteDups(LinkedList<Integer> list) {
	        HashSet<Integer> s = new HashSet<Integer>();
	        s.addAll(list);
	        
	        
	        //System.out.println();
	        
	        list.clear();
	       // System.out.println("Clear");
	        
	        list.addAll(s);
	       // System.out.println("New List: "+ list.addAll(s));

	    }
	
}
