package prob1;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Key k = (Key)obj;
		return firstName.equals(k.getFirstName()) && lastName.equals(k.getLastName());
	}

	@Override
	public int hashCode(){
		int result = firstName.hashCode() + lastName.hashCode();
		return result;
	}
}
