/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author JKU
 */
public class DonorRequestDirectory {
    
    
    private ArrayList<DonorRequest> ReqList;

    public ArrayList<DonorRequest> getDonorRequestList() {return ReqList;}
    public void setDonorRequestList(ArrayList<DonorRequest> donorRequestList) {this.ReqList = donorRequestList;}
    
    public DonorRequestDirectory(){
        ReqList = new ArrayList<DonorRequest>();
    }
    
    public DonorRequest addDonorRequest(DonorRequest donorRequest)
    {
        ReqList.add(donorRequest);
        return donorRequest;
    }
    public DonorRequest removeDonorRequest(DonorRequest donorReq)
    {
        //DonorRequest donorRequest = new DonorRequest();
        //this.donor = donor
        ReqList.remove(donorReq);
        //return donorRequest;
        return null;
    }
    
    
    
    
    
    
}
