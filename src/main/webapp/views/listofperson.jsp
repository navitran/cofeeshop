<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of persons</title>
</head>
<body>
	<h3>Person management</h3>

	<table border =1>
		<tr>
		<td>ID</td>
		<td>First name</td>
		<td>Last name</td>
		<td>Email </td>
		<td>Address </td>
		<td>Phone </td>
		
		
		</tr>
		<c:forEach var="p" items="${persons}">
			<tr>
				<td>${p.id}</td>
				<td>${p.firstName}</td>
				<td>${p.lastName}</td>
				<td>${p.email}</td>
				<td>${p.address}</td>
				<td>${p.phone}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>