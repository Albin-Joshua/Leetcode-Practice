/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1;
        int r=n;
        int m=0;
        int result = Integer.MIN_VALUE;
        do{
            m=l+(r-l)/2;
            result = guess(m);
            if(result == -1){
                r = m-1;
            }
            else if(result == 1){
                l = m+1;
            }
            else{
                return m;
            }
        }while(result !=0);

        // Required to avoid compile-time error, but won't be executed
        return m;// Unreachable code, but necessary for compilation
    }
}