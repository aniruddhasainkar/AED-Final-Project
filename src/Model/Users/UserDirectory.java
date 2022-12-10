/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Users;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class UserDirectory extends organization {
   
     private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
     public void setUserList(User ua) {
        userList.add(ua);
    }
    
    public User authenticateUser(String username, String password,String usertype){
        for (User ua : userList)
            if (ua.getUserName().equals(username) && ua.getPassword().equals(password) && ua.getUserType().equals(usertype)){
                return ua;
            }
        return null;
    }
    
    public User createUserAccount(String username, String password, String usertype){
        User userAccount = new User();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setUserType(usertype);
//        userAccount.setRole(role);
//        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }
}
