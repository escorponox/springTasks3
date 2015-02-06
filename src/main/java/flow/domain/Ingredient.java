package flow.domain;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.text.WordUtils.capitalizeFully;

public enum Ingredient {

	JAMON,
	ACEITUNAS,
	ATUN,
	BACON,
	EXTRA_QUESO,
	SALCHICHA,
	HUEVO,
	CEBOLLA,
	CARNE,
	POLLO;

	public static List<Ingredient> asList() {
		Ingredient[] all = Ingredient.values();
		return Arrays.asList(all);
	}

	@Override
	public String toString() {
		return capitalizeFully(name().replace('_',' '));
	}

}
