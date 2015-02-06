package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {

	@Id
    @Pattern(regexp = "^\\d{9}$", message = "Phone Number must be 9 digits long.")
    private String phoneNumber;

	@Size(min = 4, max = 20, message = "Username must be between 4 and 20 characters long.")
	private String name;

    @Size(min = 10, max = 100, message = "Address must be between 10 and 100 characters long.")
    private String address;

    @Pattern(regexp = "^\\d{5}$", message = "ZIP Code must be 5 digits long.")
    private String zipCode;

	public Customer() {
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
