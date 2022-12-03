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
      System.out.println("File non trovato");
      System.exit(0);
    }
    while(inputStream.hasNextLine()) {
      Group rucksack =new Group(inputStream.nextLine(), inputStream.nextLine(), inputStream.nextLine());
      priority += rucksack.badgeFinder();
    }
    System.out.println(priority);
    inputStream.close();

  }

}

