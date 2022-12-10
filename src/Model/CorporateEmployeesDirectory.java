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
public class CorporateEmployeesDirectory extends organization{
    private ArrayList<CorporateEmployees> corpEmpList;
        
    public CorporateEmployeesDirectory(){
        this.corpEmpList=new ArrayList<CorporateEmployees>();
        }

    public ArrayList<CorporateEmployees> getCorporateEmployeesList() {
        return corpEmpList;
    }

    public void setUserList(ArrayList<CorporateEmployees> corpEmpList) {
        this.corpEmpList = corpEmpList;
    }

    
        public ArrayList<CorporateEmployees> displayCorporateEmployees(){
            return corpEmpList;
        }
        
        public CorporateEmployees createCorporateEmployees(CorporateEmployees corp){
           //System.out.println(app.getName());
          this.corpEmpList.add(corp);
          return corp;
        }
        public void removeRecord(CorporateEmployees corp){
        corpEmpList.remove(corp);
}   
}
