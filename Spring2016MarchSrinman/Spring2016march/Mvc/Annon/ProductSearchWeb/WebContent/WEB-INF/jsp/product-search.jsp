<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search</title>
	</head>
	<body style="font-size: 20px;">
		<form action="${pageContext.request.contextPath}/search-products.htm" method="post">
			<table>
				<tr>
					<td>Product:</td>
					<td><input type="text" name="product"/></td>
				</tr>
				<tr>
					<td>Manufacturer:</td>
					<td><input type="text" name="manufacturer"/></td>
				</tr>
				<tr>
					<td>Type:</td>
					<td><input type="text" name="type"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="search"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>







