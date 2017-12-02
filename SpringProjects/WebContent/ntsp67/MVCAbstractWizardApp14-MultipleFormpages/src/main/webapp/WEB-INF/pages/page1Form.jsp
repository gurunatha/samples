<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<h1 style="color:red;text-align:center"> JOB Portal Registration -Page1</h1>

<form:form   method="POST" commandName="regCmd">
   name : <form:input  path="name"/><br>
   Father name : <form:input  path="fatherName"/><br>
   Address:  <form:input  path="address"/><br>
    <input type="submit"  name="_target1"  value="next"/>
    <input type="submit"  name="_cancel"  value="cancel"/>
</form:form>
