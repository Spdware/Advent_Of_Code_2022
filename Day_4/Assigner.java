package Day_4;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Assigner {
  public static void main(String[] args){
    Scanner inputStream = null;
    Integer overlapping = 0;
    try{
      inputStream = new Scanner(new File("Test.txt"));
    }catch(FileNotFoundException e){
      System.out.println("File not found");
      System.exit(0);
    }

    while(inputStream.hasNextLine()){
      String row = new String(inputStream.nextLine());
      Elf elf1 = new Elf(row.substring(0,row.indexOf(",")));
      Elf elf2 = new Elf(row.substring(row.indexOf(",")+1));
      overlapping += elf1.isOverlapping(elf2);
    }
    System.out.println(overlapping);
  }
}
