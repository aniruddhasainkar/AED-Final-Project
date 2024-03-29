/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.SystemCoordinator;
import java.util.ArrayList;

/**
 *
 * @author anniruddhasainkar
 */
public class SystemCoordinatorOrganization extends Organization{

    public SystemCoordinatorOrganization() {
        super(Organization.Type.SystemCoordinator.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SystemCoordinator());
        return roles;
    }
     
}