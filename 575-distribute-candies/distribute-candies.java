class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> h=new HashSet<>();
        for(int i: candyType)
        {
            h.add(i);
        }
        int n=candyType.length/2;
        if(n>h.size())
        {
            return h.size();
        }
        else
        {
            return n;
        }
        

    }
}