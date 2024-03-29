/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.User;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author KeerthanaaKannan
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        GovernmentCoordinator("GovernmentCoordinator"),
        LegalOfficer("LegalOfficer"),
        MedicalTechnician("MedTech"),
        BoneMarrowBankCoordinator("BoneMarrowBankCoordinator"),
        SystemCoordinator("SystemCoordinator");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}