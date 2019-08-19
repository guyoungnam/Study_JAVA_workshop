package product;

public class ProductBiz {

	public void printProductInformation(Product prod){
		System.out.print(prod.getProductCode() + "\t");
		System.out.print(prod.getProductName() + "\t");
		System.out.print(prod.getManufacturers() + "\t");
		System.out.print(prod.getPrice() + "\t");
		System.out.print(prod.getMadeDate()+ "\t");
		System.out.println(printSales(prod.isSales()));
		
	}
	
	
	private  String printSales(boolean bool) {
		String text = "";
		text = bool ? "판매중" : "판매예정";
		return text;
	}

}
