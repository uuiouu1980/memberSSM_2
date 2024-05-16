<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="service.impl.MemberServiceImpl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width=400 align=center border=1>
		<tr>
			<td>編號<td>姓名<td>帳號<td>密碼
		<%
		
			out.println(new MemberServiceImpl().showAll());
		%>
	</table>
</body>
</html>