package aruna;

public class SetterDemo {
	int base;
	

	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public static void main(String[] args) {
		SetterDemo s=new SetterDemo();
		s.setBase(40);
		int ans=s.getBase();
		System.out.println(ans);
		
		

	}

}
