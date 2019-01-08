package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface{

	private OutfitInterface colorDress;
	
	public Gandalf (OutfitInterface theColorDress) {
		colorDress= theColorDress;
	}

	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "You look good, but stay humble my friend! ";
	}

	@Override
	public String giveColorDress() {
		// TODO Auto-generated method stub
		return this.colorDress.changeDress();
	}
	
}
