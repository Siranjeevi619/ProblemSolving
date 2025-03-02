class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        TreeMap<Integer,Integer>map=new TreeMap<>();

        for(int i[]:nums1)
        {
            int id=i[0];
            int val=i[1];
            if(map.containsKey(id))
            {
                map.put(id,map.get(id)+val);
            }
            else
            {
                map.put(id,val);
            }
        }
         for(int i[]:nums2)
        {
            int id=i[0];
            int val=i[1];
            if(map.containsKey(id))
            {
                map.put(id,map.get(id)+val);
            }
            else
            {
                map.put(id,val);
            }
        }
        int res[][]=new int[map.size()][2];
        int i=0;

        for(Map.Entry<Integer,Integer>m:map.entrySet())
        {
            int id=m.getKey();
            int val=m.getValue();
            res[i][0]=id;
            res[i][1]=val;
            i++;
        }
        return res;
        
    }
}