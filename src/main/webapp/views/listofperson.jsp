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
	<a href="/secure">Home</a>
	<a href="person/addperson">Add New Person</a>

	<table border=1>
		<tr>
			<td>ID</td>
			<td>First name</td>
			<td>Last name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>City</td>
			<td>State</td>
			<td>Country</td>
			<td>Zip code</td>

		</tr>
		<c:forEach var="person" items="${persons}">
			<tr>
				<td>${person.id}</td>
				<td>${person.firstName}</td>
				<td>${person.lastName}</td>
				<td>${person.email}</td>
				<td>${person.phone}</td>
				<td>${person.address.city}</td>
				<td>${person.address.state}</td>
				<td>${person.address.country}</td>
				<td>${person.address.zipcode}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>