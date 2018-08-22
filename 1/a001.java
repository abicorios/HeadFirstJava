class Dog {
	String name;
	int size;
	Dog(String n, int s) {
		this.setName(n);
		this.setSize(s);
	}
	void setName(String n){
		name=n;
	}
	void setSize(int s){
		size=s;
	}
	String getName(){
		return name;
	}
}
public class a001 {
	public static void main (String[] args) {
		System.out.println(1);
		int a = 2;
		System.out.println(a);
		String s = "abc";
		System.out.println(s);
		Dog d=new Dog("rex",27);
		System.out.println(d.getName());
		System.out.println("абв");
		System.out.println((int)3.9);
	}
}
