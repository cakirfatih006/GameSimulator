
public class GameManager {
	




	public void sell(Gamer gamer, Game game, Campaign campaign) {
		
		
		
		System.out.println(game.getGameName() +" oyunu "+gamer.getFirstName()+" isimli oyuncu tarafýndan satýn alýndý.");
		
		
		if (campaign.getDiscountAmount()!=0) {
		
			double sonuc= game.getGamePrice()-(game.getGamePrice()/100*campaign.getDiscountAmount());
		String message=campaign.getCampaignName()+" kampanyasýndan faydalandýnýz. Oyunun indirimli fiyatý " +sonuc +" Tl'dir";
		System.out.println(message);
		
		}
		
		
		
		
		
	}
	

}
