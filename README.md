# Servlet_3
 
## 기능

###member
- 로그인 (select)
- 회원 가입 (insert)
- 회원 수정 (update)
- 회원 탈퇴 (delete)
- mypage 

##JSP
- /WEB-INF/view/member/...

URL
- /member/memberJoin		memberJoin.jsp		 get
- /member/memberJoin							 post
- /member/memberLogin		memberLogin.jsp		 get
- /member/memberLogin							 post
- /member/memberPage		memberpage.jsp		 get
- /member/memberUpdate	memberUpdate.jsp	 get
- /member/memberUpdate						 post
- /member/memberDelete	memberDelete.jsp	 get

###point
- ponint list 출력
- point 등록
- point 상세 정보 출력
- point 수정
- point 삭제

## JSP
- pointList.jsp		: List 출력
- pointAdd.jsp		: 입력 폼
- pointSelect.jsp	: point 상세정보
- pointMod.jsp		: point 수정

## 		URL주소		/		JSP			/	Method
##	/WEB-INF/views/point/**
- /point/poinList	/	point.jsp		/	get
- /point/pointAdd	/	pointAdd.jsp	/	get
- /point/pointAdd	/	 				/	post	(DB저장용)
- /point/poinSelect	/	pointSelect.jsp	/	get
- /point/pointMod	/	pointMod.jsp	/	get
- /point/pointMod	/	 				/	post	(DB저장용)
- /point/pointDelete/					/	get

