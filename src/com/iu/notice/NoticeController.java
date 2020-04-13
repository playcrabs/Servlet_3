package com.iu.notice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("/NoticeController")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NoticeService noticeService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NoticeController() {
		super();
		this.noticeService = new NoticeService();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String command = request.getPathInfo();
		String method = request.getMethod();

		boolean check = true;

		String path = "";

		try {
			
			// 1. List 글 목록
			if (command.equals("/noticeList")) {
				ArrayList<NoticeDTO> ar = noticeService.noticeList();
				request.setAttribute("list", ar);
				
				path = "../WEB-INF/views/notice/noticeList.jsp";
			} 
			
			// 2. Select 글 보기
			else if (command.equals("/noticeSelect")) {
				int pnum = Integer.parseInt(request.getParameter("pnum"));
				
				NoticeDTO noticeDTO = noticeService.noticeSelect(pnum);
				
				request.setAttribute("dto", noticeDTO);
				
				path = "../WEB-INF/views/notice/noticeSelect.jsp";
			} 
			
			// 3. Post 글 쓰기
			else if (command.equals("/noticePost")) {
				if (method.equals("POST")) {
					NoticeDTO noticeDTO = new NoticeDTO();
					noticeDTO.setPnum(Integer.parseInt(request.getParameter("pnum")));
					noticeDTO.setPname(request.getParameter("pname"));
					noticeDTO.setName(request.getParameter("name"));
					noticeDTO.setDate(request.getParameter("date"));
					noticeDTO.setView(Integer.parseInt(request.getParameter("view")));
					noticeDTO.setPost(request.getParameter("post"));
					int result = noticeService.noticeAdd(noticeDTO);
					
					request.setAttribute("path", "/noticePost");
				} else {
					path = "../WEB-INF/views/notice/noticePost.jsp";
				}
			} 

			// 4. Update 글 수정
			else if (command.equals("/noticeUpdate")) {
				if (method.equals("POST")) {
					NoticeDTO noticeDTO = new NoticeDTO();
					noticeDTO.setPost(request.getParameter("post"));
					noticeDTO.setDate(request.getParameter("date"));
					
					int result = noticeService.NoticeUpdate(noticeDTO);
					
					if (result > 0) {
						request.setAttribute("path", "./noticeList?");
					}else {
						request.setAttribute("path", "./noticeList");
					}
				}else {
					int pnum = Integer.parseInt(request.getParameter("pnum"));
					NoticeDTO noticeDTO = noticeService.noticeSelect(pnum);
					request.setAttribute("dto", noticeDTO);
					path = "../WEB-INF/views/notice/noticeUpdate.jsp";
				}
			}
			
			// 5. Delete 글 삭제
			else if (command.equals("/noticeDelete")) {
				int pnum = Integer.parseInt(request.getParameter("pnum"));
				
				int result = noticeService.noticeDelete(pnum);
				
				check = false;
				path = "./noticeList";
			}
			
			else {
				System.out.println("ETC");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (check) {
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		} else {
			response.sendRedirect(path);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
