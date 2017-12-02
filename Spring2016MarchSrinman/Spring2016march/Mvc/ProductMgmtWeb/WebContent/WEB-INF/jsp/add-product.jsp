<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add Product</title>
	</head>
	<body style="font-family: consolas;font-size: 18px">
		<form:form commandName="product">
			<span style="color: red;">
				<form:errors path="*"/>
			</span>
			<br/>
			<table>
				<tr>
					<td>Id:</td>
					<td><form:input path="id"/></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Brand:</td>
					<td><form:input path="brand"/></td>
				</tr>
				<tr>
					<td>Category:</td>
					<td><form:input path="category"/></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><form:input path="price"/></td>
				</tr>
				<tr>
					<td colspan="2">	
						<input type="submit"  value="save"/>
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>