<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<form:form method="POST" commandName="userCmd">
    Username::: <form:input path="uname"/><br>
    Password ::: <form:input  path="pwd"/><br>
    <input type="submit"  value="Login">
</form:form>

