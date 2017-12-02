<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


number:: ${cmdData.sno}<br>
name :: ${cmdData.sname}<br>
Courses ::  <c:forEach var="crs"  items="${cmdData.courses}">
                           ${crs} &nbsp;&nbsp; ,
                     </c:forEach> <br>
hobies ::  <c:forEach var="hobbie"  items="${cmdData.hobbies}">
                           ${hobbie}&nbsp;&nbsp; ,
                     </c:forEach><br>
Country ::${cmdData.country}<br>

