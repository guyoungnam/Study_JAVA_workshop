package workshop07;

import java.util.ArrayList;

public class ListTest02 {
public static void main(String[] args) {
        
        int array[] = {3,4,2,5,2,3,6,7,5,7,9};
        ConvertList convert = new ConvertList();
        
        ArrayList<Integer> list = convert.convertList(array);
        
        for(int inx = 0; inx < list.size(); inx++) {
            System.out.println(list.get(inx));
        }
    }

}
