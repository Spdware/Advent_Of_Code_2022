package Day_3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
  public static void main(String[] args){
    Scanner inputStream = null;
    Integer priority = 0;
    try{
      inputStream = new Scanner(new File("Test.txt"));
    }catch(FileNotFoundException e){
      System.out.println("File not found");
      System.exit(0);
    }
    while(inputStream.hasNextLine()) {
      Rucksack rucksack =new Rucksack(inputStream.nextLine());
      priority += rucksack.itemNeedingReallocation();
    }
    System.out.println(priority);
    inputStream.close();

  }

}

