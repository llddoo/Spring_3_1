package com.iu.s3.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class BankBookDAOTest extends MyAbstractTest {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	//@Test
	public void setUpdateTest()throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(7);
		
		bankBookDTO = bankBookDAO.getSelect(bankBookDTO);
		
		bankBookDTO.setBookName("정기예금");
		
		int result = bankBookDAO.setUpdate(bankBookDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void setDeleteTest()throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(8);
		int result = bankBookDAO.setDelete(bankBookDTO);
		
		assertEquals(1, result);
	}
	
	
	
//	//@Test
//	public void getListTest()throws Exception{
//		List<BankBookDTO> ar = bankBookDAO.getList();
//		assertNotEquals(0, ar.size());
//	}
	
	//@Test
	public void getSelectTest()throws Exception{
		BankBookDTO bankBookDTO = bankBookDAO.getSelect(null);
		assertNotNull(bankBookDTO);
	}
	
	@Test
	public void setWriteTest() throws Exception {
		
		for(int i=0;i<200;i++) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookName("BookName"+i);
			bankBookDTO.setBookRate(0.12);
			bankBookDTO.setBookSale("Y");
			int result = bankBookDAO.setWrite(bankBookDTO);
			if(i%10 ==0) {
				Thread.sleep(500);
			}
		}
		//assertEquals(1, result);
		System.out.println("종료");
	}
	
	
	

}