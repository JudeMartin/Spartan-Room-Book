package sjsu.edu.cmpe275.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.BillInfoDAO;
import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.service.BillInfoService;

@Service
public class BillInfoServiceImpl implements BillInfoService {

	@Autowired
	private BillInfoDAO billInfoDAO;

	@Transactional
	@Override
	public BillInfo viewBill(Long payment_Id) {

		return billInfoDAO.viewBill(payment_Id);
	}

	@Transactional
	@Override
	public void updateBill(BillInfo billInfo) {
		billInfoDAO.updateBill(billInfo);
	}

	@Transactional
	@Override
	public void deleteBill(Long payment_Id) {
		// TODO Auto-generated method stub
		billInfoDAO.deleteBill(payment_Id);
	}

	@Transactional
	@Override
	public void generateBill(BillInfo billInfo) {
		// TODO Auto-generated method stub
		billInfoDAO.generateBill(billInfo);
	}

}