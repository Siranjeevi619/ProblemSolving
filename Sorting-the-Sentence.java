class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        Arrays.sort(arr, (a, b) -> (a.charAt(a.length() - 1) - b.charAt(b.length() - 1)));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i += 1) {
            String a = arr[i];
            if (i != arr.length - 1) {
                sb.append(a.substring(0, a.length() - 1)+" ");
            }
            else{
                 sb.append(a.substring(0, a.length() - 1)); 
            }
        }
        return new String(sb);
    }
}