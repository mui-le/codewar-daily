/*
A stream of data is received and needs to be reversed.

Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:

11111111  00000000  00001111  10101010
 (byte1)   (byte2)   (byte3)   (byte4)
should become:

10101010  00001111  00000000  11111111
 (byte4)   (byte3)   (byte2)   (byte1)
 */
package codewars.com;

public class Kata {

    public static int[] DataReverse(int[] data) {
        int[] arr = new int[data.length];
        int count = 0;
        for (int i = data.length; i > 0; i = i - 8) {
            for (int j = 0; j < 8; j++) {
                arr[j + count] = data[i - 8 + j];
            }
            count += 8;
        }
        return arr;
    }

}
