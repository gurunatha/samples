<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Product Search Result</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${products.size() gt 0}">
				<table style="font-family: consolas;font-size: 16px;">
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Price</th>
					</tr>
					<c:forEach items="${products}" var="product">
						<tr>
							<td>${product.productId}</td>
							<td>${product.name}</td>
							<td>${product.price}</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<p style="font-family: consolas;font-size: 16px;color: red;">
					No records found
				</p>
			</c:otherwise>
		</c:choose>	
	</body>
</html>









