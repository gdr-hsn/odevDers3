package odev3;

public class StudentManager {
	public void goster(Student student) {
		System.out.println(
				student.getYapilanOdev()+" "+
				student.getDegerlendirme()+" "+
				student.getTamamlamaOrani()+" "+
				student.getYoklama()
				
				);
				
	}
public void ekle(Student student) {
	System.out.println("�devler Yap�ld�");
	System.out.println("Yoklama Al�nd�");
	System.out.println("De�erlendirildi");
	System.out.println("Tamamlama Oran� Belirlendi");

	goster(student);
	
}
}
