package medals;

//problem statemnt 17: A school offers medals to the students of tenth based on the following criteria
//If(Marks>=90) : Gold
//If(Marks between 80 and 90) : Silver
//If(Marks between 70 and 80) : Bronze
//Note: Marks between 80 and 90 means marks>=80 and marks<90
//Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal.
//The input hashmap contains the student registration number as key and mark as value.
//The output hashmap should contain the student registration number as key and the medal type as value.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Medals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		HashMap<Integer, String> h = new HashMap<>();
		for (Map.Entry<Integer, String> x : h.entrySet()) {
			Integer marks = x.getKey();
			String medals = x.getValue();
			if (marks >= 70 && marks <= 79) {
				
				h.put(a, "Bronze");
				System.out.println(h);
			} else if (marks >= 80 && marks <= 89) {
				
				h.put(a, "Silver");
				System.out.println(h);
			} else if (marks >= 90 && marks <= 100) {
				System.out.println("enter the marks");
				h.put(a, "Gold");
			} else {
				System.out.println("no medals for your marks");
			}
		}
	}
}
