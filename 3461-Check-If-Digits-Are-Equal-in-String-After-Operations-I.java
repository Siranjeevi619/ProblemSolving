class Solution {
   static String reduce(String num) {
    int numsSize = num.length(); 
    StringBuilder result = new StringBuilder(); 
    for (int i = 0; i < numsSize - 1; i++) {
        int sum = (Integer.parseInt(String.valueOf(num.charAt(i))) + 
                   Integer.parseInt(String.valueOf(num.charAt(i + 1)))) % 10;
        
        result.append(sum); 
    }
    return new String(result); 
}


    public boolean hasSameDigits(String s) {
        int size = s.length();
        String rem = "";
        while (size > 2) {
            s = reduce(s);
            size = s.length();
        }
        if (s.charAt(0) == s.charAt(1)) {
            return true;
        }
        return false;
    }
}