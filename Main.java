import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner inputScanner = null;
    try{
      inputScanner = new Scanner(new File("Test1.txt"));
    }catch(FileNotFoundException e){
      System.out.println("File error");
      System.exit(0);
    }
    String line = inputScanner.nextLine();
    int c = 0, lineLength = line.length(), count = 4*lineLength-4;
    int[][] trees = new int[lineLength][lineLength];
    while(true){
      for(int i = 0; i < lineLength;i++){trees[c][i] = Integer.parseInt(String.valueOf(line.charAt(i)));}
      c++;
      if(inputScanner.hasNextLine())line = inputScanner.nextLine();else break;
    }
    for(int i = 1; i < lineLength-1; i++) {
      for (int j = 1; j < lineLength-1; j++){
        boolean visibleBeforeRow = true, visibleBeforeCol = true,visibleAfterRow = true,visibleAfterCol = true;
        for(int k = 0; k < j; k++){
          if(trees[i][k] >= trees[i][j]){visibleBeforeRow = false;}
          if(trees[k][i] >= trees[i][j]){visibleBeforeCol = false;}
        }
        for(int k = lineLength-1; k > j; k--){
          if(trees[i][k] >= trees[i][j]){visibleAfterRow = false;}
          if(trees[k][i] >= trees[i][j]){visibleAfterCol = false;}
        }
        if(visibleBeforeRow || visibleBeforeCol || visibleAfterRow || visibleAfterCol)count++;
      }
    }
    System.out.println(count);
  }
}
