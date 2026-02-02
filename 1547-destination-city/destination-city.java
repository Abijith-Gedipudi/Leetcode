class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> city=new HashSet<>();
        for(List<String> l: paths)
        {
            city.add(l.get(0));
        }
        for (List<String> path : paths) {
            String dest = path.get(1); 
            if (!city.contains(dest)) {
                return dest; 
            }
        }
        return "";
}
}