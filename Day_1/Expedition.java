import java.util.*;
import java.util.Scanner;


public class Expedition{
    static ArrayList<Elf> elves;
    private static int tempCalories;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        do{
            while(!a.isEmpty()){
                tempCalories += Integer.parseInt(a);
                Elf tmp = new Elf(tempCalories);
                elves.add(tmp);
                a = scanner.nextLine();
            }
        }while(!a.isEmpty());
        scanner.close(); 
        System.out.println(mostCarryingElf());
    }

    public void Expedition(){
        Expedition.elves = new ArrayList<Elf>();
        Expedition.tempCalories = 0;
    }

    private static int mostCarryingElf(){return max();}

    private static int max(){
        int maxTemp =-15;
        elves.toArray();
        for(Elf e : elves){
            if(e.getCalorie() > maxTemp){ maxTemp = e.getCalorie();}
        }
        return maxTemp;
    }
}