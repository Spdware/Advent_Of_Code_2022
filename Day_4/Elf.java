package Day_4;

import java.util.ArrayList;

public class Elf {
  private ArrayList<Integer> rangeSection;

  public Elf(String row){
    rangeSection = new ArrayList<>();
    rangeSection.add(Integer.parseInt(row.substring(0, row.indexOf("-"))));
    rangeSection.add(Integer.parseInt(row.substring(row.indexOf("-")+1)));
  }

  public Integer getStartID(){return rangeSection.get(0);}
  private void setStartID(Integer first){rangeSection.add(0,first);}

  public Integer getFinishID(){return rangeSection.get(1);}
  private void setFinishID(Integer second){rangeSection.add(0,second);}

  public int isOverlapping(Elf e){
    //Check if the two don't overlap
    if(this.rangeSection.get(1) < e.getStartID() || this.rangeSection.get(0) > e.getFinishID()) return 0;
    //They overlap
    return 1;
  }

}
