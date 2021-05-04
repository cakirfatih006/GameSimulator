import java.time.LocalDate;

public class Gamer {

	private int id;
	private String nickName;
	private String firstName;
	private String lastName;
	private String nationalyId;
	private LocalDate birthdate;
	public Gamer() {
		
	}
	
	
	public Gamer(int id, String nickName, String firstName, String lastName, String nationalyId, LocalDate birthdate) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalyId = nationalyId;
		this.birthdate = birthdate;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalyId() {
		return nationalyId;
	}


	public void setNationalyId(String nationalyId) {
		this.nationalyId = nationalyId;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	
	
	
	
	
	
	
}
