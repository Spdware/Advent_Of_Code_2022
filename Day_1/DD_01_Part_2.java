package Day_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main{
  public static void main(String[] args){
    Integer tmp = 0, maxCalories = 0;
    List<Integer> elves = new ArrayList<>();
    Scanner inputStream = null;
    try{
      inputStream = new Scanner(new File("Test.txt"));
    }catch(FileNotFoundException e){
      System.out.println("File non trovato");
      System.exit(0);
    }
    while(inputStream.hasNextLine()){
      String row = inputStream.nextLine();
      if(row.isEmpty()){elves.add(tmp);tmp = 0;}
      else{tmp += Integer.parseInt(row);}}
    for(int i = 0; i < 3; i++)maxCalories += maxElf(elves);
    inputStream.close();
    System.out.println(maxCalories);
  }
  //Calculate the maxiumum calories among the elves' backpack
  private static int maxElf(List<Integer> elves){
    Integer max = 0;
    for(Integer e : elves){
      if(e > max) max = e;
    }
    elves.remove(max);
    System.out.println(max);
    return max.intValue();
  }
}
