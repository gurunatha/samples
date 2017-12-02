<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Registration Form </h1>

<form:form  method="POST" commandName="regCmd">
  <p style="color:red"><form:errors path="*"/></p>
   Number::<form:input  path="sno"/><br>
   Name::<form:input  path="sname"/><br> <br>
   Courses::<form:select path="courses" multiple="true">
          <form:options items="${coursesList }"/>
   </form:select><br> <br>
   Hobies : <form:checkboxes items="${hobbiesList}" path="hobbies"/> <br><br>
   Countries : <form:select path="country">
          <form:options items="${countriesList}"/>
   </form:select><br> <br>
   
   <input type="submit"  value="register"/> 
   
</form:form>



