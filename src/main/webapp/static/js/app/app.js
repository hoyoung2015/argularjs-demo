var app = angular.module('app', []);
app.controller('FirstController', function($scope) {
	$scope.message = "hello";
	$scope.counter = 0;
	$scope.add = function(num){
		$scope.counter += num;
	};
});

app.controller('ParentController', function($scope) {
	$scope.person = {
		"name":"hoyoung"	
	};
});
app.controller('ChildController', function($scope) {
	$scope.person.age = 24;
});
