public class Main {
  public static void main(String[] args){
    //Copy here your input
    String test = "placeholder";
    String marker = "";

    for(int i = 0; i < test.length(); i++){
      marker = marker.concat(String.valueOf(test.charAt(i)));
      if(marker.length() == 4){
        marker = markerChecker(marker);
        if(marker.isEmpty()){i = i+1;System.out.println(i);System.exit(0);}
    }
  }
}
  public static String markerChecker(String marker){
    for(int i = 0; i < 4; i++){
      if(marker.indexOf(marker.charAt(i)) != marker.lastIndexOf(marker.charAt(i)))
        return marker.substring(marker.indexOf(marker.charAt(i))+1);
    }
    return "";
  }
}
