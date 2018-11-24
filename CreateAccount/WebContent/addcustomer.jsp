<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account</title>
</head>
<body>
<for:form method="post" action="createAccount" <%-- modelAttribute="my" --%>> <!-- the POST for the create operation, via form’s submit. -->
<table>


<tr>
<td>Customer FirstName</td>
<td><for:input path="firstName"/></td>
<td><for:errors path="firstName"></for:errors></td>
</tr>

<tr>
<td>Customer Last Name</td>
<td><for:input path="lastName"/></td>
<td><for:errors path="lastName"></for:errors>
</tr>

<tr>
<td>Customer EMail ID</td>
<td><for:input  path="email_Id"/></td>
<td><for:errors path="email_Id"></for:errors>
</tr>

<tr>
<td>Employee Gender</td>
<td><for:radiobutton path="gender" value="male"/>Male</td>
<td><for:radiobutton path="gender" value="female"/>FeMale</td>
</tr>
<tr>
<td>Customer phone no</td>
<td><for:input  path="phoneNo"/></td>
<td><for:errors path="phoneNo"></for:errors>
</tr>

<tr>
<td>Customer pan no</td>
<td><for:input  path="panNo"/></td>
<td><for:errors path="panNo"></for:errors>
</tr>

<tr>
<td>Customer address</td>
<td><for:input  path="address"/></td>
<td><for:errors path="address"></for:errors>
</tr>



<tr>
<td>Initial Balance</td>
<td><for:input  path="balance"/></td>
<td><for:errors path="balance"></for:errors>
</tr>



<tr>
<td><input type="submit" value="Add Customer"></input></td>
</tr>
</table>

</for:form>
</body>
</html>