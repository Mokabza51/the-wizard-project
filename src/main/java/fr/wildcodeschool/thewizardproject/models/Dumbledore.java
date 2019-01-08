package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private OutfitInterface colorDress;
	
	public Dumbledore (OutfitInterface theColorDress) {
		colorDress= theColorDress;
	}
	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "You've got the swag, but are you a good gentleman ? ";
	}

	@Override
	public String giveColorDress() {
		// TODO Auto-generated method stub
		return this.colorDress.changeDress();
	}
	
}
