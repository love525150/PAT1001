package org.allen;

public class Main {
	static int count = 0;

	public static void main(String[] args) {
		clazz(3);
		System.out.println(count);
	}
	
	public static void clazz(int n){
		if(n != 1) {
			count++;
			if (n % 2 == 0){
				n = n / 2;
				clazz(n);
			} else {
				n = n * 3 +1;
				clazz(n);
			}
		}
	}
}