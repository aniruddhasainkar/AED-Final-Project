/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cases;

import java.util.ArrayList;
import organization.organization;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keerthanaakannan
 */

public class CaseDirectory extends organization {
   
    private ArrayList<Case> caseList;
        
    public CaseDirectory(){
        this.caseList=new ArrayList<Case>();
        }

    public ArrayList<Case> getCaseList() {
        return caseList;
    }

    public void setUserList(ArrayList<Case> caseList) {
        this.caseList = caseList;
    }

    
    
        public ArrayList<Case> displayCase(){
            return caseList;
        }
        
        public Case createCase(Case cases){
           //System.out.println(app.getName());
          this.caseList.add(cases);
          return cases;
        }
        public void removeRecord(Case cases){
        caseList.remove(cases);
}
}

    
