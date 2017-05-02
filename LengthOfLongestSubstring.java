import java.util.Hashtable;
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        int end=0; 
        int len = s.length();
        //if (len < 0) return len;
        Hashtable<Character, Integer> hashtable= new Hashtable<Character, Integer>();
        
        while(start < len && end < len){
            
            if (hashtable.containsKey(s.charAt(end))) {
                if (hashtable.get(s.charAt(end)) >= start){
                    if (maxLen < (end - start)){
                        maxLen = end - start;
                    } 
                    start = hashtable.get(s.charAt(end))+1;
                }
                hashtable.remove(s.charAt(end));
                hashtable.put(s.charAt(end), end);
                
            }else{
                hashtable.put(s.charAt(end), end);
            }    
            end = end+1;
                
        }
        if (maxLen < (end - start)){
            maxLen = end - start;
        }     
        return maxLen;
        
    }
}
