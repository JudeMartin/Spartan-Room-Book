package sjsu.edu.cmpe275.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.BillInfoDAO;
import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.service.BillInfoService;

@Service
public class BillInfoServiceImpl implements BillInfoService{

	@Autowired
	private BillInfoDAO billInfoDAO;
	
	@Override
	public BillInfo viewBill(Long guest_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void generateBill(Long guest_id) {
		// TODO Auto-generated method stub
		billInfoDAO.generateBill(guest_id);
		
	}

	@Override
	public void updateBill(BillInfo billInfo) {
		// TODO Auto-generated method stub
		
	}

}
