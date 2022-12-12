/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.GovernmentCoordinator;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubhamsable
 */
public class GovernmentOrganization extends Organization{

    public GovernmentOrganization() {
        super(Organization.GovernmentType.Government.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentCoordinator());
        return roles;
    }
     
}