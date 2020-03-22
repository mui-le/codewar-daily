/*
 In this kata, you must create a digital root function.
A digital root is the recursive sum of all the digits in a number. 
Given n, take the sum of the digits of n. If that value has more than one digit, 
continue reducing in this way until a single-digit number is produced. 
This is only applicable to the natural numbers.Here's how it works:
digital_root(16)
=> 1 + 6
=> 7
digital_root(942)
=> 9 + 4 + 2
=> 15 ...
=> 1 + 5
=> 6
 */
package codewars.com;

public class DRoot {
    public static int digital_root(int n) {
        int tong = 0; 
        while(n>0){
           int soDu = n%10;
           n = n/10;
           tong = tong + soDu;
        }
        while(tong>9){
           tong = digital_root(tong);
        }
        return tong;
        
//        return (1 + (n - 1) % 9); cách 2
//   cách 3
//while(n > 9){
//      n = n/10 + n % 10;
//      }
//    return(n);
  }
    public static void main(String[] args) {
        int n = digital_root(15253);
        System.out.println(n);
    }
}
