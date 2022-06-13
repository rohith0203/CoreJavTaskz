package taskcollections;

import java.util.ArrayList;
import java.util.Collections;

public class Task4con1 {
	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("rohith");
		a.add("srinu");
		a.add("charan");
		a.add("prasad");
		//to sort in ascending orderrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
		Collections.sort(a);
		System.out.println(a);
		//to sort in discending orderrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		// to reverse the arraylisttttttttttttttttttttttttttttttttttttt
		Collections.reverse(a);
		System.out.println(a);
	}

}
