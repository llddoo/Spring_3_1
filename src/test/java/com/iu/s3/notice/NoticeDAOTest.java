package com.iu.s3.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;
import com.iu.s3.board.notice.NoticeDAO;
import com.iu.s3.board.notice.NoticeDTO;
import com.iu.s3.util.Pager;

public class NoticeDAOTest extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;

//	//@Test
//	public void getListTest (Pager pager) throws Exception {
//		List<NoticeDTO> ar = noticeDAO.getList(pager);
//		assertNotEquals(0, ar.size());
//
//	}
	@Test
	public void setInsertTest() throws Exception {
		for(int i=0;i<120;i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setWriter("test Writer"+i);
			noticeDTO.setTitle("test Title"+i);
			noticeDTO.setContents("test Contents"+i);
			int result = noticeDAO.setInsert(noticeDTO);
			if(i%10==0) {
				Thread.sleep(500);
			}
		}
	}


}
