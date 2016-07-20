package org.allen.listgrade1083;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		class Student implements Comparable<Student>{
			private String name;
			private String ID;
			private Integer grade;
			
			Student (String name, String ID, Integer grade){
				this.name = name;
				this.ID = ID;
				this.grade = grade;
			}
			
			@Override
			public int compareTo(Student other) {
				return other.grade.compareTo(this.grade);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Student> list = new ArrayList<Student>();
		for(int i = 0; i < num; i++){
			Student s = new Student(sc.next(), sc.next(), (Integer)sc.nextInt());
			list.add(s);
		}
		int low = sc.nextInt();
		int high = sc.nextInt();
		sc.close();
		Collections.sort(list);
		int count = 0;
		for(int i=0; i<list.size(); i++){
			int grade = list.get(i).grade;
			if(grade < low) continue;
			else if(grade <= high) {
				System.out.println(list.get(i).name + " " + list.get(i).ID);
				count++;
			} else break;
		}
		if(count == 0) System.out.println("NONE");
	}

}

