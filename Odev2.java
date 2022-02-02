package odev2;
public class Odev2 {

    public static void main(String[] args) {
        Student student1= new Student();
        student1.setAge(21);
        student1.setId(1);
        student1.setName("zeynep");
        student1.setLastname("arıkan");
        student1.setNumber(157);
        student1.setLessons("Java");
        
        System.out.println("**********");
        
        Student student2 = new Student();
        student2.setAge(26);
        student2.setId(2);
        student2.setName("Oğuzhan");
        student2.setLastname("Şahin");
        student2.setNumber(123);
        student2.setLessons("JavaScript");
        
        Instructor instructor1 = new Instructor();
        instructor1.setAge(35);
        instructor1.setCourse(" JAVA " + " JavaScript");
        instructor1.setName("Engin");
        instructor1.setLastname("Demiroğ");
        
        
        StudentManager studentManager = new StudentManager();
        studentManager.Dersler(student1);
        studentManager.Dersler(student2);
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.kurslar(instructor1);
        
        
        
                
   
    }
    
}
