class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while( i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j+=1;
            }
            else{
                ls.add(nums1[i]);
                i+=1;
                j+=1;
            }
        }
        int [] res = new int[ls.size()];
        int k = 0;
        while(k < ls.size()){
            res[k] = ls.get(k);
            k+=1;
        }
        return res;
    }
}