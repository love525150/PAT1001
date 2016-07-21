package p1054;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt()*sc.nextInt();
		Map<Long, Integer> m = new HashMap<Long, Integer>();
		for(int i=0; i<num; i++){
			Long color = sc.nextLong();
			if(m.containsKey(color)) m.put(color, m.get(color)+1);
			else m.put(color, 1);
            if(m.get(color) >= (num/2 + 1)){
                 System.out.println(color);
                 break;
            }
		}
		sc.close();
	}

}

