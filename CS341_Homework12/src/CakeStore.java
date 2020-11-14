
public class CakeStore {
	private CakeFactory cakeFactory;
	
	public CakeStore(CakeFactory cakeFactory) {
		this.cakeFactory = cakeFactory;
	}
	
	public Cake onlineOrder(String type) {
		
		//Complete online order
		Cake cake = cakeFactory.orderCake(type);
		
		//Preparation of the cake
		cake.prepare();
		cake.bake();
		cake.box();
		
		return cake;
	}
}
