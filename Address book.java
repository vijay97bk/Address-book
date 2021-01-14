import java.util.HashMap;
import java.util.Map;

public class addressbook {
	public static void main(String[] args) {
	Map<Integer,Book> map=new HashMap<Integer,Book>();
    //Creating Books
    Book b1=new Book("Akshaya","Adisht","Nerul",400067 );
    Book b2=new Book("Aparna","More","Pune",400086 );
    Book b3=new Book("Advait","Jadhav","Kharghar",410210 );
    //Adding Books to map
    map.put(1,b1);
    map.put(2,b2);
 	 map.put(3,b3);

    //Traversing map
    for(Map.Entry<Integer, Book> entry:map.entrySet()){
        int key=entry.getKey();
        Book b=entry.getValue();
        System.out.println(key+" Details:");
        System.out.println(b.firstname+" "+b.lastname+" "+b.city+" "+b.pincode);
    }
	}
}
public class Info {
	double pincode;
	String firstname,lastname,city;
	public Info(double pincode, String firstname, String lastname, String city) {
	    this.pincode = pincode;
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.city = city;
	    this.quantity = quantity;
	}
}