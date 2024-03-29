<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="regist_action.jsp" method="post">
		<div>
			<label>이메일</label>
			<input type="text" name="email" placeholder="이메일" />
			<br>
			<label>핸드폰</label>
			<input type="text" name="phone" placeholder="핸드폰"/> 
		</div>
		<input type="submit" value="로그인" />
	</form>
</body>
</html>