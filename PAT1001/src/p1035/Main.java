package p1035;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static class Record {
		public String name;
		public String password;
		
		public Record(String name, String password){
			this.name = name;
			this.password = password;
		}
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Record> l = new ArrayList<Record>();
		int count = 0;
		for(int i=0; i<num; i++){
			count++;
			String name = sc.next();
			String password = sc.next();
			if(replace(password)){
				l.add(new Record(name, password));
			}
		}
		if(l.size() > 0){
			System.out.println(l.size());
			for(int i=0; i < l.size(); i++){
				System.out.println(l.get(i).name + " " + rewrite(l.get(i).password));
			}
		} else {
			System.out.println("There are "+count+" accounts and no account is modified");
		}
		
	}
	
	public static boolean replace(String str){
		boolean flag = false;
		char[] chars = str.toCharArray();
		for(int i = 0; i < chars.length; i++){
			char c = chars[i];
			switch(c){
				case '1': {
					flag = true;
					chars[i] = '@';
					break;
				}
				case '0': {
					flag = true;
					chars[i] = '%';
					break;
				}
				case 'l': {
					flag = true;
					chars[i] = 'L';
					break;
				}
				case 'O': {
					flag = true;
					chars[i] = 'o';
					break;
				}
			}
		}
		str = new String(chars);
		return flag;
	}
	
	public static String rewrite(String str){
		char[] chars = str.toCharArray();
		for(int i = 0; i < chars.length; i++){
			char c = chars[i];
			switch(c){
				case '1': {
					chars[i] = '@';
					break;
				}
				case '0': {
					chars[i] = '%';
					break;
				}
				case 'l': {
					chars[i] = 'L';
					break;
				}
				case 'O': {
					chars[i] = 'o';
					break;
				}
			}
		}
		str = new String(chars);
		return str;
	}
}
