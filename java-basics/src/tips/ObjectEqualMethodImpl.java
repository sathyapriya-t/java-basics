package tips;

import java.util.Objects;

class Client{
	private int id;

	public Client(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	//implement when you want to equal objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return id == other.id;
	}
}

public class ObjectEqualMethodImpl {

	public static void main(String[] args) {

		Client c1 = new Client(1);
		Client c2 = new Client(1);
		
		//if we did the equals of object with out the equals and hashcode it will fail
		//compare
		System.out.println(c1.equals(c2));
		
		

	}

}
