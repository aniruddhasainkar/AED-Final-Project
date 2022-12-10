/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import DB4OUtil.Person;
import Model.Users.UserDirectory;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class Ecosystem {
    private static Ecosystem business;
    private Person person;
    

    public static Ecosystem getInstance(){
        if(business == null){
            business = new Ecosystem();
        }
        return business;
    }
    
    public void setPerson(Person p){
        this.person = p;
    }
    
    public Person getPerson(){
       return this.person;
    }
    
    public static void setInstance(Ecosystem system) {
        business = system;
    }
}
