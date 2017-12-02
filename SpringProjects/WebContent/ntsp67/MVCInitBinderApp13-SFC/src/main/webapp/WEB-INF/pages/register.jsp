<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Registration Form </h1>

<form:form  method="POST" commandName="regCmd">
    <form:errors  path="*"/>
   Number::<form:input  path="sno"/><br>
   Name::<form:input  path="sname"/><br> <br>
   DOB::<form:input  path="dob"/> (dd-MM-yyyy)<br> <br>
   DOJ::<form:input  path="doj"/> (dd-MM-yyyy)<br> <br>
   DOM::<form:input  path="dom"/>(dd-MM-yyyy)<br> <br>
   <input type="submit"  value="register"/> 
   </form:form>



