/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.LegalOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubhamsable
 */
public class LegalOrganization extends Organization{

    public LegalOrganization() {
        super(Organization.LegalType.LegalOfficer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LegalOfficerRole());
        return roles;
    }
     
}