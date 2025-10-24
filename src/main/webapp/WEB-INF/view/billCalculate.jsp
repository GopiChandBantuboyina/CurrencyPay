<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
span{

color:blue;
}

</style>
</head>
<body>
	<h1 align="center">BILL</h1>
	<div align="center">
	
	<h3>Bill against credit card number <span>${bill.cardNumber}</span> towards amount <span>${bill.amount} , ${bill.currency.displayName}</span>  generated dated (on) <span>${bill.date}.</span></h3>
	
	
	</div>
</body>
</html>