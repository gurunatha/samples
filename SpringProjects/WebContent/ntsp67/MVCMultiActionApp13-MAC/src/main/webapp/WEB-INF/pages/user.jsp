
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   <h1 style="text-align:center;color:red"> Form page with multiple submit buttons</h1>
   
   <form   action="operations.htm" method="POST">
     User Id :: <input type="text" name="uid"> <br>
      name :: <input type="text" name="name"> <br>
    Address :: <input type="text" name="addrs"> <br>
      EmailId:: <input type="text" name="email"> <br>
     <input type="submit" value="insert"  name="param">
     <input type="submit" value="update"  name="param">
     <input type="submit" value="delete"  name="param">
     <input type="submit" value="view"  name="param">
   </form>
   
   <br><br>
  <c:if test="${operation ne null }">
     ${operation} is successful.
   </c:if>