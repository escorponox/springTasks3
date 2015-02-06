package flow.domain;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.text.WordUtils.capitalizeFully;

public enum Base {

	FINA,
	CLASICA,
	PAN;

	public static List<Base> asList() {
		Base[] all = Base.values();
		return Arrays.asList(all);
	}

	@Override
	public String toString() {
		return capitalizeFully(name().replace('_',' '));
	}

}
