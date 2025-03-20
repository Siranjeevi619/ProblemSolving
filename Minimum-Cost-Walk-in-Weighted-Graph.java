class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int m=query.length;
        int[] res=new int[m];
        DisJointSet ds=new DisJointSet(n);
        for(int[] edge : edges){
            ds.union(edge[0],edge[1]);
            int parent=ds.find(edge[0]);
            ds.bitwise[parent]&=edge[2];
        }
        for(int i=0;i<m;i++){
            int[] q=query[i];
            int parent=ds.find(q[0]);
            if(parent==ds.find(q[1])) res[i]=ds.bitwise[parent];
            else res[i]=-1;
        }
        return res;
    }
}
class DisJointSet{
    int[] parent;
    int[] size;
    int[] bitwise;
    public DisJointSet(int n){
        parent=new int[n];
        size=new int[n];
        bitwise=new int[n];
        Arrays.fill(bitwise,-1);
        Arrays.fill(size,1);
        for(int i=0;i<n;i++) parent[i]=i;
    }
    public int find(int u){
        if(parent[u]==u) return u;
        return parent[u]=find(parent[u]);
    }
    public boolean union(int u,int v){
        int ul_u=find(u);
        int ul_v=find(v);
        if(ul_u==ul_v) return false;
        if(size[ul_u]>size[ul_v]){
            parent[ul_v]=ul_u;
            size[ul_u]+=size[ul_v];
            bitwise[ul_u]&=(bitwise[ul_v]==-1?bitwise[ul_u]:bitwise[ul_v]);
        }else{
            parent[ul_u]=ul_v;
            size[ul_v]+=size[ul_u];
            bitwise[ul_v]&=(bitwise[ul_u]==-1?bitwise[ul_v]:bitwise[ul_u]);
        }
        return true;
    }
}