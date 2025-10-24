<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error{
color:red;
margin-left: 30px;
position: fixed;
}
</style>
</head>
<body>
	<h2 align="center">Bill Calculator</h2>
	<br>
	<div align="center">
		<form:form action="bill-success" modelAttribute="bill">
			<label for="cardnum">Credit Card :</label>
			<form:input path="cardNumber" id="cardnum" />
			<form:errors path="cardNumber" cssClass="error"></form:errors>
			<br>
			<br>

			<label for="amount">Amount :</label>
			<form:input path="amount" id="amount" />
			<form:errors path="amount" cssClass="error"></form:errors>
			<br>
			<br>
			
			<label for="currency">Currency: </label>
			<form:input path="currency" id="currency"/>
			<form:errors path="currency" cssClass="error"></form:errors>
			<br><br>
			
			<label for="date">Date : </label>
			<form:input path="date" id="currency"/>
			<form:errors path="date" cssClass="error"></form:errors>
			<br><br>
			
			<input type="submit" value="Pay bill">
		</form:form>

	</div>
</body>
</html>