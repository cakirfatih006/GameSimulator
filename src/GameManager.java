
public class GameManager {
	




	public void sell(Gamer gamer, Game game, Campaign campaign) {
		
		
		
		System.out.println(game.getGameName() +" oyunu "+gamer.getFirstName()+" isimli oyuncu taraf�ndan sat�n al�nd�.");
		
		
		if (campaign.getDiscountAmount()!=0) {
		
			double sonuc= game.getGamePrice()-(game.getGamePrice()/100*campaign.getDiscountAmount());
		String message=campaign.getCampaignName()+" kampanyas�ndan faydaland�n�z. Oyunun indirimli fiyat� " +sonuc +" Tl'dir";
		System.out.println(message);
		
		}
		
		
		
		
		
	}
	

}
