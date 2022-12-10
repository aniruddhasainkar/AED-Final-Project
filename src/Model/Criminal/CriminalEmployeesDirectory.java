/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Criminal;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class CriminalEmployeesDirectory extends organization{
   private ArrayList<CriminalEmployees> crimEmpList;
        
    public CriminalEmployeesDirectory(){
        this.crimEmpList=new ArrayList<CriminalEmployees>();
        }

    public ArrayList<CriminalEmployees> getCriminalEmployeesList() {
        return crimEmpList;
    }

    public void setUserList(ArrayList<CriminalEmployees> crimEmpList) {
        this.crimEmpList = crimEmpList;
    }

    
        public ArrayList<CriminalEmployees> displayCriminalEmployees(){
            return crimEmpList;
        }
        
        public CriminalEmployees createCriminalEmployees(CriminalEmployees criminal){
           //System.out.println(app.getName());
          this.crimEmpList.add(criminal);
          return criminal;
        }
        public void removeRecord(CriminalEmployees criminal){
        crimEmpList.remove(criminal);
}    
}
