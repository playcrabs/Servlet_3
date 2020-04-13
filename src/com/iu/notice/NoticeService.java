package com.iu.notice;

import java.util.ArrayList;

public class NoticeService {
	
	private NoticeDAO noticeDAO;
	
	public NoticeService() {
		this.noticeDAO = new NoticeDAO();
	}
	
	// 1. List 글 목록
	public ArrayList<NoticeDTO> noticeList() throws Exception {
		return noticeDAO.noticeList();
	}
	
	// 2. Select 글 보기
	public NoticeDTO noticeSelect(int pnum) throws Exception {
		return noticeDAO.noticeSelect(pnum);
	}
	
	// 3. Post 글 쓰기
	public int noticeAdd(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.noticeAdd(noticeDTO);
	}
	
	// 4. Update 글 수정
	public int NoticeUpdate(NoticeDTO noticeDTO) throws Exception {
		return noticeDAO.noticeAdd(noticeDTO);
	}
	
	// 5. Delete 글 삭제
	public int noticeDelete(int pnum) throws Exception {
		return noticeDAO.noticeDelete(pnum);
	}

}
