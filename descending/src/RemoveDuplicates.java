import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
	
	
	String [] str = {"india","delhi","kolkata","mumbai","chennai","kolkata"};
	

	Map<String,Integer> map = new HashMap<String,Integer>();

	for(String element:str){

	if(map.containsKey(element))

	System.out.println("Duplicate Value : "+element);

	else{

	map.put(element, 1);

	}
      
	}
	 System.out.println(map);
}
}