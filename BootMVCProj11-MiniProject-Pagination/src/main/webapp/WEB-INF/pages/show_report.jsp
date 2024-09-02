<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Report</title>
<link rel="stylesheet" href="commns/style.css">
</head>
<body style="background-color: cyan">
	
	<c:choose>
		<c:when test="${!empty empsList }">
			<h1 style="text-align: center; color: Red">Employee Report</h1>
			<table align="center" border="1"
				style="background-color: #800080; color: white; text-align: center">
				<tr>
					<td>Id</td>
					<td>Name</td>
					<td>Job</td>
					<td>Salary</td>
					<td>Dept No</td>
					<td>Modify</td>
				</tr>

				<c:forEach var="emp" items="${empsList}">
					<tr>
						<td>${emp.empno}</td>
						<td>${emp.ename}</td>
						<td>${emp.job}</td>
						<td>${emp.sal}</td>
						<td>${emp.deptno}</td>
						<td id="modify"><a href="edit?empno=${emp.empno}"><img
								alt="" src="images/edit.webp" height="25px" width="25px"></a>
							<a href="delete?empno=${emp.empno}" onclick=" return confirm('Do you want to delete')"><img alt=""
								src="images/delete.png" height="25px" width="25px"></a></td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h3>Employees not found</h3>
		</c:otherwise>

	</c:choose>
	<!-- Home page -->
	<div class="bottom">
		<div class="bottom1">
			<div>
				<a href="./"><img alt="Image" src="images/home.png"
					height="30px" width="35px"></a>
			</div>
			<div>
				<a href="./" style="color: red">Home</a>
			</div>
		</div>
		<div class="bottom2">
			<div>
				<a href="add_emp"><img alt="Image" src="images/add.png"
					height="25px" width="35px"></a>
			</div>
			<div>
				<a href="add_emp" style="color: red">Add</a>
			</div>
		</div>
	</div>
	<c:choose>
		<c:when test="${!empty resultMsg}">
		<h3 style="text-align:center;color:red">${resultMsg}</h3>
		</c:when>
	</c:choose>
</body>
</html>