import java.util.Date;
import java.util.Arrays;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;

public class Example {

  public static void main(String[] args) {
//    Treet treet = new Treet(
//      "Faydee",
//      "You in Me #KARD @Taipei",
//      new Date(1519293507000L)
//    );
//    System.out.printf("This is a new Treet: %s %n", treet);
//    System.out.println("The words are:");
//    for (String word : treet.getWords()) {
//      System.out.printf("%s%n", word);
//    }
//    
//    
//    Treet secondTreet = new Treet(
//      "journeytocode",
//      "@treehouse makes learning Java sooooo fun! #treet",
//      new Date(1421878767000L)
//    );
//    
////    Treet[] treets = {treet, secondTreet};
//    Treet[] treets = {secondTreet, treet};
//    // 會依照日期由舊到新排序
//    Arrays.sort(treets);
//    for (Treet exampleTreet : treets) {
//      System.out.println(exampleTreet);
//    }
//    
//    Treets.save(treets);
    
    Treet[] reloadedTreets = Treets.load();
    for (Treet reloaded : reloadedTreets) {
      System.out.println(reloaded);
    }
    
  }
}