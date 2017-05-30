# LukePack
Libreria per gestire input/output in modo molto semplice (tastiera/schermo/file)


		INTERFACCIA DELLA LIBRERIA LP (LUKEPACK)

-------------------------------------------------------------------------

*LETTURA DA TASTIERA*
						   ->  	(tipo di ritorno)

 LETTURA BOOLEAN:    LP.inBoolean() 			-> (boolean)

 LETTURA BYTE:       LP.inByte() 			-> (byte)

 LETTURA SHORT:      LP.inShort()  			-> (short)

 LETTURA INT:        LP.inInt()				-> (int)

 LETTURA LONG:       LP.inLong()			-> (long)

 LETTURA FLOAT:      LP.inFloat()			-> (float)

 LETTURA DOUBLE:     LP.inDouble()			-> (double)

 LETTURA CHAR:       LP.inChar()			-> (char)

 LETTURA STRING:     LP.inString()			-> (String)

-------------------------------------------------------------------------

*STAMPA SU SCHERMO* (Preferibile usare System.out)


 STAMPA E VAI A CAPO (equivalente a System.out.println(Stringa) ):
 
                     LP.outln(Stringa)			-> (void)

 STAMPA SENZA ANDARE A CAPO (equivalente a System.out.print(Stringa) ):
 
                     LP.out(Stringa)			-> (void)

-------------------------------------------------------------------------

*FILE DI TESTO* - Eccezioni gestite tramite valori di ritorno


 LETTURA DI FILE: 

        LP.readFile("nomeDelFile")			-> (String:
							vale null in caso di errori)

 SCRITTURA SU FILE (sovrascrivi/crea): 

        LP.writeNewFile("nomeDelFile", "contenuto")	-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)

 SCRITTURA SU FILE (accoda): 

        LP.addToFile("nomeDelFile", "contenuto")   	-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)

 SCRITTURA SU FILE - vai a capo (sovrascrivi/crea): 

        LP.writeNewFileln("nomeDelFile", "contenuto")	-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)

 SCRITTURA SU FILE - vai a capo (accoda): 

        LP.addToFileln("nomeDelFile", "contenuto")   	-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)

 SCRITTURA SU FILE - EFFICIENTE (sovrascrivi/crea): 

        LP.writeNewFile("nomeDelFile", List<"riga">)	-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)

 SCRITTURA SU FILE - EFFICIENTE (accoda): 

        LP.addToFile("nomeDelFile", List<"riga">)	-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)

 CREA UN FILE VUOTO (sovrascrive file esistenti):
  
        LP.emptyFile("nomeDelFile")			-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)

 ELIMINA UN FILE:
  
        LP.deleteFile("nomeDelFile")			-> (boolean:
							vale true in caso di successo
							vale false in caso di errori)


*FILE DI TESTO* - Eccezioni propagate (TE: Throws Exception)


 LETTURA DI FILE: 

        LP.readFileTE("nomeDelFile")			-> (String)

 SCRITTURA SU FILE (sovrascrivi/crea): 

        LP.writeNewFileTE("nomeDelFile", "contenuto")	-> (void)

 SCRITTURA SU FILE (accoda): 

        LP.addToFileTE("nomeDelFile", "contenuto")   	-> (void)

 SCRITTURA SU FILE - vai a capo(sovrascrivi/crea): 

        LP.writeNewFilelnTE("nomeDelFile", "contenuto")	-> (void)

 SCRITTURA SU FILE - vai a capo(accoda): 

        LP.addToFilelnTE("nomeDelFile", "contenuto")   	-> (void)

 SCRITTURA SU FILE - EFFICIENTE (sovrascrivi/crea): 

        LP.writeNewFileTE("nomeDelFile", List<"riga">)	-> (void)

 SCRITTURA SU FILE - EFFICIENTE (accoda): 

        LP.addToFileTE("nomeDelFile", List<"riga">)	-> (void)

 CREA UN FILE VUOTO (sovrascrive file esistenti):
  
        LP.emptyFileTE("nomeDelFile")			-> (void)

 ELIMINA UN FILE:
  
        LP.deleteFileTE("nomeDelFile")			-> (void)

-------------------------------------------------------------------------

*ESECUZIONE IN PAUSA*


 ATTENDI LA PRESSIONE DEL TASTO INVIO:

	LP.pause()					-> (void)

 ATTENDI PER UN DETERMINATO INTERVALLO DI TEMPO:

	LP.waitFor(millisecondi)			-> (void)
			^long

-------------------------------------------------------------------------

					LUKEPACK 1.2.1 by Luca Furlano.
