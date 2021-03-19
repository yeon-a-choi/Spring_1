package com.ee.y1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> bankbookList(BankBookDTO bankBookDTO) throws Exception {
		
		List<BankBookDTO> ar = bankBookDAO.getList();
		
		return ar;
		
	}

}
