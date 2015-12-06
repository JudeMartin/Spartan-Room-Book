package sjsu.edu.cmpe275.dao;

import sjsu.edu.cmpe275.model.BillInfo;

public interface BillInfoDAO {
	
	public BillInfo viewBill(Long guest_id);
	public void generateBill(Long guest_id);
	public void updateBill(BillInfo billInfo);

}
