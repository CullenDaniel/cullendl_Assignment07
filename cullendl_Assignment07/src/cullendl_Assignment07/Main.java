/**
 * Daniel Cullen
 * Assignment 07
 * 3/22/2018
 * Bill Nicholson
 * Computer Programming 2 (002)
 * There are citations throughout this program
 */
package cullendl_Assignment07;


/**Code lines 10 through 21 are taken from https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
 * 
 */
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	 public static String readFileAsString(String fileName)throws Exception
	  {
	    String data = "";
	    data = new String(Files.readAllBytes(Paths.get(fileName)));
	    return data;
	  }
	 
	  public static void main(String[] args) throws Exception
	  {
		/**
		 * Obtains the file.
		 * On the School computers change the path to "E:\\Eclipse_3-19-2018\\Projects\\words\\words.txt"
		 */
	    String data = readFileAsString("D:\\Eclipse_3-19-2018\\Projects\\words\\words.txt");
	    
	   
	    
	    /**
	     * Creates integer values for all of the letters including line breaks.
	     */
	    int counterA=0;
	    int counterB=0;
	    int counterC=0;
	    int counterD=0;
	    int counterE=0;
	    int counterF=0;
	    int counterG=0;
	    int counterH=0;
	    int counterI=0;
	    int counterJ=0;
	    int counterK=0;
	    int counterL=0;
	    int counterM=0;
	    int counterN=0;
	    int counterO=0;
	    int counterP=0;
	    int counterQ=0;
	    int counterR=0;
	    int counterS=0;
	    int counterT=0;
	    int counterU=0;
	    int counterV=0;
	    int counterW=0;
	    int counterX=0;
	    int counterY=0;
	    int counterZ=0;
	    int counterReturn =0;
	    
	    /**
	     * Based on the code from Etienne Miret
	     * https://stackoverflow.com/questions/19314228/find-positions-of-a-character-in-a-string
	     * This code finds all the letters (both upper and lower case) from the file. Also includes line breaks.
	     */

	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 97) || (data.charAt(i) == 65)){
	             counterA++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'b') || (data.charAt(i) == 'B')){
	             counterB++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'c') || (data.charAt(i) == 'C')){
	             counterC++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'd') || (data.charAt(i) == 'D')){
	             counterD++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'e') || (data.charAt(i) == 'E')){
	             counterE++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'f') || (data.charAt(i) == 'F')){
	             counterF++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'g') || (data.charAt(i) == 'G')){
	             counterG++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'h') || (data.charAt(i) == 'H')){
	             counterH++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'i') || (data.charAt(i) == 'I')){
	             counterI++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'j') || (data.charAt(i) == 'J')){
	             counterJ++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'k') || (data.charAt(i) == 'K')){
	             counterK++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'l') || (data.charAt(i) == 'L')){
	             counterL++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'm') || (data.charAt(i) == 'M')){
	             counterM++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'n') || (data.charAt(i) == 'N')){
	             counterN++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'o') || (data.charAt(i) == 'O')){
	             counterO++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'p') || (data.charAt(i) == 'P')){
	             counterP++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'q') || (data.charAt(i) == 'Q')){
	             counterQ++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'r') || (data.charAt(i) == 'R')){
	             counterR++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 's') || (data.charAt(i) == 'S')){
	             counterS++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 't') || (data.charAt(i) == 'T')){
	             counterT++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'u') || (data.charAt(i) == 'U')){
	             counterU++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'v') || (data.charAt(i) == 'V')){
	             counterV++;
	        }
	    }for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'w') || (data.charAt(i) == 'W')){
	             counterW++;
	        }
	    }
	    for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'x') || (data.charAt(i) == 'X')){
	             counterX++;
	        }
	    }for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'y') || (data.charAt(i) == 'Y')){
	             counterY++;
	        }
	    }for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == 'z') || (data.charAt(i) == 'Z')){
	             counterZ++;
	        }
	    }
	    
      for (int i=0; i < data.length(); i++){
	        if ((data.charAt(i) == '\n')){
	             counterReturn++;
	        }
	    }
      /** adds all of the "counts" (not including line break) to an ArrayList
       * 
       */
	   ArrayList<Integer> countOf = new ArrayList<Integer>();
	   	countOf.add(counterA);
	   	countOf.add(counterB);
	   	countOf.add(counterC);
	   	countOf.add(counterD);
	   	countOf.add(counterE);
	   	countOf.add(counterF);
	   	countOf.add(counterG);
	   	countOf.add(counterH);
	   	countOf.add(counterI);
	   	countOf.add(counterJ);
	   	countOf.add(counterK);
	   	countOf.add(counterL);
	   	countOf.add(counterM);
	   	countOf.add(counterN);
	   	countOf.add(counterO);
	   	countOf.add(counterP);
	   	countOf.add(counterQ);
	   	countOf.add(counterR);
	   	countOf.add(counterS);
	   	countOf.add(counterT);
	   	countOf.add(counterU);
	   	countOf.add(counterV);
	   	countOf.add(counterW);
	   	countOf.add(counterX);
	   	countOf.add(counterY);
	   	countOf.add(counterZ);
	   
	   	/**
	   	 * Adds the US alphabet into an ArrayList
	   	 */
	   ArrayList<String> alphabet = new ArrayList<String>();
	    alphabet.add("A");
	    alphabet.add("B");
	    alphabet.add("C");
	    alphabet.add("D");
	    alphabet.add("E");
	    alphabet.add("F");
	   	alphabet.add("G");
	   	alphabet.add("H");
	   	alphabet.add("I");
	   	alphabet.add("J");
	   	alphabet.add("K");
	   	alphabet.add("L");
	   	alphabet.add("M");
	   	alphabet.add("N");
	   	alphabet.add("O");
	   	alphabet.add("P");
	   	alphabet.add("Q");
	   	alphabet.add("R");
	   	alphabet.add("S");
	   	alphabet.add("T");
	   	alphabet.add("U");
	   	alphabet.add("V");
	   	alphabet.add("W");
	   	alphabet.add("X");
	   	alphabet.add("Y");
	   	alphabet.add("Z");
      /** Puts all the line breaks into an Arraylist
       * 
       */
      String guess = "\n";
      ArrayList<Long> returnSpots = new ArrayList<Long>();
      int index = data.indexOf(guess);
      while (index >= 0) {
          index = data.indexOf(guess, index + 1);
          returnSpots.add((long) index); 
      }
      /**
       * Puts all the distances of the return lines into an array list.
       */
      ArrayList<Long> wordLength = new ArrayList<Long>();
      for (int i =0; i<returnSpots.size(); i++){
      	if (i>0 && (i<returnSpots.size()-1)){
      		wordLength.add(returnSpots.get(i) - returnSpots.get(i-1));
      	}
      }
      /**
       * Finds the average (and total) of the distances of the words.
       */
      long total =0;
      double avg =0;
      for(int i = 0; i < wordLength.size(); i++)
      {
          total += wordLength.get(i);
          avg = total / wordLength.size();
          
      }
     
      /**
       * code based on code from aioobe on stackoverflow
       * https://stackoverflow.com/questions/7347856/how-to-convert-a-string-into-an-arraylist
       */
      ArrayList<String> dataList = new ArrayList<String>(Arrays.asList(data.split("\n")));
      	dataList.add(data);
      int largest=0;
      int placeHolder =0;
      for (int i =0; i < dataList.size(); i++){
    	  if (dataList.get(i).length() > largest){
    		  largest = dataList.get(i).length();
    		  placeHolder =i;
    	  }
      }
      /**
       * Counts the lengths of the words.
       * Code based on code from Kick Buttowski
       * https://codereview.stackexchange.com/questions/74722/getting-the-lengths-of-each-word-in-its-string-parameter
       */

      ArrayList<Integer> list = new ArrayList<Integer>();

      for ( int i = 0; i < data.length(); i++ )
      {
          if ( data.charAt(i) == '\n' )
          {
              for ( int j = i+1; j < data.length() ; j++)
              {
                  if ( data.charAt(j) == '\n')
                  {
                      list.add( j - i - 1 );
                      j = data.length();
                  }
              }
          }
      }      
      /**
       * Prints the required items.
       */
      	System.out.print("The most occuring letter is: " + alphabet.get(countOf.indexOf(Collections.max(countOf))));
	    System.out.println(" with " +Collections.max(countOf) + " occurances.");
	    System.out.print("The least occuring letter is: " + alphabet.get(countOf.indexOf(Collections.min(countOf))));
	    System.out.println(" with " +Collections.min(countOf) + " occurances.");
	    System.out.println("There are " + (counterReturn -1) + " words.");//subtracts 1 because there is an extra one at the end.
	    System.out.println("The average length of the words is: " + avg);
	    System.out.print("The longest word is: " + dataList.get(Collections.max(list)));
	    System.out.println("and it is " + Collections.max(wordLength) +" characters long.");

	}
	  
}