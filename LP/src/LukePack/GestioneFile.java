package LukePack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class GestioneFile {
	
	protected static String readFile_Implementazione(String nomeFile){

		String contenuto = "";

		String s;

		try{

			BufferedReader reader = new BufferedReader(new FileReader(nomeFile) );
			
			if( (s = reader.readLine()) != null ) contenuto += s;

			while( (s = reader.readLine()) != null ){

				contenuto += "\r\n";
				
				contenuto += s;

			}

			reader.close();

		} catch(Exception error1){
			
			return null;

		}

		return contenuto;

	}

	protected static boolean writeNewFile_Implementazione(String nomeFile, String riga, boolean aCapo){

		try{

			FileOutputStream file = new FileOutputStream(nomeFile);

			PrintStream Output = new PrintStream(file);
			
			if(aCapo) Output.println(riga);
			
			else Output.print(riga);
				
			Output.close();
			
			return true;

		} catch(Exception error1){

			return false;

		}

	}
	
	protected static boolean writeNewFile_Implementazione(String nomeFile, List<String> contenuto){

		try{

			FileOutputStream file = new FileOutputStream(nomeFile);

			PrintStream Output = new PrintStream(file);
			
			for(String riga: contenuto) Output.println(riga);
				
			Output.close();
			
			return true;

		} catch(Exception error1){

			return false;

		}

	}

	protected static boolean addToFile_Implementazione(String nomeFile, String riga, boolean aCapo){

		try {

			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile, true)));

			if(aCapo) out.println(riga);

			else out.print(riga);

			out.close();
			
			return true;

		} catch (Exception error1) {

			return false;
			
		}

	}
	
	protected static boolean addToFile_Implementazione(String nomeFile, List<String> contenuto){

		try {

			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile, true)));

			for(String riga:contenuto) out.println(riga);

			out.close();
			
			return true;

		} catch (Exception error1) {

			return false;
			
		}

	}

	protected static boolean emptyFile_Implementazione(String nomeFile){

		try{

			FileOutputStream file = new FileOutputStream(nomeFile);
			
			PrintStream Output = new PrintStream(file);

			Output.print("");
			
			Output.close();
			
			return true;

		} catch(Exception error1){

			return false;

		}

	}
	
	protected static boolean deleteFile_Implementazione(String nomeFile){
		
		File f = new File(nomeFile);
		
		if(f.delete()){
			
			return true;
		
		} else {
			
			return false;
			
		} 
		
	}
	
	//-----------------------Throws Exception------------------------------------

	protected static String readFileTE_Implementazione(String nomeFile) throws Exception{

		String contenuto = "";

		String s;

		try{

			BufferedReader reader = new BufferedReader(new FileReader(nomeFile) );

			if( (s = reader.readLine()) != null ) contenuto += s;

			while( (s = reader.readLine()) != null ){

				contenuto += "\r\n";
				
				contenuto += s;

			}

			reader.close();

		} catch(FileNotFoundException error1){
			
			throw new FileNotFoundException(" Impossible to open this file: "+ nomeFile +" ");

		} catch(IOException error2){

			throw new IOException(" Impossible to open this file: "+ nomeFile +" ");

		}

		return contenuto;

	}

	protected static void writeNewFileTE_Implementazione(String nomeFile, String riga, boolean aCapo) throws IOException{

		try{

			FileOutputStream file = new FileOutputStream(nomeFile);

			PrintStream Output = new PrintStream(file);
			
			if(aCapo) Output.println(riga);
			
			else Output.print(riga);
			
			Output.close();

		} catch(IOException error){
			
			throw new IOException(" Unable to create this file " + nomeFile + " ");

		}

	}
	
	protected static void writeNewFileTE_Implementazione(String nomeFile, List<String> contenuto) throws IOException{

		try{

			FileOutputStream file = new FileOutputStream(nomeFile);

			PrintStream Output = new PrintStream(file);
			
			for(String riga:contenuto) Output.println(riga);
			
			Output.close();

		} catch(IOException error){
			
			throw new IOException(" Unable to create this file " + nomeFile + " ");

		}

	}

	protected static void addToFileTE_Implementazione(String nomeFile, String riga, boolean aCapo) throws IOException{

		try {

			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile, true)));
			
			if(aCapo) out.println(riga);
			
			else out.print(riga);

			out.close();

		} catch (IOException error) {
			
			throw new IOException(" Unable to modify this file " + nomeFile + " ");

		}

	}

	protected static void addToFileTE_Implementazione(String nomeFile, List<String> contenuto) throws IOException{

		try {

			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nomeFile, true)));
			
			for(String riga:contenuto) out.println(riga);

			out.close();

		} catch (IOException error) {
			
			throw new IOException(" Unable to modify this file " + nomeFile + " ");

		}

	}
	
	protected static void emptyFileTE_Implementazione(String nomeFile) throws IOException{

		try{

			FileOutputStream file = new FileOutputStream(nomeFile);
			
			PrintStream Output = new PrintStream(file);

			Output.print("");
			
			Output.close();

		} catch(IOException error){
			
			throw new IOException(" Unable to modify this file " + nomeFile + " ");

		}

	}
	
	protected static void deleteFileTE_Implementazione(String nomeFile) throws IOException{
		
		File f = new File(nomeFile);
		
		if(!f.delete()){
			
			throw new IOException(" Unable to delete this file " + nomeFile + " ");
			
		} 
		
	}
	
}
