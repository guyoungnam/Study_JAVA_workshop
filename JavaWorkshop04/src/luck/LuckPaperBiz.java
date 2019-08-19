package luck;

import java.util.Random;

public class LuckPaperBiz {

	private String[] list;
	
	public LuckPaperBiz() {
		list = new String[5];
		list[0] = "꽝";
		list[1] = "냉장고";
		list[2] = "스마트폰";
		list[3] = "꽝";
		list[4] = "도서상품권";
	}
	
	public String[] getLuck() {
		Random r = new Random();
		int index = 0;
		
		if(list.length > 0){
			index = r.nextInt(list.length);
			String[] luck = new String[]{list[index], String.valueOf(list.length-1)};
			list[index] = "";
			removeList();
			return luck;
		}else{
			return null;
		}
	}
	
	private void removeList() {
		String temp = "";
		for (int i = 0; i < list.length; i++) {
			if(list[i].length()==0){
				continue;
			}
			temp += list[i]+":";
		}
		list = temp.split(":");
	}

	public String[] selectAll(){
		
		return list;
	}

}

