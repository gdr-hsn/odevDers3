package odev3;

public class InstructorManager {
	public void goster(Instructor instructor) {
		System.out.println(
				"�deviniz:"+instructor.getVerilenOdev()+
				" Ders ��eri�i:"+instructor.getDersAnlatimi()+
				" Ders Program�:"+instructor.getDersProgrami());
	}
public void ekle(Instructor instructor) {
	System.out.println("�dev Eklendi");
	System.out.println("Ders Anlat�ld�");
	System.out.println("Ders Program� Yay�nland�");
	goster(instructor);
	
}

}
