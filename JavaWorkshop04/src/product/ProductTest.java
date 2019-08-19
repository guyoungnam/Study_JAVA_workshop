package product;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class ProductTest {

	public static void main(String[] args) {

		Product prod01 = 
				new Product("p1", "G프로", "LG", 50000, "2014-07-08",true);
		Product prod02 = 
				new Product("p2", "G프로3", "LG", 100000,"2014-08-08",false);
		Product prod03 = 
				new Product("p3", "스마트TV", "LG", 300000, "2014-06-08",true);
		Product prod04 = 
				new Product("p4", "newTV", "LG", 500000, "2014-08-08",false);
		
		ProductBiz biz = new ProductBiz();
		Scanner s = new Scanner(System.in);
		while (true) {
			printMenu();
			int inputMenu = s.nextInt();
			
			if (inputMenu == 1) {
				printTitle();
				biz.printProductInformation(prod01);
				biz.printProductInformation(prod02);
				biz.printProductInformation(prod03);
				biz.printProductInformation(prod04);
			} else if (inputMenu == 2) {
				printTitle();
				if(prod01.isSales()){
					biz.printProductInformation(prod01);
				}
				if(prod02.isSales()){
					biz.printProductInformation(prod02);
				}
				if(prod03.isSales()){
					biz.printProductInformation(prod03);
				}
				if(prod04.isSales()){
					biz.printProductInformation(prod04);
				}
				
			} else if (inputMenu == 3) {
				printTitle();
				if(!prod01.isSales()){
					biz.printProductInformation(prod01);
				}
				if(!prod02.isSales()){
					biz.printProductInformation(prod02);
				}
				if(!prod03.isSales()){
					biz.printProductInformation(prod03);
				}
				if(!prod04.isSales()){
					biz.printProductInformation(prod04);
				}
			
			} else if(inputMenu == 9){
				break;
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}

		}
		System.out.println("LG전자 제품 조회 시스템을 종료합니다.");

	}

	private static void printTitle() {
		System.out.println("========================================================");
		System.out.println("제품코드\t제품명\t제조사\t판매가격\t제조일자\t\t판매유무");
		System.out.println("========================================================");
	}

	private static void printMenu() {
		System.out.println("***********************");
		System.out.println("1.제품 전체 목록보기");
		System.out.println("2.판매중인 제품 목록보기");
		System.out.println("3.판매 예정인 제품 목록보기");
		System.out.println("9.종료");
		System.out.println("***********************");
		System.out.print("메뉴입력 => ");
	}

}
