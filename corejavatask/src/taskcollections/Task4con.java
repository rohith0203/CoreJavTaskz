package taskcollections;
//How to Iterate ArrayList using Java ListIterator
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Task4con {
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		ListIterator<Integer>x=a.listIterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		// adding element in the listtttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
		a.add(2,10);
		System.out.println("after  adding the value at index 2="+a);
		a.remove(3);
		System.out.println("removing the index 3="+a);
		a.add(3,20);
		System.out.println("adding the value for index 3="+a);
		// sorting the array list in ascending  orderrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
		
		Collections.sort(a);
		System.out.println("sorting in ascending order"+a);
		// sorting the list in descending orderrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
		Collections.sort(a,Collections.reverseOrder());
		
		System.out.println("sorting in ddiscending order"+a);
		// add the element in arraylist by using List-Iteratorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
		ListIterator<Integer>y=a.listIterator();
		while(y.hasNext())
		{
			y.add(100);
			y.next();
			
		}
		System.out.println("adding element by listiterator "+a);
	}

}
