/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GovernmentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.User;

import javax.swing.JPanel;
import userinterface.GovernmentCoordinatorRole.GovernmentCoordinatorWorkAreaJPanel;

/**
 *
 * @author JKU
 */
public class GovernmentCoordinator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new GovernmentCoordinatorWorkAreaJPanel(account, (GovernmentOrganization) organization, enterprise, business, network);
    }
    
}
