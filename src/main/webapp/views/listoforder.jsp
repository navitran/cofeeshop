<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Orders</title>
</head>
<body>
	<h3>Order management</h3>
	<a href="/secure">Order </a>

	<table border=1>
		<tr>
			<td>ID</td>
			<td>Order Date</td>
			<td>Person First name</td>
			<td>Person Last name</td>

		</tr>
		<c:forEach var="order" items="${orders}">
			<tr>
				<td>${order.id}</td>
				<td>${order.orderDate}</td>
				<td>${order.person.firstName}</td>
				<td>${order.person.lastName}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>