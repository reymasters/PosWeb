<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="js/angular.min.js"></script>
<body>
<div ng-app="myApp" ng-controller="myCtrl">	
	AnCliente
	<select ng-model="selectedName" ng-options="x for x in AnCliente"></select>
	TermTest
	<select ng-model="selectedName" ng-options="x for x in TermTest"></select>
	TermRig
	<select ng-model="selectedName" ng-options="x for x in TermRig"></select>
</div>
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope,$http) {
	$http.get("ListAnRisorsa").then(function (response) {		
		console.log(response.data);		
		$scope.AnCliente = response.data.AnCliente;
		$scope.TermTest = response.data.TermTest;
		$scope.TermRig = response.data.TermRig;
	}, function (error) {
		   console.error(error);
	});
    
});
</script>
</body>
</html>