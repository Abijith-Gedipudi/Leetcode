class Solution {
    public int maxDistance(int[] colors) {
        int l=0;
        int r=colors.length-1;
        while(colors[l]==colors[r])
        {
            r--;
        }
        int a=r;
        r=colors.length-1;
        while(colors[l]==colors[r])
        {
            l++;
        }
        int b=r-l;
        return Math.max(a,b);
        
    }
}