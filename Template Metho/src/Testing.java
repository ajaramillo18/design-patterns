
public class Testing {
	
	
	
	public static void main(String[] args) {


		MoneySender uni = new Uniteller();
		
		uni.sendMoney();
		
		MoneySender west = new WesternUnion();
		
		west.sendMoney();
		
		
	}

}
