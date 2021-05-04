

public class CustomerValidationManager implements CustomerValidation{

	@Override
	public boolean check(Gamer gamer) {
		if (gamer.getFirstName()=="fatih" &&
				gamer.getLastName()=="cakir") {
			System.out.println();
			return true;
		}
		else {
			return false;
	}

	
	}
	}

