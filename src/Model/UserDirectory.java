/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class UserDirectory extends organization {
   
    private ArrayList<User> userList;
        
    public UserDirectory(){
        this.userList=new ArrayList<User>();
        }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    
    
        public ArrayList<User> displayCase(){
            return userList;
        }
        
        public User createCase(User user){
           //System.out.println(app.getName());
          this.userList.add(user);
          return user;
        }
        public void removeRecord(User users){
        userList.remove(users);
}
}
