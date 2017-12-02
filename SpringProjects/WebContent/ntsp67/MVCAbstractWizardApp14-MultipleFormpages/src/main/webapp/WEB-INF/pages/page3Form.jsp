

<h1 style="color:red;text-align:center"> JOB Portal Registration -Page3</h1>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<form:form   method="POST" commandName="regCmd">
   PrefferedLocation : <form:input  path="prefferedLocation"/><br>
   Expected Salary  : <form:input  path="expectedSalary"/><br>
    <input type="submit"  name="_target1"  value="previous"/>
    <input type="submit"  name="_finish"  value="finish"/>
    <input type="submit"  name="_cancel"  value="cancel"/>
</form:form>
