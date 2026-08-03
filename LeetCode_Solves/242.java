class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)) return true;
        
        return false;
    }
}


// Method - 2
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            if(hm.get(ch) != null) {
                if(hm.get(ch) == 1) {
                    hm.remove(ch);
                }
                else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            }
            else {
                return false;
            }
        }

        return hm.isEmpty();
    }
}
