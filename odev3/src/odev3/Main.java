package odev3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
User user1=new User();
user1.setId(1);
user1.setUserName("Hasan");
user1.seteMail("hasan@gmail.com");

User user2=new User(2,"�zg�r","ozgur@gmail.com");

User[] users= {user1,user2};

UserManager userManager=new UserManager();
userManager.addUsers(users);

Instructor instructor1=new Instructor();
instructor1.setDersProgrami("Kal�t�m,Abstract Class");
instructor1.setDersAnlatimi("Kal�t�m �st s�n�flar�n alt s�n�flara baz� �zelliklerini miras b�rakmas�d�r.Dede ve torunlar� gibi.");
instructor1.setVerilenOdev("Bu derste ki konular� detayl� ara�t�r�n�z");

InstructorManager instructorManager=new InstructorManager();
instructorManager.ekle(instructor1);


Student student1=new Student();
student1.setYapilanOdev("Kal�t�m Ara�t�r�ld�.");
student1.setDegerlendirme("Ders �ok �yiydi");
student1.setYoklama(true);
student1.setTamamlamaOrani(50);


StudentManager studentManager=new StudentManager();
studentManager.ekle(student1);


	}
	
	

}
