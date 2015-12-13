package sjsu.edu.cmpe275.dao;

import java.util.List;

import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.model.Guest;

public interface BillInfoDAO {

	public BillInfo viewBill(Long payment_Id);

	public BillInfo generateBill(BillInfo billInfo);

	public void updateBill(BillInfo billInfo);

	public void deleteBill(Long payment_Id);

	public List<BillInfo> listGuest();
}