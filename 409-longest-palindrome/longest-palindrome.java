class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        int count=0;
        boolean flag= true;
        for(char c :h.keySet())
        {
            int freq=h.get(c);
            count=count + (freq/2)*2;
            if(freq % 2 == 1 && flag==true)
            {
                count=count+1;
                flag=false;
            }
        }
        return count;
        
    }
}