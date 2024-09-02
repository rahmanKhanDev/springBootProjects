<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body style="background-color: cyan">

	<h1 style="text-align: center; color: blue">Update Employee</h1>
	<frm:form modelAttribute="emp">
		<table align="center" bgcolor="#800080" border="1"
			style="color: white; text-align: center">
			<tr>
				<td>Id</td>
				<td><frm:input path="empno" readOnly="true"
						style="background-color:#A9A9A9;color:green" /></td>
			</tr>
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
				<td>Dept No</td>
				<td><frm:input path="deptno" /></td>

			</tr>
		</table>
	<h5 style="text-align:center">	<button type="submit">Submit</button>
		<button type="reset">Cancel</button></h5>

	</frm:form>
</body>
</html>