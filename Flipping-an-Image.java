class Solution {
    static void reverse(int [] arr){
        int left = 0;
        int right = arr.length -1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left+=1;
            right-=1;
        }

    }
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
       for(int [] a : image){
        reverse(a);
       }
       for(int i = 0 ; i < size ; i+=1){
        for(int j = 0; j < size ; j+=1){
            image[i][j] = image[i][j] == 0 ? 1 : 0;
        }
       }
       return image;
    }
}