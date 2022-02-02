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
public class UserManager {
    
    public void TakeCourse(User user){
        System.out.println("bu kurs alındı"+ user.getName());
    }
    public void CancelCourse(User user){
        System.out.println("Bu kurs iptal edildi" + user.getName());
    }
    
    
    
}
