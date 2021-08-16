package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		int number;
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("Code of studant " + i + ": ");
			number = sc.nextInt();
			a.add(number);
		}
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("Code of studant " + i + ": ");
			number = sc.nextInt();
			b.add(number);
		}
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("Code of studant " + i + ": ");
			number = sc.nextInt();
			c.add(number);
		}
		Set<Integer> totalStudents = new HashSet<>(a);
		totalStudents.addAll(b);
		totalStudents.addAll(c);
		System.out.println("Total students: " + totalStudents.size());
	}
}
