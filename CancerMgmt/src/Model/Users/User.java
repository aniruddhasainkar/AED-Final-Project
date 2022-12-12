/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Users;

import java.util.ArrayList;

/**
 *
 * @author keerthanaakannan
 */
public class User {
    String userName;
    String password;
    String userType;
    
    //public class User(userName,password,userType)(
           
            //)

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    //public LoginCred(){
        //loginlist = new ArrayList<LoginCred>();
        //loginlist.add(new LoginCred("user","password123","user"));
    //}
}
