package luck;

import java.util.Scanner;

public class LuckPaperTest {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		LuckPaperBiz dao = new LuckPaperBiz();
		while (true) {
			printMenu(dao.selectAll());
			int inputMenu = s.nextInt();
			if(inputMenu == 1 ){
				if(printResult(dao.getLuck()))break;
			}else if(inputMenu == 9 ){
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	private static boolean printResult(String[] luck) {
		String message = "";
		boolean bool = false;
		if(luck!=null){
			if(!luck[0].equals("꽝")){
				message = "["+luck[0] + "] 당첨~축하드려요~";
			}else{
				message = "[아쉽네요~] 다음 기회에";
			}
			message += "\n남은 행운권 수 : "+ luck[1]+"개";
			if(luck[1].equals("0")){
				message += "\n행운권이 모두 소진되었습니다.^^\n안녕히 가세요";
				bool = true;
			}
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(message);
		return bool;
	}


	private static void printMenu(String[] list) {
		for (String s : list) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("1.행운권 추첨");
		System.out.println("9.종료");
		System.out.println("*****************************************");
	}
}

