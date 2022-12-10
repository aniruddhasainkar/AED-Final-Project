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
public class HighCourtCaseDirectory extends organization{
          private ArrayList<HighCourtCase> highcaseList;
        
    public HighCourtCaseDirectory(){
        this.highcaseList=new ArrayList<HighCourtCase>();
        }

    public ArrayList<HighCourtCase> getHighCaseList() {
        return highcaseList;
    }

    public void setCaseList(ArrayList<HighCourtCase> highcaseList) {
        this.highcaseList = highcaseList;
    }

    
    
        public ArrayList<HighCourtCase> displayCase(){
            return highcaseList;
        }
        
        public HighCourtCase createCase(HighCourtCase cases){
           //System.out.println(app.getName());
          this.highcaseList.add(cases);
          return cases;
        }
        public void removeRecord(HighCourtCase cases){
        highcaseList.remove(cases);
}
}
