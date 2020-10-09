<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<title>Home Page</title>
</head>
<body>
	<div>
		<h1 align="center">Welcome</h1>
		<hr>
		<div align="center">
			<form:form action="employeeform" modelAttribute="empDto" method="get">
				<p>
					<label>New Employee </label><input type="submit"
						value="Register Here" />
				</p>
			</form:form>
		</div>
		<br />
		<div align="center">
			<form action="getEmployee">
				<p>
					<label>Search Existing Employee<br/>
					<br/>
					Enter ID :<input type="text" name="id">
					</label>
					<input type="submit" value="Search" />
				</p>
			</form>
		</div>
	</div>
</body>
</html>