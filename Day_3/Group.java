package Day_3;

import java.util.ArrayList;
import java.util.ArrayList;

public class Group {
  ArrayList<String> rucksacks = new ArrayList<String>();;

  public Group(String r1, String r2, String r3){
    rucksacks.add(r1);
    rucksacks.add(r2);
    rucksacks.add(r3);
  }

  public int badgeFinder(){
    for(char c : rucksacks.get(0).toCharArray()){
      if(rucksacks.get(1).indexOf(c) != -1 && rucksacks.get(2).indexOf(c) != -1)
        return (c >= 65 && c <= 90)? (c - 64 + 26) : c - 96;
    }
    System.out.println("Error");
    return 0;
  }
}
