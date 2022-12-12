/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.HLA.HLACount;
import Business.HLA.PersonHLA;
import Business.Role.DoctorRole;
import Business.Role.LendAMarrowBankCoordinator;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author shubhamsable
 */
public class BoneMarrowBankOrganization extends Organization{

    HLACount hlaCount;
    
    public BoneMarrowBankOrganization() {
        super(Organization.BoneMarrowBankType.BoneMarrowBank.getValue());
        hlaCount = new HLACount();
        PersonHLA h = new PersonHLA();
        h.updateHLAlist("HLA_A,HLA_B");
        hlaCount.HLACountAdd(h,6);
        h = new PersonHLA();
        h.updateHLAlist("HLA_A");
        hlaCount.HLACountAdd(h,5);
        h = new PersonHLA();
        h.updateHLAlist("HLA_A,HLA_B,HLA_C");
        hlaCount.HLACountAdd(h,7);
    }

    public HLACount getInventory() {
        return hlaCount;
    }
    
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getHlaComboCounts();
    }

    public void setInventory(HLACount inventory) {
        this.hlaCount = inventory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LendAMarrowBankCoordinator());
        return roles;
    }
     
}