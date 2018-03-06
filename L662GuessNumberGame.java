public class L662GuessNumberGame extends GuessGame {
    /**
     * @param n an integer
     * @return the number you guess
     */
     //jz gp 1
    public int guessNumber(int n) {
        // Write your code here
        int l=1,r=n;
  
        while(l<=r){
            int mid = l+(r-l)/2;
            int result = guess(mid);
            if(result==0){
                return mid;
            }
            if(result==1){
                l=mid+1;
            }
            if(result==-1){
                r=mid-1;
            }
        }
        return 0;
    }
}
