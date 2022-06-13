package com.Task2manytoone;

public class Main {
public static void main(String[] args) {
	Manytomany m=new Manytomany();
	m.Traine(101,"Funky", "java");
	m.studyMaterial("jsp binds", "java");
	Manytomany m1=new Manytomany();
	m1.Traine(102,"cobra", "flutter");
	
	m1.studyMaterial("your life", "html");
}
}
