import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
  public static void main(String[] args){
    Integer points = 0;
    Scanner inputStream = null;
    try{
      inputStream = new Scanner(new File("Test.txt"));
    }catch(FileNotFoundException e){
      System.out.println("File non trovato");
      System.exit(0);
    }
    while(inputStream.hasNextLine()) {
      String row = inputStream.nextLine();
      String[] game = row.split(" ");
      if(equiv(game[0]) == equiv(game[1])) points += 3;
      else if (result(game)) points += 6;
      points += usedPoints(game[1]);
    }
    System.out.println(points);
    inputStream.close();

  }

  private static int equiv(String game){return game.equals("A") || game.equals("X")? 0
      :(game.equals("B") || game.equals("Y"))? 1: 2;}
  private static int usedPoints(String game){return game.equals("X") ? 1 : (game.equals("Y")? 2 : 3);  }

  private static boolean result(String[] game){
    return equiv(game[0]) - equiv(game[1]) == -1 ||
        (equiv(game[0]) - equiv(game[1]) == 2);}
}
