package workshop07;

import java.util.HashSet;

public class SetTest {
    public static void main(String args[]){
        String str = args[0];
        char chars[] = str.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        
        for(int inx = 0; inx<chars.length; inx++){
            set.add(chars[inx]);
        }
        
        System.out.println(set);
    }

}
