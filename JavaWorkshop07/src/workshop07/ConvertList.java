package workshop07;

import java.util.ArrayList;

public class ConvertList {
	public ArrayList<Integer> convertList(int array[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int inx = array.length; inx > 0; inx--) {
            list.add(array[inx - 1]);
        }
        
        return list;
    }
}
