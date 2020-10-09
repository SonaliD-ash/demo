<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Form</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

</head>
<body>
	<div align="center">
		<h1 align="center">Employee Form</h1>
		<hr>
		<form:form action="addEmployee" modelAttribute="empDto" method="post">
			 <p>
				<label>Employee ID     :</label><form:input path="id"/>
			</p>
			<p>
				<label>Employee Name   :</label><form:input path="name"/>
				<form:errors path="name" cssClass="error"/>
			</p>
           
			<p>
				<label>Department Name :</label><form:input path="deptName"/>
			</p>
			
			<p>  <input type="submit" value="Submit"/></p>

		</form:form>
	</div>
</body>
</html>