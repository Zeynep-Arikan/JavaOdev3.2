package odev2;

public class StudentManager extends UserManager {
    public void Dersler(Student student){
        System.out.println("Öğrencinin ismi:"+ student.getName()+ student.getLastname());
        System.out.println("Öğrencinin numarası:" + student.getNumber());
        System.out.println("Öğrencinin yaşı:" + student.getAge());
        System.out.println("Öğrencinin id'si:" + student.getId());
        System.out.println("Öğrencinin aldığı ders:"  + student.getLessons());
    }
    
}
