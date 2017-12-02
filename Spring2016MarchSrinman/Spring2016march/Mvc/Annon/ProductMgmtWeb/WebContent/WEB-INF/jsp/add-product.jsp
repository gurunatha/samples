<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add Product</title>
	</head>
	<body style="font-family: consolas;font-size: 20px;">
		<form:form modelAttribute="productForm">
			<span style="color: red;">
				<form:errors path="*"/>
			</span>
			<br/>
			<table>
				<tr>
					<td>Name</td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Type :</td>
					<td><form:input path="type"/></td>
				</tr>				
				<tr>
					<td>Manufacturer:</td>
					<td>
						<form:select path="manufacturer">
							<form:option value="0">&nbsp;</form:option>
							<c:forEach	items="${manufacturers}" var="manuf">
								<form:option value="${manuf.manufacturerId}">${manuf.name}</form:option>
							</c:forEach>
						</form:select>
					</td>
				</tr>
				<tr>
					<td>Price:</td>
					<td><form:input path="price"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="add"/>
					</td>
				</tr>
			</table>
		</form:form>		
	</body>
</html>









