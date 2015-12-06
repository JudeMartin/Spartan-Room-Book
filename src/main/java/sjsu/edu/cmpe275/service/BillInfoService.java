package sjsu.edu.cmpe275.service;

import sjsu.edu.cmpe275.model.BillInfo;

public interface BillInfoService {
	
	public BillInfo viewBill(Long guest_id);
	public void generateBill(Long guest_id);
	public void updateBill(BillInfo billInfo);

}
