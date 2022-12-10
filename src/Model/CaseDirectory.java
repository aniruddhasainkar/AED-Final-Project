/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import organization.organization;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author keerthanaakannan
 */

public class CaseDirectory extends organization {
    Case cases;
    public static ArrayList<Case> caseList;
        public CaseDirectory(){
            caseList=new ArrayList<Case>();
        }

        public ArrayList<Case> displayCase(){
            return caseList;
        }
        
        public Case createCase(Case cases){
           System.out.println(cases.getName());
          caseList.add(cases);
          return cases;
          
        }
        public void removeRecord(Case cases){
        caseList.remove(cases);
}

}

    
