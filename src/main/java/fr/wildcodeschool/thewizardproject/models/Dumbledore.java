package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DumbledoreId")
public class Dumbledore implements WizardInterface {
	
	private OutfitInterface colorDress;
	
	@Autowired
		public Dumbledore (@Qualifier ("outfitBk")OutfitInterface theColorDress) {
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
