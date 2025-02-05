class Solution {
    static String swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        String result = new String(arr);
        System.out.println(result);
        return result;
    }

    public boolean areAlmostEqual(String s1, String s2) {
        // char[] s2Arr = s2.toCharArray();
        int size = s1.length();
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0 ; i < size ; i +=1){
            if(s1.charAt(i) != s2.charAt(i)){
                index.add(i);
            }
            if(index.size() > 2){
                return false;
            }
        }
        if(index.size() == 0){
            return true;
        }
        if(index.size() == 2){
            int i = index.get(0);
            int j = index.get(1);
            if(s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)){
                return true;
            }
        }
        return false;
    }
}