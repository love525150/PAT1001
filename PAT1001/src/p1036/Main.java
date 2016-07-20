package p1036;

import java.util.Scanner;

public class Main {
	
	public static class Student{
	String name;
	String sex;
	String id;
	Integer score;
	public Student(String name, String sex, String id, Integer score) {
		super();
		this.name = name;
		this.sex = sex;
		this.id = id;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
}
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Student boy = null;
		Student girl = null;
		for(int i=0; i<num; i++){
			Student s = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());
			if(s.getSex().equals("F")){
				if(girl == null) girl = s;
				else if(s.getScore() > girl.score) girl = s;
			}
			else {
				if(boy == null) boy = s;
				else if(s.getScore() < boy.score) boy = s;
			}
		}
		if(girl != null) System.out.println(girl.getName()+" "+girl.getId());
		else System.out.println("Absent");
		if(boy != null) System.out.println(boy.getName()+" "+boy.getId());
		else System.out.println("Absent");
		if(girl == null || boy == null) System.out.println("NA");
		else System.out.println(girl.score-boy.score);
	}
	
}
