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
	<h3>Add Product</h3>

	<form action="/product/add" method="post">


		<table>
			<tr>
				<td>Product Name:</td>
				<td><input type="text" name="productName" /></td>
			</tr>
			<tr>
				<td>Product Type:</td>
				<td><select name="productType">
						<option value="DINNER">DINNER</option>
						<option value="LUNCH">LUNCH</option>
						<option value="BREAKFAST">BREAKFAST</option>
				</select></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><input type="text" name="price" /></td>
			</tr>
			
		</table>

		<input type="submit" value="Save Data" />

	</form>

</body>
</html>