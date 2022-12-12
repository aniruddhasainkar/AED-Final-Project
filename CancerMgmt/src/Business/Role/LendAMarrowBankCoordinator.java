/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.BoneMarrowBankOrganization;
import Business.UserAccount.User;

import javax.swing.JPanel;
import userinterface.BoneMarrowBankCoordinatorRole.BoneMarrowBankCoordinatorWorkAreaJPanel;

/**
 *
 * @author JKU
 */
public class LendAMarrowBankCoordinator extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new BoneMarrowBankCoordinatorWorkAreaJPanel(account, (BoneMarrowBankOrganization)organization, enterprise, business, network);
    }
    
}
