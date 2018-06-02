<html ng-app="myApp">

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
</head>

<body ng-controller="myController">
	<h2>Hello World!</h2>
	{{name}}
	<a href="sayHi">sdf</a>

	<table class="border">
		<tbody>
			<tr class="border">
				<th></th>
			</tr>
			<tr ng-repeat="x in data" class="border">
				<td>{{x}}</td>
			</tr>
		</tbody>
	</table>

</body>


<script>
	var app = angular.module('myApp', []);

	app.controller('myController', function($scope) {
		$scope.name = "Siva";
		$scope.data = ["one","two","three"];
		
	});
</script>
<style>
 .border {
 border: solid black
 }
</style>

</html>
