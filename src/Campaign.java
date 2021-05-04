

public class Campaign  {

	private int id;
	private String campaignName;
	private double discountAmount;
	
	public Campaign() {
		
		
	}
	
	
	public Campaign(int id, double discountAmount, String campaignName) {
		super();
		this.id = id;
		this.discountAmount = discountAmount;
		this.campaignName= campaignName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getDiscountAmount() {
		return discountAmount;
	}


	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
	
	
	
	
}
