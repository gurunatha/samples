<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
 
 <h1 style="color:red"> Edit Employee Details </h1>
 
 <form:form method="POST"  commandName="empCmd">
   employee number: <form:input path="eno" disabled="true"/><br>
   employee name: <form:input path="ename" /><br>
   employee job: <form:input path="job" /><br>
   employee salary: <form:input path="salary" /><br>
   <input type="submit" value="edit"/>
 </form:form>   
 