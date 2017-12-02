<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
   
 <h1 style="color:red;text-align:center"> Login Form Page</h1>
 
 <form:form method="POST"  commandName="userCmd">
     <form:errors path="*"/> <br>
    username ::<form:input path="user"/> <br>
    password :: <form:password path="pwd"/><br>
    DOB : <form:input path="dob"/> (dd-MM-yyyy) <br>
    choose domain: <form:select path="domain">
                                     <form:options items="${dmns}"/>
                                  </form:select> <br>
    <input type="submit"  value="login"/>
 </form:form>
 
 <c:if test="${result ne null }">
     ${result}  <br>
     ${userCmd }
 </c:if>
 