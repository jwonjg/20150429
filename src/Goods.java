
public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	public void show() {
		System.out.println("상품이름:" + name + ", 가격:" + price + ", 재고:"
				+ countStock + ", 팔린:" + countSold);
	}
}
