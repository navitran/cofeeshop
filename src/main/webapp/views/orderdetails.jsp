<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Order detail</title>
</head>
<body>
	<h3>Detail of Order</h3>
	<a href="/secure">Home </a>
	<div>
	Order ID: <font  color="green"><b>  ${orderlines[0].order.id} </b></font>
	</div>
	
	<div>
	Customer: <font  color="green"><b> ${orderlines[0].order.person.firstName} ${orderlines[0].order.person.lastName} </b></font>
	</div>
	
	<div>
	Order date:<font  color="green"><b> ${orderlines[0].order.orderDate} </b></font>
	</div>
	
	<div>
	Total Amount: <font  color="green"><b>${orderlines[0].order.getTotalAmount()}</b></font></td>
	</div>
	<table border=1>
		<tr>
			<td>Product Name</td>
			<td>Product Price</td>
			<td>Quantity</td>
			<td>Subtotal</td>

		</tr>
		<c:forEach var="orderline" items="${orderlines}">
			<tr>
				<td>${orderline.product.productName}</td>
				<td>${orderline.product.price}</td>
				<td>${orderline.quantity}</td>
				<td>${orderline.getSubtotal()}</td>
	
			</tr>
		</c:forEach>
		<tr>
		<td><font  color="green"><b>Total</b></font></td>
		
		<td colspan="3" align="right"><font  color="green"><b>${orderlines[0].order.getTotalAmount()}</b></font></td>
		</tr>
	</table>

</body>
</html>