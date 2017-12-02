<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Hot deal products</title>
	</head>
	<body>
		<table>
			<tr>
				<th>Product Code</th>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${hotdealproducts}" var="product">
				<tr>
					<td>${product.productId}</td>
					<td>
						${product.name}
						<br/>
						<c:forEach items="${product.specifications}" var="spec">
							${spec} &nbsp;
						</c:forEach>
					</td>
					<td>
						${product.price}
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>








