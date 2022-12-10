/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Civil;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class CivilEmployeesDirectory extends organization{
    private ArrayList<CivilEmployees> civEmpList;
        
    public CivilEmployeesDirectory(){
        this.civEmpList=new ArrayList<CivilEmployees>();
        }

    public ArrayList<CivilEmployees> getCivilEmployeesList() {
        return civEmpList;
    }

    public void setUserList(ArrayList<CivilEmployees> civEmpList) {
        this.civEmpList = civEmpList;
    }

    
        public ArrayList<CivilEmployees> displayCivilEmployees(){
            return civEmpList;
        }
        
        public CivilEmployees createCivilEmployees(CivilEmployees civil){
           //System.out.println(app.getName());
          this.civEmpList.add(civil);
          return civil;
        }
        public void removeRecord(CivilEmployees civil){
        civEmpList.remove(civil);
}   
}
