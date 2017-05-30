package LukePack;

import java.util.Scanner;

public class GestionePause {

	private static Scanner sc;
	
	protected static void pause_Interno(){
		sc = new Scanner(System.in);
		System.out.print(" Press enter to continue. ");
		sc.nextLine();
	}

	public static void waitFor_Interno(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
