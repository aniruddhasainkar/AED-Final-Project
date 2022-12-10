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
public class SupremeCourtCaseDirectory {
      private ArrayList<SupremeCourtCase> supcaseList;
        
    public SupremeCourtCaseDirectory(){
        this.supcaseList=new ArrayList<SupremeCourtCase>();
        }

    public ArrayList<SupremeCourtCase> getSupCaseList() {
        return supcaseList;
    }

    public void setCaseList(ArrayList<SupremeCourtCase> supcaseList) {
        this.supcaseList = supcaseList;
    }

    
    
        public ArrayList<SupremeCourtCase> displayCase(){
            return supcaseList;
        }
        
        public SupremeCourtCase createCase(SupremeCourtCase cases){
           //System.out.println(app.getName());
          this.supcaseList.add(cases);
          return cases;
        }
        public void removeRecord(SupremeCourtCase cases){
        supcaseList.remove(cases);
}
}

