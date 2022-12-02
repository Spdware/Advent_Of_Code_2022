package Day_1;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{

  public static void main(String[] args){
    Integer maxCalories = 0, tmp = 0;
    Scanner inputStream = null;
    try{
      inputStream = new Scanner(new File("Test.txt"));
    }catch(FileNotFoundException e){
      System.out.println("File non trovato");
      System.exit(0);
    }
    //Calculate the maximum calories in the elves bacpack
    while(inputStream.hasNextLine()){
      String row = inputStream.nextLine();
      if(row.isEmpty()){if(tmp > maxCalories) maxCalories = tmp;tmp = 0;}
      else{tmp += Integer.parseInt(row);}}
    inputStream.close();
    System.out.println(maxCalories);
  }
}
