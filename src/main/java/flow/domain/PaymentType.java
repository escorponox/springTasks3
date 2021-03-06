package flow.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.text.WordUtils.capitalizeFully;

public enum PaymentType implements Serializable {

	EFECTIVO,
	TARJETA;

	public static List<PaymentType> asList() {
		PaymentType[] all = PaymentType.values();
		return Arrays.asList(all);
	}

	@Override
	public String toString() {
		return capitalizeFully(name().replace('_',' '));
	}

}