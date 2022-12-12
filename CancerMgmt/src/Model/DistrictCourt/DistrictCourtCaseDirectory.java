/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DistrictCourt;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class DistrictCourtCaseDirectory extends organization {
      private ArrayList<DistrictCourtCase> distcaseList;
        
    public DistrictCourtCaseDirectory(){
        this.distcaseList=new ArrayList<DistrictCourtCase>();
        }

    public ArrayList<DistrictCourtCase> getDistCaseList() {
        return distcaseList;
    }

    public void setCaseList(ArrayList<DistrictCourtCase> distcaseList) {
        this.distcaseList = distcaseList;
    }

    
    
        public ArrayList<DistrictCourtCase> displayCase(){
            return distcaseList;
        }
        
        public DistrictCourtCase createCase(DistrictCourtCase cases){
           //System.out.println(app.getName());
          this.distcaseList.add(cases);
          return cases;
        }
        public void removeRecord(DistrictCourtCase cases){
        distcaseList.remove(cases);
}
}
