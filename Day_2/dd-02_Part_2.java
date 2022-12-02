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
      points += 3*equiv(game[1]) + result(game);

    }
    System.out.println(points);
    inputStream.close();

  }

  private static int equiv(String game){return game.equals("A") || game.equals("X")? 0
      :(game.equals("B") || game.equals("Y"))? 1: 2;}
  private static int usedPoints(String game){return game.equals("A") ? 1 : (game.equals("B")? 2 : 3);  }

  private static int result(String[] game){
    String used;
    switch (game[1]){
      case "X":
        if(game[0].equals("A"))used = "C";else if(game[0].equals("B")) used = "A"; else used = "B";
        return usedPoints(used);
      case "Y":
        return usedPoints(game[0]);
      default:
        if(game[0].equals("A"))used = "B";else if(game[0].equals("B")) used = "C"; else used = "A";
        return usedPoints(used);

    }
  }
}
