package com.iu.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnect;

public class NoticeDAO {
	// 1. List 글 목록
	public ArrayList<NoticeDTO> noticeList() throws Exception {
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();

		Connection con = DBConnect.getConnect();
		String sql = "Select * from notice order by pnum asc";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setPnum(rs.getInt("pnum"));
			noticeDTO.setPname(rs.getString("pname"));
			noticeDTO.setName(rs.getString("name"));
			noticeDTO.setDate(rs.getString("date"));
			noticeDTO.setView(rs.getInt("view"));
			noticeDTO.setPost(rs.getString("post"));
		}

		rs.close();
		st.close();
		con.close();

		return ar;

	}

	// 2. Select 글 보기
	public NoticeDTO noticeSelect(int pnum) throws Exception {
		NoticeDTO noticeDTO = null;

		Connection con = DBConnect.getConnect();
		String sql = "select * from notice where pnum=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, pnum);
		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			noticeDTO = new NoticeDTO();
			noticeDTO.setPnum(rs.getInt("pnum"));
			noticeDTO.setPname(rs.getString("pname"));
			noticeDTO.setName(rs.getString("name"));
			noticeDTO.setDate(rs.getString("date"));
			noticeDTO.setView(rs.getInt("view"));
			noticeDTO.setPost(rs.getString("post"));
		}

		rs.close();
		st.close();
		con.close();

		return noticeDTO;
	}

	// 3. Post 글 쓰기
	public int noticeAdd(NoticeDTO noticeDTO) throws Exception {
		int result = 0;
		Connection con = DBConnect.getConnect();
		String sql = "insert into notice values(pn_seq, ?, ?, sysdate, pv_seq, ?)";
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, noticeDTO.getPname());
		st.setString(2, noticeDTO.getName());
		st.setString(3, noticeDTO.getPost());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	// 4. Update 글 수정
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception {
		int result = 0;

		Connection con = DBConnect.getConnect();
		String sql = "update notice set pname=?, post=?, date=?";
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, noticeDTO.getPname());
		st.setString(2, noticeDTO.getPost());
		st.setString(3, noticeDTO.getDate());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	// 5. Delete 글 삭제
	public int noticeDelete(int pnum) throws Exception {
		int result = 0;
		
		Connection con = DBConnect.getConnect();
		String sql = "delete notice where pnum=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, pnum);
		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}
}
