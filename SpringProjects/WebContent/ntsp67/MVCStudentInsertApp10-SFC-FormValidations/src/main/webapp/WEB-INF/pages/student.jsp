<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <h1 style='color:red;text-align:center'>Student Registration form </h1>
 <form:form method="POST" commandName="stCmd">
   <%--  <p style="color:red">
        <form:errors path="*"/>
    </p> --%>
      number : <form:input path="sno"/> <form:errors path="sno"/><br>
      name : <form:input path="sname"/><form:errors path="sname"/><br>
      address : <form:input path="sadd"/><form:errors path="sadd"/><br>
      <input type="submit" value="register"/>
 </form:form>
     
