/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.SupremeCourt;


import java.util.ArrayList;

/**
 *
 * @author keerthanaakannan
 */
public class SupremeCourtEmployeesDirectory {
     private ArrayList<SupremeCourtEmployees> supremeEmpList;
        
    public SupremeCourtEmployeesDirectory(){
        this.supremeEmpList=new ArrayList<SupremeCourtEmployees>();
        }

    public ArrayList<SupremeCourtEmployees> getSupremeCourtEmployeesList() {
        return supremeEmpList;
    }

    public void setUserList(ArrayList<SupremeCourtEmployees> supremeEmpList) {
        this.supremeEmpList = supremeEmpList;
    }

    
        public ArrayList<SupremeCourtEmployees> displaySupremeCourtEmployees(){
            return supremeEmpList;
        }
        
        public SupremeCourtEmployees createSupremeCourtEmployees(SupremeCourtEmployees supreme){
           //System.out.println(app.getName());
          this.supremeEmpList.add(supreme);
          return supreme;
        }
        public void removeRecord(SupremeCourtEmployees supreme){
        supremeEmpList.remove(supreme);
}    
}
