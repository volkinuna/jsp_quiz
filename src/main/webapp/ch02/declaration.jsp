<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! String str = "Hello, java server pages";
	
		String getString(String data) { 
			return data;
		}
	%>
	
	결과 : <%= getString(str) %>
</body>
</html>