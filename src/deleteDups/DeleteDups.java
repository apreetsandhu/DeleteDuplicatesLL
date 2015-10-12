package deleteDups;

//import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
//import java.util.Set;

public class DeleteDups {
	

	
	    public static void main(String[] args) {

	    	
	    	//creating a static linked list for example purpose, You can create dynamic if you want.
	        LinkedList<Integer> list = new LinkedList<Integer>();
	        list.addLast(1);
	        list.addLast(2);
	        list.addLast(3);
	        list.addLast(5);
	        list.addLast(3);
	        list.addLast(4);
	        list.addLast(4);
	        
	        System.out.println(list); //before deleting duplicates
	        deleteDups(list);
	        System.out.println(list); // after deleting duplicates
	    }

	    public static void deleteDups(LinkedList<Integer> list) {
	        HashSet<Integer> s = new HashSet<Integer>();
	        s.addAll(list); //adding all list elements to hashset.
	      
	        
	        list.clear();
	        list.addAll(s);
	       

	    }
	
}
