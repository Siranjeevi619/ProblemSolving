/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // int ans = 1;
        // int result = 1;
        // while(n!=0){
        //     if(isBadVersion(ans) == true){
        //         result = ans;
        //         break;
        //     }
        //     n--;
        //     ans++;
        // }
        // // return -1;
        // return result;

        // if(n == 1){
        //     return 1;
        // }

        int result = -1;
        int low = 0;
        int high = n;
        while(low < high){
            int mid = low + (high - low) / 2;
           if( isBadVersion(mid)){
            high = mid;
           }
           else{
            low = mid+1;
           }
        }
        return low;
    }
}