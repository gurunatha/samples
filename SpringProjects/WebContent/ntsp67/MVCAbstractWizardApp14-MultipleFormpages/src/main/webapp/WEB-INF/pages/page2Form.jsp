

<h1 style="color:red;text-align:center"> JOB Portal Registration -Page2</h1>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<form:form   method="POST" commandName="regCmd">
   JOB Domain : <form:input  path="domain"/><br>
   Experience  : <form:input   path="experience"/><br>
    <input type="submit"  name="_target0"  value="previous"/>
    <input type="submit"  name="_cancel"  value="cancel"/>
    <input type="submit"  name="_target2"  value="next"/>
</form:form>
