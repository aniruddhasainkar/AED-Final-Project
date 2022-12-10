/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Appointments;

import java.util.ArrayList;
import organization.organization;

/**
 *
 * @author keerthanaakannan
 */
public class AppointmentDirectory extends organization {
    Appointment app;
    public static ArrayList<Appointment> appList;
        public AppointmentDirectory(){
            appList=new ArrayList<Appointment>();
        }

        public ArrayList<Appointment> displayCase(){
            return appList;
        }
        
        public Appointment createCase(Appointment app){
           //System.out.println(app.getName());
          appList.add(app);
          return app;
          
        }
        public void removeRecord(Appointment app){
        appList.remove(app);
}

}


