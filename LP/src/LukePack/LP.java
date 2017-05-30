package LukePack;

import java.io.IOException;
import java.util.List;

public class LP { // Adapter

	// OutputSchermo

	public static void out(String stringa){

		System.out.print(stringa);

	}

	public static void outln(String stringa){

		System.out.println(stringa);

	}

	// InputTastiera

	public static byte inByte(){

		return InputTastiera.inByte_Interno();

	}


	public static short inShort(){

		return InputTastiera.inShort_Interno();

	}

	public static int inInt(){

		return InputTastiera.inInt_Interno();

	}

	public static long inLong(){

		return InputTastiera.inLong_Interno();

	}

	public static float inFloat(){

		return InputTastiera.inFloat_Interno();

	}

	public static double inDouble(){

		return InputTastiera.inDouble_Interno();

	}

	public static boolean inBoolean(){

		return InputTastiera.inBoolean_Interno();

	}

	public static char inChar(){

		return InputTastiera.inChar_Interno();

	}

	public static String inString(){

		return InputTastiera.inString_Interno();

	}

	// Gestione File

	public static String readFile(String nomeFile){

		return GestioneFile.readFile_Implementazione(nomeFile);

	}
	
	public static boolean writeNewFile(String nomeFile, String riga){
		
		return GestioneFile.writeNewFile_Implementazione(nomeFile, riga, false);

	}
	
	public static boolean writeNewFileln(String nomeFile, String riga){

		return GestioneFile.writeNewFile_Implementazione(nomeFile, riga, true);

	}
	
	public static boolean writeNewFile(String nomeFile, List<String> contenuto){
		
		return GestioneFile.writeNewFile_Implementazione(nomeFile, contenuto);

	}

	public static boolean addToFile(String nomeFile, String riga){

		return GestioneFile.addToFile_Implementazione(nomeFile, riga, false);

	}

	public static boolean addToFileln(String nomeFile, String riga){

		return GestioneFile.addToFile_Implementazione(nomeFile, riga, true);

	}
	
	public static boolean addToFile(String nomeFile, List<String> contenuto){

		return GestioneFile.addToFile_Implementazione(nomeFile, contenuto);

	}

	public static boolean emptyFile(String nomeFile){

		return GestioneFile.emptyFile_Implementazione(nomeFile);

	}

	public static boolean deleteFile(String nomeFile){

		return GestioneFile.deleteFile_Implementazione(nomeFile);

	}

	//-----------------------Throws Exception------------------------------------

	public static String readFileTE(String nomeFile) throws Exception{

		return GestioneFile.readFileTE_Implementazione(nomeFile);

	}

	public static void writeNewFileTE(String nomeFile, String riga) throws IOException{

		GestioneFile.writeNewFileTE_Implementazione(nomeFile, riga, false);

	}

	public static void writeNewFilelnTE(String nomeFile, String riga) throws IOException{

		GestioneFile.writeNewFileTE_Implementazione(nomeFile, riga, true);

	}
	
	public static void writeNewFileTE(String nomeFile, List<String> contenuto) throws IOException{

		GestioneFile.writeNewFileTE_Implementazione(nomeFile, contenuto);

	}

	public static void addToFileTE(String nomeFile, String riga) throws IOException{

		GestioneFile.addToFileTE_Implementazione(nomeFile, riga, false);

	}

	public static void addToFilelnTE(String nomeFile, String riga) throws IOException{

		GestioneFile.addToFileTE_Implementazione(nomeFile, riga, true);

	}
	
	public static void addToFileTE(String nomeFile, List<String> contenuto) throws IOException{

		GestioneFile.addToFileTE_Implementazione(nomeFile, contenuto);

	}

	public static void emptyFileTE(String nomeFile) throws IOException{

		GestioneFile.emptyFileTE_Implementazione(nomeFile);

	}

	public static void deleteFileTE(String nomeFile) throws IOException{

		GestioneFile.deleteFileTE_Implementazione(nomeFile);
		
	}

	// Gestione Pause

	public static void pause(){

		GestionePause.pause_Interno();

	}
	
	public static void waitFor(long milliseconds){
		
		GestionePause.waitFor_Interno(milliseconds);
		
	}

}
