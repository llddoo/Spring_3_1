package com.iu.s3.account;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

		private AccountDAO accountDAO;
		
		public List<AccountDTO> getList(AccountDTO accountDTO) throws Exception {
			
			return accountDAO.getList(accountDTO);
		}
	
}
