package product2;


public class Product {

	private String productCode;// 제품코드
	private String productName;// 제품명
	private String manufacturers;// 제조사
	private int price;// 판매가격
	private String madeDate;// 출고일자
	private boolean isSales;// 판매유무
	
	
	public Product(String productCode, String productName,
			String manufacturers, int price, String madeDate , boolean isSales) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.manufacturers = manufacturers;
		this.price = price;
		this.madeDate = madeDate;
		this.isSales = isSales;
	}

	

	public boolean isSales() {
		return isSales;
	}

	public void setSales(boolean isSales) {
		this.isSales = isSales;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getManufacturers() {
		return manufacturers;
	}

	public void setManufacturers(String manufacturers) {
		this.manufacturers = manufacturers;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String getMadeDate() {
		return madeDate;
	}

	public void setMadeDate(String madeDate) {
		this.madeDate = madeDate;
	}
}
