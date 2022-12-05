import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) throws IOException {
      // File Reader
    FileReader fr = new FileReader("data1.txt");
      // Attach a buffer to the file
    Scanner br = new Scanner(fr);
    String elfCode = "0";
    String half1 = "";
    String half2 = "";
    int sum = 0;
    int sumCase2 = 0;
    int letterToNumber = 0;
    int letterCount = 0;
    String repeatedLetter = "";
    
      // Loop until no more lines are in the file
      while (br.hasNextLine()) {
       //Read in lines, separating each individual letter     
        elfCode = br.next();
        letterCount = (elfCode.length()) / 2;
        half1 = elfCode.substring(0, letterCount);
        half2 = elfCode.substring(letterCount, (elfCode.length()));
        for(int i = 0; i < half1.length(); ++i) {
        		
        	if(half2.contains(half1.substring(i, i+1))) {
        		repeatedLetter = half1.substring(i, i+1);
        		letterToNumber = letterToNumber(repeatedLetter);
        		sum += letterToNumber;
        		System.out.println("Repeated Letter: " + repeatedLetter + " Sum so far: " + sum + " letterValue: " + letterToNumber);
        		break;
        	}
        }
        
      
      }
      br.close();
      fr.close(); 
      
      System.out.println("\n----------Part 2:----------\n");
      FileReader fr1 = new FileReader("data2.txt");
      // Attach a buffer to the file
      Scanner br1 = new Scanner(fr1);
      String elfCode2 = "";
      String elfCode3 = "";
      
      while(br1.hasNextLine()) {
    	  elfCode = br1.next();
    	  if(br1.hasNextLine()) elfCode2 = br1.next();
    	  if(br1.hasNextLine()) elfCode3 = br1.next();
          
          for(int i = 0; i < elfCode.length(); ++i) {
          		
          	if((elfCode2.contains(elfCode.substring(i, i+1))) && (elfCode3.contains(elfCode.substring(i, i+1)))) {
          		repeatedLetter = elfCode.substring(i, i+1);
          		letterToNumber = letterToNumber(repeatedLetter);
          		sumCase2 += letterToNumber;
          		System.out.println("Repeated Letter: " + repeatedLetter + " Sum so far: " + sum + " letterValue: " + letterToNumber);
          		break;
          	}
            
          	
          	
          	
          }
      }
      
       System.out.println("Case 1 Answer: " + sum);
       System.out.println("Case 2 Answer: " + sumCase2);
      
      // Close the buffer and file; if you don't do
      // this, they will be "locked" and other code
      // won't be able to use the file correctly
      br.close();
      fr.close();
  }
  
  public static int letterToNumber(String letter) {
	  if(letter.equals("a")) return 1;
	  if(letter.equals("b")) return 2;
	  if(letter.equals("c")) return 3;
	  if(letter.equals("d")) return 4;
	  if(letter.equals("e")) return 5;
	  if(letter.equals("f")) return 6;
	  if(letter.equals("g")) return 7;
	  if(letter.equals("h")) return 8;
	  if(letter.equals("i")) return 9;
	  if(letter.equals("j")) return 10;
	  if(letter.equals("k")) return 11;
	  if(letter.equals("l")) return 12;
	  if(letter.equals("m")) return 13;
	  if(letter.equals("n")) return 14;
	  if(letter.equals("o")) return 15;
	  if(letter.equals("p")) return 16;
	  if(letter.equals("q")) return 17;
	  if(letter.equals("r")) return 18;
	  if(letter.equals("s")) return 19;
	  if(letter.equals("t")) return 20;
	  if(letter.equals("u")) return 21;
	  if(letter.equals("v")) return 22;
	  if(letter.equals("w")) return 23;
	  if(letter.equals("x")) return 24;
	  if(letter.equals("y")) return 25;
	  if(letter.equals("z")) return 26;
	  
	  if(letter.equals("A")) return 27;
	  if(letter.equals("B")) return 28;
	  if(letter.equals("C")) return 29;
	  if(letter.equals("D")) return 30;
	  if(letter.equals("E")) return 31;
	  if(letter.equals("F")) return 32;
	  if(letter.equals("G")) return 33;
	  if(letter.equals("H")) return 34;
	  if(letter.equals("I")) return 35;
	  if(letter.equals("J")) return 36;
	  if(letter.equals("K")) return 37;
	  if(letter.equals("L")) return 38;
	  if(letter.equals("M")) return 39;
	  if(letter.equals("N")) return 40;
	  if(letter.equals("O")) return 41;
	  if(letter.equals("P")) return 42;
	  if(letter.equals("Q")) return 43;
	  if(letter.equals("R")) return 44;
	  if(letter.equals("S")) return 45;
	  if(letter.equals("T")) return 46;
	  if(letter.equals("U")) return 47;
	  if(letter.equals("V")) return 48;
	  if(letter.equals("W")) return 49;
	  if(letter.equals("X")) return 50;
	  if(letter.equals("Y")) return 51;
	  if(letter.equals("Z")) return 52;
	  
	  return 0;
	  
  }
} 


