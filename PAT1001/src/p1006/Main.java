package p1006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date login = null;
		Date logout = null;
		String unlocker = null;
		String locker = null;
		for(int i=0; i<num; i++){
			try {
				String name = sc.next();
				Date newLogin = sdf.parse(sc.next());
				Date newLogout = sdf.parse(sc.next());
				if(login == null || login.compareTo(newLogin) > 0) {login = newLogin; unlocker = name;};
				if(logout == null || logout.compareTo(newLogout) < 0) {logout = newLogout; locker = name;};
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		sc.close();
		System.out.println(unlocker + " " + locker);
	}
	

}

