<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<h1 style="color:red;text-align:center">File Uploading form page</h1>

<form:form  method="post"  enctype="multipart/form-data" commandName="uplCmd">
  select file ::: <input type="file"  name="file"><br>
  <input type="submit"  value="upload"/> 
</form:form>