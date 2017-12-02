<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <style TYPE="text/css">
  span{
     color:red; 
  } 
 
 </style>
   
 <h1 style="color:red;text-align:center"> Login Form Page</h1>
 
 <form:form method="POST"  commandName="userCmd">
    username ::<form:input path="user"/> <form:errors path="user"/> <br>
    password :: <form:password path="pwd"/><form:errors path="pwd"/> <br>
    <input type="submit"  value="login"/>
 </form:form>
 
 <c:if test="${result ne null }">
     ${result}
 </c:if>
 