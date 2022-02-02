/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev2;

/**
 *
 * @author CASPER
 */
public class InstructorManager extends UserManager{
    public void kurslar(Instructor instructor){
        System.out.println("Eğitmen: "+ instructor.getName() +  instructor.getLastname());
        System.out.println(" Eğitmenin verdiği kurslar"+ instructor.getCourse());
        System.out.println("Eğitmenin yaşı" + instructor.getAge());
    }
    
}
