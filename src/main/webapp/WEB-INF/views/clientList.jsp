<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-1.11.0.min.js" type="text/javascript"></script>
<script type="text/javascript">
function edit(ele){
	alert("Hiii");
	alert($(ele).closest('tr').find('td.id').text());
	$.ajax({ 
		type: "GET",
		url: ".do",
		cache: false,				
		data:'fileName='+fileName+'&filepath='+filepath,
		success: function(response){
			alert("file downloaded");
													 
		}
 
	});
}
</script>
</head>
<body>
	<c:if test="${!empty clientList}">
		<h2>List of clients</h2>
		<table>
			<tr>
				<th>Serial No.</th>
				<th>Client Name</th>
				<th>Phone number</th>
				<th>Address</th>
				<th>User policy number</th>
				<th>User policy type</th>
				<th>Referrer name</th>
				<th>Referrer contact number</th>
				<th>Referrer address line1</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${clientList}" var="clients">
				<tr>
					<td class="id"><c:out value="${clients.id}"/>Himanshu</td>
					<td><c:out value="${clients.name}"/></td>
					<td><c:out value="${clients.phoneNumber}"/></td>
					<td><c:out value="${clients.addressLine1}"/></td>
					<td><c:out value="${clients.userPolicyNumber}"/></td>
					<td><c:out value="${clients.userPolicyType}"/></td>
					<td><c:out value="${clients.referrerName}"/></td>
					<td><c:out value="${clients.referrercontactNumber}"/></td>
					<td><c:out value="${clients.referrerAddressLine1}"/></td>
					<td><a href="<%=request.getContextPath()%>/listOfClient.do?" onclick="edit(this);">Edit</a> / <a href="#">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>