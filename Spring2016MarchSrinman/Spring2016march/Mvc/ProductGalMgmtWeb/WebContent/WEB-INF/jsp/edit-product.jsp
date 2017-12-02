<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Edit Product</title>
	</head>
	<body>
		<form:form commandName="product" cssStyle="font-family: consolas; font-size: 18px">
			<span style="color: red;">
				<form:errors path="*"/>
			</span>		
			<table>
				<tr>
					<td>Product Id</td>
					<td><form:input path="productId" maxlength="8" readonly="true"/></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><form:input path="name" maxlength="50"/></td>
				</tr>
				<tr>
					<td>Description:</td>
					<td><form:input path="description" maxlength="20"/></td>
				</tr>
				<tr>
					<td>Manufacturer:</td>
					<td>
						<form:select path="manufacturer">
							<form:option value=""></form:option>
							<c:forEach items="${manufacturerNames}" var="manufacturerName">
								<form:option value="${manufacturerName}">${manufacturerName}</form:option>
							</c:forEach>
						</form:select>
					</td>
				</tr>
				<tr>
					<td>Price:</td>
					<td><form:input path="price" maxlength="10"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="update"/>
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>









