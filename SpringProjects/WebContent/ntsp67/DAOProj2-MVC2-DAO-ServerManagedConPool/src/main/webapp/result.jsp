<%-- <%@page  import="java.util.*"%>
<%
 List<Map<String,Object>> listEmps=(List<Map<String,Object>>)request.getAttribute("listEmps");
    if(listEmps!=null){
%>
 <h1 style="text-align:center">Emp Details are</h1>
 <table border='1'>
   <tr><th>Empno</th><th>Emp Name</th><th>Emp Desg</th><th>Emp Salary</th></tr>
   <%
      for(Map map:listEmps){%>
      <tr>
        <td><%=map.get("EMPNO") %></td>
         <td><%=map.get("ENAME") %></td>
         <td><%=map.get("JOB") %></td>
        <td><%=map.get("SAL") %></td>
       </tr>
      <%}%>
 </table>
  <%}
     else{ %>
        <h1 style='color:red'>Emps Not Found</h1>
       <% } %>
<br>
  <a href="search.html">home</a> --%>
  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
  <c:when test="${listEmps ne null }">
     <table>
       <tr><th>Empno</th><th>Emp name</th><th>Emp Desg</th><th>Emp Salary</th></tr>
       <c:forEach var="map" items="${listEmps }">
          <tr>
            <td>${map.empno}</td>
            <td>${map.ename}</td>
            <td>${map.job}</td>
            <td>${map.sal}</td>
          </tr>
       </c:forEach>
     </table>
  </c:when>
  <c:otherwise>
     <h1 style="color:red"> Records not found</h1>
  </c:otherwise>
</c:choose>
<br>
<a href="search.html">home</a>

  
  