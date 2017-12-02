<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
   
 <h1 style="color:red;text-align:center"> Login Form Page</h1>
 
 <form:form method="POST"  commandName="userCmd">
    username ::<form:input path="user"/> <br>
    password :: <form:password path="pwd"/> <br>
    <input type="submit"  value="login"/>
 </form:form>
 
 <c:if test="${result ne null }">
     ${result}
 </c:if>
 