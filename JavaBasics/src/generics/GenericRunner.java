package generics;

public class GenericRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<String>();
		list.addElement("sathya");
		System.out.println(list.toString());
		System.out.println(list.getElement(0));
		
		MyCustomList<Integer> list1 = new MyCustomList<Integer>();
		list1.addElement(22);
		System.out.println(list1.toString());
		System.out.println(list1.getElement(0));

	}

}
