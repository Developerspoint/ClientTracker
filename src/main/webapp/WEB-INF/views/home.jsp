<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Success
	</h1>
	<P>  The time on the server is ${serverTime}. </P>
	<a href="<%=request.getContextPath()%>/listOfClient.do">Get Clients List</a>
</body>
</html>
