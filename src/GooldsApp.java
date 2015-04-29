
public class GooldsApp {
	public static void main(String[] args) {
		Goods goods = new Goods();
		
		goods.setName("Nikon");
		goods.setCountSold(100);
		goods.setCountStock(200);
		goods.setPrice(200000);

		goods.show();
	}
}
