package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.util.Pager;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.setDelete(bankBookDTO);
	}

	public List<BankBookDTO> getList(Pager pager) throws Exception {
		
		int perPage = 10;
		int perblock = 5;
		
		long startRow = (pager.getCurPage()-1)*(perPage+1);
		long lastRow = pager.getCurPage()*perPage;
		
		pager.setStartRow(startRow);
		pager.setLastRow(lastRow);
		
//		//1. totalCount
//		long totalCount =  bankBookDAO.getTotalCount(pager);
//		
//		//2. totalPage
//		long totalPage = totalCount / perPage;
//		if(totalCount)
		
		
		return bankBookDAO.getList(pager);
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO) throws Exception {
		return bankBookDAO.getSelect(bankBookDTO);
	}
}
