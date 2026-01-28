class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> h=new HashMap<>();
        String str[]=s1.split("\\s+");
        for(String s : str)
        {
            h.put(s,h.getOrDefault(s,0)+1);
        }
        String str2[]=s2.split("\\s+");
        for(String s : str2)
        {
            h.put(s,h.getOrDefault(s,0)+1);
        }
        ArrayList<String> al=new ArrayList<>();
        for(String key : h.keySet())
        {
            if(h.get(key)==1)
            {
                al.add(key);
            }
        }
        return al.toArray(new String[0]);
    }
}