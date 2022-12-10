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
public class VitalsDirectory extends organization{
   private ArrayList<Vitals> vitalsList;
        
    public VitalsDirectory(){
        this.vitalsList=new ArrayList<Vitals>();
        }

    public ArrayList<Vitals> getVitalsList() {
        return vitalsList;
    }

    public void setUserList(ArrayList<Vitals> vitalsList) {
        this.vitalsList = vitalsList;
    }

    
    
        public ArrayList<Vitals> displayVitals(){
            return vitalsList;
        }
        
        public Vitals createVitals(Vitals vitals){
           //System.out.println(app.getName());
          this.vitalsList.add(vitals);
          return vitals;
        }
        public void removeRecord(Vitals vitals){
        vitalsList.remove(vitals);
}   
}
