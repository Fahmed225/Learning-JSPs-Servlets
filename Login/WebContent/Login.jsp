<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user1" class="com.fahad.beans.User" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="user1" />

	<%
		String action = request.getParameter("action");
		if (action != null && action.equals("formSubmitted"))
			if (user1.validate()) {
				request.getRequestDispatcher("/Controller").forward(
						request, response);
			}
	%>
	
	<h2><jsp:getProperty property="errorMessage" name="user1" /></h2>

	<form action="/SimpleJSPLogin/Login.jsp" method="post">
		
		<input type="text" name="email"
			value='<jsp:getProperty property="email" name="user1"/>' /> <br />
		
		<input type="text" name="password"
			value='<jsp:getProperty property="password" name="user1"/>' /> <br />

		<input type="hidden" name="action" value="formSubmitted" /> 
		
		<input type="submit" value="Submit" />
	
	</form>

</body>
</html>