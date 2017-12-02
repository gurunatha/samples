<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Browse By Manufacturer</title>
	</head>
	<body style="font-size: 18px;">
		<form action="${pageContext.request.contextPath}/getProductsByManufacturer.htm">
			Manufacturer: <input type="text" name="manufacturer"/>
			<br/>
			<input type="submit" value="Get Products"/>
		</form>	
	</body>
</html>










