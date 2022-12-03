package Day_3;

public class Rucksack {
  private final String firstContainer;
  private final String secondContainer;

  public Rucksack(String container){
    this.firstContainer =  container.substring(0, (container.length() / 2));
    this.secondContainer = container.substring(container.length() / 2);

  }

  public int itemNeedingReallocation(){
    for(char c : firstContainer.toCharArray()){
      if(secondContainer.indexOf(c) != -1)
        return (c >= 65 && c <= 90)? (c - 64 + 26) : c - 96;
    }
    System.out.println("Error "+ firstContainer + secondContainer);
    return 0;
  }
}


