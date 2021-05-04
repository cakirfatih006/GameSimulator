import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Game game1= new Game(1, "CS go", 80);
		Gamer gamer1= new Gamer(1, "ckr", "fatih", "cakir", "2332", LocalDate.of(1995, 5, 5));
		Campaign campaign1= new Campaign(1, 20, "Yeni üye");
		
		System.out.println("------Oyuncu islemleri------");
		GamerManager gamerManager= new  GamerManager(new CustomerValidationManager());
		gamerManager.add(gamer1);
		gamerManager.delete(gamer1);
		
		
		System.out.println("--------Kampanyalar-------");
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		
		
		System.out.println("-----Kampanyalý satis------");
		GameManager gameManager = new GameManager();
		gameManager.sell(gamer1, game1, campaign1);
		
		
		
		
		
		
	}
}
