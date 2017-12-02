<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@page isELIgnored="false" %>
 <h1 style="color:red;text-align:center"> Login Page </h1>
 
 <form:form method="POST"  commandName="userCmd">
   <p> <form:errors path="*"/> </p>
    username::: <form:input path="uname"/> <br>
    password ::: <form:input path="pwd"/><br>
    <input type="submit" value="Login"/>
 </form:form>

<c:if test="${!empty result }">
   result::: ${result}.
</c:if>
