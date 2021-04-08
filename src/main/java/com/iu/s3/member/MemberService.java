package com.iu.s3.member;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s3.util.FileManager;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private FileManager fileManager;
	
	public int memberUpdate(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberUpdate(memberDTO);
	}
	
	public int memberDelete(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberDelete(memberDTO);
	}
	
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return memberDAO.memberLogin(memberDTO);
	}
	public int memberJoin(MemberDTO memberDTO, MultipartFile avatar, HttpSession session) throws Exception {
		fileManager.save("member", avatar, session);
		
//		//1. 저장할 폴더 지정 /resources/upload/member
//		//2. os에서 인식 할 수 있는 실제 경로 찾기
//		//jsp : application - server : ServletContext
//		String path = session.getServletContext().getRealPath("resources/upload/member");
//		System.out.println(path);
//		//3. 실제 경로에 폴더가 없으면 파일 저장시 에러 발생
//		File file = new File(path); // 이 경로를 통해서 파일 객체를 만들고
//		
//		if(!file.exists()) { //exists 파일 유무 확인
//			file.mkdirs();	// makedirectory 폴더 생성
//		}
//		//4. 저장할 파일명 생성
//		//		a. 시간
//		Calendar ca = Calendar.getInstance();
//		long time = ca.getTimeInMillis();
//		
//		String name = avatar.getOriginalFilename();
//		
//		name = name.substring(name.lastIndexOf("."));
//		
//		System.out.println("확장자 : "+name);
//		
//		name = time+name;
//		System.out.println("최종 이름 : "+name);
//		
//		name = time+"_"+avatar.getOriginalFilename();
//		System.out.println("최종 이름 2 : "+name);
//		
//		//		b. UUID 중복되지않는이름생성
//		String fileName = UUID.randomUUID().toString();
//		fileName = fileName+"_"+avatar.getOriginalFilename();
//		System.out.println("UUID : "+fileName);
//		
//		//5. HDD 에 파일 저장
//		//file = new File(file, name); // 부모 부분엔 파일의경로를/자식 부분엔 파일의 이름
//		//	1) FileCopyUtils 클래스의 copy 메서드 사용
//		//FileCopyUtils.copy(avatar.getBytes(), file);
//		
//		//	2) MultipartFile 클래스의 메서드 사용
//		file = new File(file, fileName);
//		avatar.transferTo(file);
		
		
		return 0;
		//return memberDAO.memberJoin(memberDTO);
	}
	
}
