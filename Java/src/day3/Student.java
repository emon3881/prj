package day3;

public class Student {
	int id;
	double hight;
	
	public Student(int i,double h){
		
	id=i;
	hight=h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


Student tump = new Student(23,5.5);
tump.show();

	}
public void show(){
	System.out.println(id);
	System.out.println(hight);
	

	}
}