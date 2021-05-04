public class GamerManager  {
	
CustomerValidation customerValidation;
	
	

	public GamerManager(CustomerValidation customerValidation) {
		
		this.customerValidation = customerValidation;
	}


	public void add(Gamer gamer) {
		if (this.customerValidation.check(gamer)==true) {
			System.out.println(gamer.getFirstName()+" eklesdadsndi.");
		}
		
			
		}
		
		
		
		
	
	public void update(Gamer gamer) {
		
			System.out.println(gamer.getFirstName()+" güncellendi.");
			
		}
		
	
	public void delete(Gamer gamer) {
		
		
			System.out.println(gamer.getFirstName()+" silindi.");
			
		}
		
}
	


	
	

