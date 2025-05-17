class Solution {
    public void sortColors(int[] nums) {
        int zeroCounter = 0;
        int oneCounter = 0;
        int twoCounter = 0;
        for(int i : nums){
            if(i == 0){
                zeroCounter++;
            }
            else if(i == 2){
                twoCounter++;
            }
            else{
                oneCounter+=1;
            }

        }
        System.out.println("0->"+zeroCounter);
    
        for(int i = 0 ; i < zeroCounter;i+=1){
            nums[i] = 0;
        }

 System.out.println(zeroCounter+"->"+(oneCounter+zeroCounter));
           for(int i = zeroCounter ; i < oneCounter+ zeroCounter;i+=1){
            nums[i] = 1;
        }
           
        System.out.println((zeroCounter+ oneCounter -1)+"->"+(twoCounter + oneCounter));
           for(int i =zeroCounter+ oneCounter ; i < nums.length;i+=1){
            nums[i] = 2;
        }
        


    }
}