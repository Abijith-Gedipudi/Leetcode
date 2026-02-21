class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length/2;
        for(int i : nums)
        {
            h.put(i,h.getOrDefault(i,0)+1);
            if(h.get(i)==n)
            {
                return i;
            }
        }
        
        return -1;
    }
}