<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2> Student Table Demo </h2>
<hr>
<br/>

<table border="1"> 
<tr>
	<th> First Name <th/>
	<th> Last Name <th/>
	<th> Email ID <th/>
<tr/>

<c:forEach var="tempStudent" items="${studentlist}" > 
	<tr>
		<td> ${tempStudent.firstName} <td/>
		<td> ${tempStudent.lastName}  <td/>
		<td> ${tempStudent.emailid}   <td/>
	<tr/>
	
</c:forEach>

</table>

</body>
</html>