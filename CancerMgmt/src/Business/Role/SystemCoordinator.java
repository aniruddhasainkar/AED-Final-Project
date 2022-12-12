/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SystemCoordinatorOrganization;
import Business.UserAccount.User;

import javax.swing.JPanel;
import userinterface.SystemCoordinatorRole.SystemCoordinatorWorkAreaJPanel;

/**
 *
 * @author KeerthanaaKannan
 */
public class SystemCoordinator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SystemCoordinatorWorkAreaJPanel(account, (SystemCoordinatorOrganization)organization, enterprise, business, network);
    }
    
}
