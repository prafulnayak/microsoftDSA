import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class StringSource {
    private static String removeDuplicate(String str){
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        for(char c: str.toCharArray()){
            hashSet.add(c);
        }
        Iterator<Character> it = hashSet.iterator();
        char[] c = new char[hashSet.size()];
        int i =0;
        while (it.hasNext()){
            c[i]  = it.next();
            i++;
        }
        return new String(c);
    }

    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count =0;
        for(String s:words){
            if(pref.equals(s.substring(0, n)))
                count++;
        }
        return count;
    }
}
