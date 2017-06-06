package sheet13OwnerAndPets;

public class Owner {

	private String name;
	private String address;
	private String phone;
	private Pet [] pets;
	
	public static int OwnerID=1000;
	
	public Owner () {
		OwnerID++;
	}
	
	public Owner (String name, String address, String phone, Pet[] pets) {
		this();
		setName(name);
		setAddress(address);
		setPhone(phone);
		setPet(pets);
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Pet[] getPet() {
		return pets;
	}

	public void setPet(Pet[] pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Owner: " + name + ", Address: " + address + ", phone: " + phone ;
	}
		
}
