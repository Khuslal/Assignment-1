package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		// Set<String> set = new HashSet<>(); // unique
//		Set<String> set = new TreeSet<>();
		Set<String> set = new LinkedHashSet<>(); // FIFO (first in - first out)

		set.add("java");
		set.add("php");
		set.add("html");
		set.add("python");
		set.add("php");
		set.add("java");
		set.add("android");

		System.out.println(set);
		
		/*
		 * a. Cat
		 * b. Pen
		 * c. Compter
		 */ 
	}
}
