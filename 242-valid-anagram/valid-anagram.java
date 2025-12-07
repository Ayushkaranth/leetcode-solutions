class Solution {
     public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {return false;}
        HashMap<Character,Integer> mapA = new HashMap<>();
        HashMap<Character,Integer> mapB = new HashMap<>();

        //for s and a
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(mapA.containsKey(key)){
                int freq = mapA.get(key);
                mapA.put(key,freq+1);
        }
            else{
                mapA.put(key,1);
            }
        }

        for(int i=0;i<t.length();i++){
            char key = t.charAt(i);
            if(mapB.containsKey(key)){
                int freq = mapB.get(key);
                mapB.put(key,freq+1);
            }
            else{
                mapB.put(key,1);
            }
        }

        for(char key : mapA.keySet()){
            int val1 = mapA.get(key);
            if(!mapB.containsKey(key)){return false;}
            int val2 = mapB.get(key);
            if(val1!=val2){return false;}
        }
        return true;
    }
}