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
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author JKU
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new AdminWorkAreaJPanel(enterprise, business, network);
    }

    
    
}
