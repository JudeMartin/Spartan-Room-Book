package sjsu.edu.cmpe275.service;

import java.util.List;

import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.model.Reservation;

public interface BillInfoService {

	public BillInfo viewBill(Long payment_Id);

	public BillInfo generateBill(BillInfo billInfo);

	public void updateBill(BillInfo billInfo);

	public void deleteBill(Long payment_Id);

	public List<BillInfo> listBills();

}