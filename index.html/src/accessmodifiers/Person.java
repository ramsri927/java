package accessmodifiers;

class Person1 {
	public String name;
	protected int age ;
	private String socialsecuritynumber;
	String address;

	Person1(String name , int age, String ssn,String address){
		this.name=name;
		this.age= age;
		this.socialsecuritynumber=ssn;
		this.address=address;
		
	}
	}
	
class employee extends Person1{
	String name ="ram";
	employee(String name , int age, String ssn,String address){
 super (name,age,ssn ,address); 
		
	}
}
public class Person{
	public static void main(String[] args) {
		employee e1 = new employee("ram ",20,"gsdjgjd","qwqewq");
		System.out.println(e1.name);
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.address);
	
		
		// TODO Auto-generated method stub

	}}
	


