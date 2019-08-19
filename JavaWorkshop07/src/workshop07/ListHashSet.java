package workshop07;

import java.util.ArrayList;
import java.util.HashSet;

public class ListHashSet {
	public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int inx = 0; inx < size; inx++) {
            int data = (int)((Math.random()*10) + 1);
            list.add(data);
            System.out.print(data + " ");
        }
        
        System.out.println();
        
        for(int inx = 0; inx < list.size(); inx++) {
            set.add(list.get(inx));
        }

//      위 반복문 대신 addAll()를 사용해도 동일한 결과를 얻을 수 있음.        
//      set.addAll(list);   

        System.out.println(set);
    }

}
