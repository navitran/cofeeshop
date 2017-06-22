<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update product</title>
</head>
<body>
	<h3>Update Product</h3>
	<a href="/secure">Home</a>
	<a href="/product/">Product</a>
	<form action="/product/update/${product.id}" method="post">


		<table>
			<tr>
				<td>Product ID:</td>
				<td><input type="text" name="id" value="${product.id}" /></td>
			</tr>

			<tr>
				<td>Product Name:</td>
				<td><input type="text" name="productName"
					value="${product.productName}" /></td>
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
				<td><input type="text" name="description"
					value="${product.description}" /></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><input type="text" name="price" value="${product.price}" /></td>
			</tr>

		</table>

		<input type="submit" value="Update" />

	</form>

</body>
</html>