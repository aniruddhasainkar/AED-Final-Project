/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.HighCourt;

//import Model.Criminal.CriminalEmployees;
import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class HighCourtEmployeesDirectory extends organization {
    private ArrayList<HighCourtEmployees> highEmpList;
        
    public HighCourtEmployeesDirectory(){
        this.highEmpList=new ArrayList<HighCourtEmployees>();
        }

    public ArrayList<HighCourtEmployees> getHighCourtEmployeesList() {
        return highEmpList;
    }

    public void setUserList(ArrayList<HighCourtEmployees> highEmpList) {
        this.highEmpList = highEmpList;
    }

    
        public ArrayList<HighCourtEmployees> displayHighCourtEmployees(){
            return highEmpList;
        }
        
        public HighCourtEmployees createHighCourtEmployees(HighCourtEmployees high){
           //System.out.println(app.getName());
          this.highEmpList.add(high);
          return high;
        }
        public void removeRecord(HighCourtEmployees high){
        highEmpList.remove(high);
}    
}

