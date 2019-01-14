package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class OutfitBk implements OutfitInterface {

	@Override
	public String changeDress() {
		return "The wizard's dress is black";
	}
}
