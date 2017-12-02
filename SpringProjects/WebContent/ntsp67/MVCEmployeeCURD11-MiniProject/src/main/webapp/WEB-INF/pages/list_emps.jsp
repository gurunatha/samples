<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <script language="JavaScript">
      function showPrint(){
         frames.focus();
         frames.print();
      }
    
    </script>
    
    <c:choose>
      <c:when test="${!empty listEmps }">
        <table border="1" bgcolor="cyan">
          <tr><th>eno</th><th>ename</th><th>job</th><th>sal</th><th>operations</th></tr>
          <c:forEach var="dto" items="${listEmps}">
             <tr>
               <td>${dto.eno}</td>
               <td>${dto.ename}</td>
               <td>${dto.job}</td>
               <td>${dto.salary}</td>
               <td>
                 <a href="edit.htm?eno=${dto.eno}">edit</a> &nbsp;&nbsp;&nbsp;
                 <a href="delete.htm?eno=${dto.eno}">delete</a>
               </td>
              </tr>
          </c:forEach>
        </table>
      </c:when>
      <c:otherwise>
          <b>Records not found</b>
      </c:otherwise>
  </c:choose>
   <br><br>
   <a  href="JavaScript:showPrint()">print</a>  &nbsp;&nbsp;&nbsp; <a href="insert.htm">insert</a>
   
   <br><br>
    <p style="color:red"><b><i> ${msg}</i></b>
   
   
    
