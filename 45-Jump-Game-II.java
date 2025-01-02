class Solution {
    public int jump(int[] arr) {


        
        
        // int arrSize = arr.length;
        // if(arrSize == 0){
        //     return -1;
        // }
        // if(arrSize == 1){
        //     if(arr[0] !=0){
        //         return 0;
        //     }
        //     return arr[0];
        // }
        
        // if(arr[0] < 1){
        //     return -1;
        // }
        // int curr = 0;
        // int dest = arrSize-1;
        // int jumpCount = 0;
        // for(int i=0; i<dest;i++){
        //     if(arr[i]+curr > arrSize){
        //         jumpCount+=1;
        //         return jumpCount;
        //     }
        //     // curr +=i;
        //     i += curr + arr[i];
        //     jumpCount+=1;

        // }
        // return jumpCount;

        int jumpCount = 0;
        int current = 0;
        int far = 0;
        int arrSize = arr.length;
        for(int i=0;i<arrSize-1;i++){
            far = Math.max(far, i+arr[i]);
            if(i == current){
                jumpCount++;
                current = far;
            }

        }
        return jumpCount;
    }
}



// class Solution {
//     public int canJump(int[] nums) {
//         int maxLength = 0; 
//         int i = 0; 
//         int jumpCount = -1;         
//         while (i <= maxLength) {
//             if (i + nums[i] > maxLength) {
//                 maxLength = i + nums[i];
//                 jumpCount+=1;
//             }
//             if (maxLength >= nums.length - 1) {
//                 jumpCount+=1;
//                 // return jumpCount;
//                 break;
//                 // break;
//             }
//             i++;
//         }
//         return jumpCount;
//     }
// }