import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner inputScanner = null;
    int N = 24;
    int[][][] grid = new int[N][N][N];
    int count = 0;
    try{inputScanner = new Scanner(new File("Test.txt"));}
    catch(FileNotFoundException e){System.out.println("File error");System.exit(0);}

    //Creating the grid
    while (inputScanner.hasNextLine()){
      String[] line = inputScanner.nextLine().split(",");
      int x = Integer.parseInt(line[0]);
      int y = Integer.parseInt(line[1]);
      int z = Integer.parseInt(line[2]);
      grid[x][y][z] = 1;
      count +=6;

      //Searching if the new block has another one near itself
      if((x != 0) && grid[x-1][y][z] == 1)count -= 2;
      if(grid[x+1][y][z] == 1)count -= 2;
      if((y != 0) && grid[x][y-1][z] == 1)count -= 2;
      if(grid[x][y+1][z] == 1)count -= 2;
      if((z != 0) && grid[x][y][z-1] == 1)count -= 2;
      if(grid[x][y][z+1] == 1)count -= 2;
    }
    System.out.println("Part 1: "+count);


  }
}
