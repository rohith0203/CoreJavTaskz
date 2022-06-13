package com.Task27exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
public static void main(String[] args) {
try {
int a[]=new int[4];
a[4]=75/0;
FileWriter f=new FileWriter("pqr.txt");
f.write("Hello");
}
catch(ArithmeticException e) {
System.out.println("Exception Solved"+e);
return;
}
catch(ArrayIndexOutOfBoundsException ae) {
System.out.println("ArrayIndexOutOfBoundsExeption solved"+ae);
return;
}
catch(IOException a) {
System.out.println("NullPointerException is handled"+a);
return;
}
catch(Exception n) {
System.out.println("Nothing to do");
return;
}
finally{
System.out.println("Exceptions Are Handled");
}
}
}
