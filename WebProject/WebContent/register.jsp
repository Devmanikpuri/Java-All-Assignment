<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr{
		padding:10px;
		margin-bottom:15px;
		font-family:cursive;
	}
	.btn{
		font-family: cursive;
    background: red;
    border: none;
    border-radius: 5px;
    padding: 5px 10px;
	}
	
</style>
</head>
<body>
 <h3>Employee Register Form</h3>
 <form action="register" method="post">
 <table>
 <tr><td>First Name</td>  <td><input type="text" name="fname" placeholder="Enter firstname" > </td></tr>
 <tr><td>Last Name</td>  <td><input type="text" name="lname" placeholder="Enter lastname" > </td></tr>
 <tr><td>User Name</td>  <td><input type="text" name="uname" placeholder="Enter username" ><td> </tr>
 <tr><td>Password</td>  <td><input type="password" name="password" placeholder="Enter password" ></td> </tr>
 <tr><td>Address</td>  <td><input type="text" name="address" placeholder="Enter address" ><td> </tr>
 <tr><td>Contact</td>  <td><input type="text" name="contact" placeholder="Enter contact" ></td> </tr>
 <tr><td></td><td><button class="btn">submit</button><td></tr>
 
 
 <input type="hidden" name="Hitesh">
 </table>
 </form>
 
 
</body>
</html>