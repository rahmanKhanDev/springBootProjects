<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body style="background-color: cyan">
	<h1 style="text-align: center; color: red">Register Employee</h1>
	
	<frm:form modelAttribute="emp">
		<table align="center" border="1"
			style="background-color: #A9A9A9; color: white; text-align: center">

			<tr>
				<td>Name</td>
				<td><frm:input path="ename" /></td>
			</tr>
			<tr>
				<td>Job</td>
				<td><frm:input path="job" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><frm:input path="sal" /></td>
			</tr>
			<tr>
				<td>Dept no</td>
				<td><frm:input path="deptno" /></td>
			</tr>
		</table>
		<h4 style="text-align: center">
			<button type="submit">Submit</button>
			<button type="reset">Reset</button>
		</h4>
	</frm:form>

</body>
</html>