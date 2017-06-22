<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register User</title>
</head>
<body>
	<h3>Register User</h3>

	<form action="/user/add" method="post">
		<table>
		
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>State:</td>
				<td><input type="text" name="state" /></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><input type="text" name="country" /></td>
			</tr>
			<tr>
				<td>Zip code:</td>
				<td><input type="text" name="zipcode" /></td>
			</tr>

		</table>

		<input type="submit" value="Save" />
</body>
</html>