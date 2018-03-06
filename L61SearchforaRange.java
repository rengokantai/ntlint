public class L61SearchforaRange {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    // jz gp 1
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int[] ans = new int[2];
        int ansl=-1;
        for(int l=0,r=A.length-1;l<=r;){
            int mid = l+(r-l)/2;
            if(A[mid]>target){
                r=mid-1;
            }
            if(A[mid]<target){
                l=mid+1;
            }
            if(A[mid]==target){
                ansl=mid;
                r=mid-1;
            }
        }
        
        int ansr=-1;
        for(int l=0,r=A.length-1;l<=r;){
            int mid = l+(r-l)/2;
            if(A[mid]>target){
                r=mid-1;
            }
            if(A[mid]<target){
                l=mid+1;
            }
            if(A[mid]==target){
                ansr=mid;
                l=mid+1;
            }
        }
        ans[0]=ansl;
        ans[1]=ansr;
        return ans;
        
    }
}
