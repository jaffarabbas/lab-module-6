import java.lang.*; 
class Person{
	public String name;
	public int Year;
	Person(){
		System.out.println("This is Super classs");
	}
}

class Student extends Person{
	public String major;
	
	Student(String name,int Year,String major)
	{
		 this.name = name;
		 this.Year = Year;
		 this.major = major;
	}

	 public String toString(){
            return name+"\n"+Year+"\n"+major;
	}
}

class Instructer extends Person{
	public double salery;
	Instructer(String name,int Year,double salery)
	{
		 this.name = name;
		 this.Year = Year;
		 this.salery = salery;
	}

	public String toString(){
		return name+"\n"+Year+"\n"+salery;
}
}

class task1{
	public static void main(String[] args) {
		Student obj = new Student("JAffar",2000,"BSSE");
		System.out.println(obj);
		Instructer obj2 = new Instructer("JAffar",2000,20000);
		System.out.println(obj2);
	}
}