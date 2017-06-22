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
	<h3>Product management</h3>
	<a href="/secure">Home</a>
	<a href="/product/add">Add New Product</a>

	<h1>Product List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Product Name</th>
			<th>Product Type</th>
			<th>description</th>
			<th>Price</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id}</td>
				<td>${product.productName}</td>
				<td>${product.productType}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td><a href="/product/update/${product.id}">Edit</a></td>
				<td><a href="/product/delete/${product.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>