package p1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int currentPlace = 0;
		int duration = 0;
		while(sc.hasNextInt()){
			int nextPlace = sc.nextInt();
			if(currentPlace < nextPlace){
				duration += 6*(nextPlace - currentPlace) + 5;
				currentPlace = nextPlace;
			} else if (currentPlace > nextPlace){
				duration += 4*(currentPlace - nextPlace) + 5;
				currentPlace = nextPlace;
			}
		}
		sc.close();
		System.out.println(duration);
	}
	

}

