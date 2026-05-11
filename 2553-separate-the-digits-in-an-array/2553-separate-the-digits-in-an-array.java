class Solution {
    // static int reverse(int i ){
    //     int rev = 0;
    //     while( i > 0){
    //         rev = rev * 10 + i % 10;
    //         i /= 10;
    //     }
    //     return rev;
    // }
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i : nums) {
            if (i < 10) {
                ls.add(i);
            } else {
                String str = String.valueOf(i);

                for (char ch : str.toCharArray()) {
                    ls.add(ch - '0');
                }
            }
        }
        int size = ls.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = ls.get(i);
        }
        return res;
    }
}