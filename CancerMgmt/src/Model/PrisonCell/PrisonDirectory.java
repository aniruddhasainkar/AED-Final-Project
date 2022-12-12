/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.PrisonCell;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class PrisonDirectory extends organization{
    private ArrayList<Prison> prisoncaseList;
        
    public PrisonDirectory(){
        this.prisoncaseList=new ArrayList<Prison>();
        }

    public ArrayList<Prison> getCaseList() {
        return prisoncaseList;
    }

    public void setUserList(ArrayList<Prison> prisoncaseList) {
        this.prisoncaseList = prisoncaseList;
    }

    
    
        public ArrayList<Prison> displayCase(){
            return prisoncaseList;
        }
        
        public Prison createCase(Prison cases){
           //System.out.println(app.getName());
          this.prisoncaseList.add(cases);
          return cases;
        }
        public void removeRecord(Prison cases){
        prisoncaseList.remove(cases);
}
}
