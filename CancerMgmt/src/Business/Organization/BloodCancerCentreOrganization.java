/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CancerCentreCoordinator;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shubhamsable
 */
public class BloodCancerCentreOrganization extends Organization{

    public BloodCancerCentreOrganization() {
        super(Organization.BloodCancerCentreType.BloodCancerCentre.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CancerCentreCoordinator());
        return roles;
    }
     
}