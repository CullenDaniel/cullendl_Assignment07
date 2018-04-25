/**
 * Daniel Cullen
 * Assignment07 make up
 * Computer Programming 2
 * 2/24/2018
 * This program finds the most occurring letter (not case sensitive), the least occurring letter (not case sensitive), the longest word, and the average word length from a document provided by Bill Nicholson.
 */
package cullendl_Assignment07New;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner dictionary;
		try {
			dictionary = new Scanner(new File("words.txt"));
			
			ArrayList<String> wordList = new ArrayList<String>();
			
			while (dictionary.hasNext()){
				wordList.add(dictionary.next());
			}
			
			
			/**
			 * Checks for the longest and average word.
			 */
			int loop =0;
			double wordSum=0;
			double wordAverage =0;
			ArrayList<Integer> wordLength = new ArrayList<Integer>();
			for ( loop =0; loop< wordList.size(); loop++){
				wordLength.add(wordList.get(loop).length());	

			}
			
			/**
			 * Finds the average size of the words to two decimal places.
			 */
			for ( loop =0; loop< wordLength.size(); loop++){
				wordSum +=wordLength.get(loop);
			}
			wordAverage= (wordSum/wordLength.size());
			
			/**
			 * The most and least letter
			 */
			ArrayList<Integer> letterCount = new ArrayList<Integer>();
			int countOfa =0;
			int countOfb =0;
			int countOfc =0;
			int countOfd =0;
			int countOfe=0;
			int countOff =0;
			int countOfg =0;
			int countOfh =0;
			int countOfi =0;
			int countOfj=0;
			int countOfk =0;
			int countOfl =0;
			int countOfm =0;
			int countOfn =0;
			int countOfo=0;
			int countOfp =0;
			int countOfq =0;
			int countOfr =0;
			int countOfs =0;
			int countOft =0;
			int countOfu=0;
			int countOfv =0;
			int countOfw =0;
			int countOfx =0;
			int countOfy =0;
			int countOfz =0;
			for ( loop =0; loop< wordList.size(); loop++){ 
				
					for (int i=0; i <wordList.get(loop).length(); i++){
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("a")){
							countOfa++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("b")){
							countOfb++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("c")){
							countOfc++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("d")){
							countOfd++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("e")){
							countOfe++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("f")){
							countOff++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("g")){
							countOfg++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("h")){
							countOfh++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("i")){
							countOfi++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("j")){
							countOfj++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("k")){
							countOfk++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("l")){
							countOfl++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("m")){
							countOfm++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("o")){
							countOfo++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("p")){
							countOfp++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("q")){
							countOfq++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("r")){
							countOfr++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("s")){
							countOfs++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("t")){
							countOft++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("u")){
							countOfu++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("v")){
							countOfv++;
						}
						if (wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("w")){
							countOfw++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("x")){
							countOfx++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("y")){
							countOfy++;
						}
						if(wordList.get(loop).substring(i, (i+1)).toLowerCase().contains("z")){
							countOfz++;
						}

			
					}
					//System.out.println(countOfa);
			}
			letterCount.add(countOfa);
			letterCount.add(countOfb);
			letterCount.add(countOfc);
			letterCount.add(countOfd);
			letterCount.add(countOfe);
			letterCount.add(countOff);
			letterCount.add(countOfg);
			letterCount.add(countOfh);
			letterCount.add(countOfi);
			letterCount.add(countOfj);
			letterCount.add(countOfk);
			letterCount.add(countOfl);
			letterCount.add(countOfm);
			letterCount.add(countOfn);
			letterCount.add(countOfo);
			letterCount.add(countOfp);
			letterCount.add(countOfq);
			letterCount.add(countOfr);
			letterCount.add(countOfs);
			letterCount.add(countOft);
			letterCount.add(countOfu);
			letterCount.add(countOfv);
			letterCount.add(countOfw);
			letterCount.add(countOfx);
			letterCount.add(countOfy);
			letterCount.add(countOfz);

			
			/**
			 * Adds the alphabet (lowercase) to an arraylist.
			 */
			ArrayList<String> alphabet = new ArrayList<String>();
			for (loop=0; loop <25; loop++){
				alphabet.add(Character.toString((char) (97+loop)));
			}
			
			System.out.println("The letter that appears the most is : " + alphabet.get(letterCount.indexOf(Collections.max(letterCount))));
			System.out.println("The letter that appears the least is : " + alphabet.get(letterCount.indexOf(Collections.min(letterCount))));
			System.out.println("The longest word is " + wordList.get(wordLength.indexOf(Collections.max(wordLength))));
			System.out.printf("The average word length (to two decimals) is : " + "%.2f",wordAverage);
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("The file cannot be found.");
			e.printStackTrace();
		}
		
	

	}

}
