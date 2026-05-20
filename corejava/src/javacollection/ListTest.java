package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class ListTest {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();

//		List<String> list = new LinkedList<>();
//		list.add("nepal");
//		list.add("china");
//		list.add("japan");
//		list.add("canada");

//		System.out.println(list);
//		// shows the size 
//		System.out.println("List size : "+list.size());
//		list.remove("japan");
//		System.out.println(list);
//		System.out.println(list.contains("nepal"));

		// enhanced loop
//		for(String s : list) {
//			System.out.println(s);
//		}
//		
//		list.forEach(s -> System.out.println(s));

//		list.forEach(System.out::println);

		/*
		 * a. Student b. Car c. Book
		 */
		List<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter Name :");
			String name = sc.nextLine();

			System.out.println("Enter Age :");
			int age = Integer.parseInt(sc.nextLine());

			System.out.println("Enter Campus :");
			String campus = sc.nextLine();

			Student s1 = new Student(name, age, campus);
			list.add(s1);
		}

		for (Student key : list) {
			System.out.println(key.getName() + " " + key.getAge() + " " + key.getCampus());
		}
	}
}
