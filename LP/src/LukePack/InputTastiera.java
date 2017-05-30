package LukePack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTastiera{ // LukePack

	protected static byte inByte_Interno(){

		InputStreamReader lettore;
		lettore = new InputStreamReader(System.in);
		BufferedReader myInput;
		myInput = new BufferedReader(lettore);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch(IOException e) {

			System.out.println (" IOException: " + e);

		}

		try {

			return Byte.parseByte(variabile);

		} catch (NumberFormatException e) {

			System.out.print(" NumberFormatException. Required BYTE. Try again: ");

			return InputTastiera.inByte_Interno();

		}

	}


	protected static short inShort_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		try {

			return Short.parseShort(variabile);

		} catch (NumberFormatException e) {

			System.out.print(" NumberFormatException. Required SHORT. Try again: ");

			return InputTastiera.inShort_Interno();

		}

	}

	protected static int inInt_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		try {

			return Integer.parseInt(variabile);

		} catch (NumberFormatException e) {

			System.out.print(" NumberFormatException. Required INT. Try again: ");

			return InputTastiera.inInt_Interno();

		}

	}

	protected static long inLong_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		try {

			return Long.parseLong(variabile);

		} catch (NumberFormatException e) {

			System.out.print(" NumberFormatException. Required LONG. Try again: ");

			return InputTastiera.inLong_Interno();

		}

	}

	protected static float inFloat_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		try {

			return Float.parseFloat(variabile);

		} catch (NumberFormatException e) {

			System.out.print(" NumberFormatException. Required FLOAT. Try again: ");

			return InputTastiera.inFloat_Interno();

		}

	}

	protected static double inDouble_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		try {

			return new Double(variabile).doubleValue();

		} catch (NumberFormatException e) {

			System.out.print(" NumberFormatException. Required DOUBLE. Try again: ");

			return InputTastiera.inDouble_Interno();

		}


	}

	protected static boolean inBoolean_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

			if (variabile.equals("1")) return true;
			
			if(variabile.length()==0){
				
				System.out.print(" NumberFormatException. Required BOOLEAN. Try again: ");

				return InputTastiera.inBoolean_Interno();
				
			}

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		try {

			return new Boolean(variabile).booleanValue();

		} catch (NumberFormatException e) {

			System.out.print(" NumberFormatException. Required BOOLEAN. Try again: ");

			return InputTastiera.inBoolean_Interno();

		}

	}

	protected static char inChar_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		if(variabile.equals("")){

			System.out.print(" EmptyCharException. Required CHAR. Try again: ");

			return InputTastiera.inChar_Interno();

		}
		
		if(variabile.length()>1){

			System.out.print(" EmptyCharException. Required CHAR. Try again: ");

			return InputTastiera.inChar_Interno();

		}

		return variabile.charAt(0);

	}

	protected static String inString_Interno(){

		InputStreamReader reader = new InputStreamReader (System.in);
		BufferedReader myInput = new BufferedReader (reader);

		String variabile = "";

		try {

			variabile = myInput.readLine();

		} catch (IOException e) {

			System.out.println (" IOException: " + e);

		}

		return variabile;

	}





}
