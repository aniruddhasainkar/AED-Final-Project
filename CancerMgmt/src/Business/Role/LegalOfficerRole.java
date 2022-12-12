/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LegalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.User;

import javax.swing.JPanel;
import userinterface.LegalOfficerRole.LegalOfficerWorkAreaJPanel;

/**
 *
 * @author JKU
 */
public class LegalOfficerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new LegalOfficerWorkAreaJPanel(account, (LegalOrganization) organization, enterprise, business, network);
    }
    
}
