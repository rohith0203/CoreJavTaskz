package com.Task20;
//Methods of Iterator:hasNext(),next(),remove()
//Methods of ListIterator:add(E e),hasNext(),hasPrevious(),next(),nextIndex(),previous(),previousIndex(),remove(),set(E e)	

import java.util.*;
public class Iterator2{
public static void main(String[] args) {
ArrayList<String> movie= new ArrayList<String>();
movie.add("ram");
movie.add("mallaesh");
movie.add("sai");
movie.add("arun");
Iterator<String> itr = movie.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
System.out.println("----");
itr.remove();
System.out.println(""+movie);



System.out.println("----");



ListIterator<String> fitr = movie.listIterator(); //Listiterator
while (fitr.hasNext()) {
System.out.println(fitr.next());
}
System.out.println("----");
fitr.add("mallaesh");
System.out.println("movie");



System.out.println("----");
fitr.hasPrevious();
System.out.println(""+fitr.previous());



System.out.println("----");
fitr.nextIndex();
System.out.println(""+fitr.next());



System.out.println("----");
fitr.previousIndex();
System.out.println(""+fitr.previousIndex());



System.out.println("----");
fitr.remove();
System.out.println(""+movie);



System.out.println("----");
fitr.set("koma");
System.out.println("After using the set() method : ");
for (Object item : movie) {
System.out.println(item);
}
}	
}

