<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <h1 style="color:red;text-align:center">PaySlip Generator </h1>
 <form action="controller"  method="post">
 <table border="0">
  <tr>
    <td>Employee no:</td>
    <td><input type="text" name="teno" placeholder="enter number"></td>
    </tr>
    <tr>
    <td>Employee name:</td>
    <td><input type="text" name="tename" placeholder="enter name"></td>
    </tr>
  <tr>
    <td>Employee address:</td>
    <td><input type="text" name="teadd" placeholder="enter address"></td>
    </tr>
  <tr>
    <td>Employee basic Salary:</td>
    <td><input type="text" name="tesalary" placeholder="enter salary"></td>
    </tr>
  <tr>
    <td><input type="submit" value="submit"/></td>
    <td><input type="reset" value="cancel"/></td>
    </tr>
 </table>
 </form>
