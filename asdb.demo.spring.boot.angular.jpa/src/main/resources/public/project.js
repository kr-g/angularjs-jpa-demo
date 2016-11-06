/**
 * 
 */

var mapp = angular.module('myapp', [ "ngRoute" ]);

mapp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when("/scope", {
		templateUrl : "scope.html"
	}).when("/numab", {
		templateUrl : "numab.html"
	}).when("/mult2", {
		templateUrl : "mult2.html"
	}).when("/alldata", {
		templateUrl : "alldata.html"
	}).when("/alldatadb", {
		templateUrl : "alldatadb.html"
	}).when("/getdatadb", {
		templateUrl : "datadb.html"
	}).when("/inv", {
		templateUrl : "inv.html"
	}).otherwise({
		templateUrl : "notfound.html"
	});
} ]);

mapp.controller('SimpleController', [ '$scope', function($scope) {
	$scope.greeting = 'Hello world from SimpleController!';
} ]);

mapp.controller('DoubleController', [ '$scope', function($scope) {
	$scope.double = function(value) {
		return value * 2;
	};
} ]);

mapp.controller('getalldata', [ '$scope', '$http', function($scope, $http) {
	$http.get('http://localhost:8080/all').then(function(response) {
		$scope.alldata = response.data;
	});
} ]);

mapp.controller('getalldatadb', [ '$scope', '$http', function($scope, $http) {
	$http.get('http://localhost:8080/alldb').then(function(response) {
		$scope.alldatadb = response.data;
	});
} ]);

mapp.controller('getdatadb', [
		'$scope',
		'$http',
		function getdatadbController($scope, $http) {

			$scope.keyval = 1;

			$scope.refresh = function() {
				console.log("getting " + $scope.keyval);
				$http.get('http://localhost:8080/alldb/' + $scope.keyval).then(
						function(response) {
							$scope.datadb = response.data;
						}, function errorCallback(response) {
							$scope.datadb = {
								key : $scope.keyval,
								value : "NaN"
							};
						});
			};

			$scope.refresh();

		} ]);

console.log("done");
