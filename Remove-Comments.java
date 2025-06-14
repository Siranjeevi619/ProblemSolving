class Solution {
      public List<String> removeComments(String[] source) {
            ArrayList<String> result = new ArrayList<>();

            boolean block = false;

            String temp = \\;

            for (String line : source) {
                  if (!block) {
                        temp = \\;
                  }

                  for (int i = 0; i < line.length(); i++) {
                        if (block) {
                              if (line.charAt(i) == '*' && i + 1 < line.length() && line.charAt(i + 1) == '/') {
                                    block = false;
                                    i++;
                              }
                        } else {
                              if (line.charAt(i) == '/' && i + 1 < line.length() && line.charAt(i + 1) == '/') {
                                  
                                    break;
                              }

                              if (line.charAt(i) == '/' && i + 1 < line.length() && line.charAt(i + 1) == '*') {
                                   
                                    block = true;
                                    i++;
                                    continue;
                              }
                              temp += line.charAt(i);

                        }
                  }
                  if (!block) {
                        if (temp.length() > 0) {
                              result.add(temp);
                        }
                  }
            }

            return result;
      }
}