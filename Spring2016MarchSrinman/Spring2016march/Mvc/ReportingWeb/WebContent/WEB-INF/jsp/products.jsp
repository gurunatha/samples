<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Products</title>
	</head>
	<body style="font-family: consolas;font-size: 18px;">
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<tr>
				<td colspan="3" align="center">
					Export : <a href="${pageContext.request.contextPath}/getProductsByManufacturer.htm?manufacturer=${manufacturer}&view=excel">Excel</a> or <a href="${pageContext.request.contextPath}/getProductsByManufacturer.htm?manufacturer=${manufacturer}&view=pdf">Pdf</a>
				</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.productId}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
				</tr>
			</c:forEach>
		</table>	
	</body>
</html>









