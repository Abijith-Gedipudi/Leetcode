class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str[]=paragraph.toLowerCase().split("[^a-z]+");
        HashMap<String,Integer> h = new HashMap<>();
        for(String word: str )
        {
            h.put(word,h.getOrDefault(word,0)+1);
        }
        for (String b : banned) {
            h.remove(b);
        }
        int max=0;
        String result="";
        for(String s : h.keySet())
        {
            if(h.get(s)>max)
            {
                max=h.get(s);
                result=s;
            }
        }
        return result;
         
    }
}