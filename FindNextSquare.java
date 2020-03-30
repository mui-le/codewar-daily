
package codewars.com;

public class FindNextSquare {
     public static long findNextSquare(long sq) {
        if((long)Math.sqrt(sq)!= Math.sqrt(sq)){      
            return -1;
        }
        return (long)Math.pow((Math.sqrt(sq) + 1),2);
  }
    
}
