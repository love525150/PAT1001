package tbontb1092;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		List<Character> shopper = toList(sc.nextLine());
		List<Character> EVA = toList(sc.nextLine());
		sc.close();
		for(int i=0; i<EVA.size(); i++){
			Character c = EVA.get(i);
			if(shopper.contains(EVA.get(i))) {
				EVA.remove(i--);
				shopper.remove(c);
			}
		}
		if(EVA.size() > 0) System.out.println("No " + EVA.size());
		else System.out.println("Yes " + shopper.size());
	}
	
	public static List<Character> toList (String str) {
		List<Character> list = new ArrayList<Character>();
		char[] chars = str.toCharArray();
		for(int i=0; i<chars.length; i++){
				list.add(chars[i]);
		}
		return list;
	}

}

