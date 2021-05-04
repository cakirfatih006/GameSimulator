public class GamerManager  {
	
CustomerValidation customerValidation;
	
	

	public GamerManager(CustomerValidation customerValidation) {
		
		this.customerValidation = customerValidation;
	}


	public void add(Gamer gamer) {
		if (this.customerValidation.check(gamer)==true) {
			System.out.println(gamer.getFirstName()+" eklendi.");
		}
		else {
			
			System.out.println("Mernis bilgileriyle kiþi bilgisi eþleþmedi.");
		}
			
		}
		
		
		
		
	
	public void update(Gamer gamer) {
		
			System.out.println(gamer.getFirstName()+" güncellendi.");
			
		}
		
	
	public void delete(Gamer gamer) {
		if (this.customerValidation.check(gamer)) {
			System.out.println(gamer.getFirstName()+" silindi.");
		}
		else {
		
			System.out.println("Mernis bilgileriyle kiþi bilgisi eþleþmedi.");
			
		}
		
}
	}
	


	
	

