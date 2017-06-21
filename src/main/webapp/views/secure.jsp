<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>You are in!</title>
</head>
<body><h1>Coffee shop administrator page</h1>

<h3>Person management</h3>
<a href="person/">View persons</a>
<a href="person/addperson">Add New Person</a>


<h3>Product management</h3>
<a href="product/">View products</a>
<a href="product/addproduct">Add New Product</a>
<a href="product/deleteproduct">Update Product</a>
<a href="product/updateproduct">Delete Product</a>

<h3>Order management</h3>
<a href="order/">View orders</a>


<br>
<a href="<c:url value="/logout" />"> Now logout </a>

</body>
</html>