public class Main {
  public static void main(String[] args){
    //Copy here your input
    String test = "placeholder";
    String marker = "";

    for(int i = 0; i < test.length(); i++){
      marker = marker.concat(String.valueOf(test.charAt(i)));
      //Part 1
      if(marker.length() == 4){
      //Part 2
      //if(marker.length() == 14){
        marker = markerChecker(marker);
        if(marker.isEmpty()){i = i+1;System.out.println(i);System.exit(0);}
    }
  }
}
  public static String markerChecker(String marker){
    //Part 1
    for(int i = 0; i < 4; i++){
    //Part 2
    //for(int i = 0; i < 14; i++){
      if(marker.indexOf(marker.charAt(i)) != marker.lastIndexOf(marker.charAt(i)))
        return marker.substring(marker.indexOf(marker.charAt(i))+1);
    }
    return "";
  }
}
