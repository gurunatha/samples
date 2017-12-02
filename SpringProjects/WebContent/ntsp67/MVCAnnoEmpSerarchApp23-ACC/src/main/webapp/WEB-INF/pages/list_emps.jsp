<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<c:choose>
  <c:when test="${!empty empList }">
     <table border="1" bgcolor="cyan">
       <tr><th>empno</th><th>emp name</th><th>job</th><th>salary</th><th>deptno</th><th>mgr</th></tr>
      <c:forEach var="rDTO" items="${empList }">
        <tr>
          <td>${rDTO.eno }</td>
          <td>${rDTO.name }</td>
          <td>${rDTO.desg }</td>
          <td>${rDTO.salary }</td>
          <td>${rDTO.deptNo }</td>
          <td>${rDTO.mgrNo }</td>
        </tr>
      </c:forEach>
     </table>
  </c:when>
  <c:otherwise>
      <b>Records not found</b>
  </c:otherwise>
</c:choose>
    <br>
   <a href="search.htm">home</a>
    
