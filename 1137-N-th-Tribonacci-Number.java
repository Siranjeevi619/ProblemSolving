class Solution {
    public static int tribonacci(int n) {
        // int n == 0{
        //     return 0;
        // }
        // int 
        int [] trib = new int[n + 1];
        trib[0] = 0;
        if(n == 0){
            return 0;
        }
        trib[1] = 1;
          if(n == 1){
            return 1;
        }
        trib[2] = 1;
          if(n == 2){
            return 1;
        }
        // trib[3] = 

        for(int i = 3;i<=n;i++){
            trib[i] =  trib[i - 1] +  trib[i - 2] +  trib[i -3];
        }

        return trib[n];
    }
}