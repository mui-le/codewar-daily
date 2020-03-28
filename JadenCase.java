/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). 
Jaden is also known for some of his philosophy that he delivers via Twitter. 
When writing on Twitter, he is known for almost always capitalizing every word. 
For simplicity, you'll have to capitalize each word, check out how contractions
are expected to be in the example below.

Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, 
but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */
package codewars.com;

public class JadenCase {

    public static String toJadenCase(String s) {
        if (s != null && !s.isEmpty()) {
            s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1, s.length());
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    s = s.substring(0, i + 1) + String.valueOf(s.charAt(i + 1)).toUpperCase() 
                            + s.substring(i + 2, s.length());
                }
            }
            return s;
        }
        return null;
    }
    
    // Cách 2
//import org.apache.commons.lang3.text.WordUtils;
//public class JadenCase {
//
//  public String toJadenCase(String phrase) {
//    // TODO put your code below this comment
//    if(phrase == ""){
//      return null;
//    }
//    else{
//      return WordUtils.capitalize(phrase);
//    }
//  }
//}
    
    
    public static void main(String[] args) {
        String s = "anh ko doi qua";
        System.out.println(toJadenCase(s));
    }
}
