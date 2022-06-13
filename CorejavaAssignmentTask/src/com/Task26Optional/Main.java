package com.Task26Optional;

import java.util.Optional;
import java.util.StringJoiner;

public class Main {
	
		public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner(","); //String joiner
		joiner.add("koma");
		joiner.add("stella");
		joiner.add("astrok");
		System.out.println(joiner);
		System.out.println(" By using optional class :");
		String[] str=new String[10];
		str[6]="heyyy are you ok";
		str[5]="let me know are you fine";
		Optional<String> checknull=Optional.ofNullable(str[6]);
		Optional<String> checknull2=Optional.ofNullable(str[5]);
		if(checknull.isPresent() || checknull2.isPresent()) {
		String i=str[4].toUpperCase();
		String j=str[5].toLowerCase();
		System.out.println(i);
		System.out.println(j);
		}
		else {
		System.out.println("Exception is obtained.");
		}
		}
		}

