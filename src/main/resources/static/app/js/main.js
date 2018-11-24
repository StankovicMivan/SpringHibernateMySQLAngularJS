var app = angular.module("tracingRecords", [ "ngRoute" ]);

app.controller("footballCtrl", function($scope, $http, $location, $routeParams) {
	var baseUrlT = "/api/teams";
	var baseUrlC = "/api/competitions";
	
	$scope.teams = [];
	$scope.competitions = [];
	
	$scope.newTeam = {};
	
	$scope.newTeam.name = "";
	$scope.newTeam.location = "";
	$scope.newTeam.playedMatches = "";
	$scope.newTeam.klubId = "";
	$scope.newTeam.klubNaziv ="";	
	$scope.newTeam.id ="";

	$scope.pageNum = 0;
	$scope.totalPages = 0;
	$scope.showParam = 8;
	 var getTeams = function() {

		var config = {
				params : {}
			};
		
			config.params.pageNum = $scope.pageNum;
			config.params.showParam = $scope.showParam;
			
		$http.get(baseUrlT, config).then(function success(res) {
			$scope.teams = res.data;
			$scope.totalPages = res.headers("totalPages");
				
		}, function error() {
			alert("Something went wrong.");
		});
	}

	getTeams();
	 
	$scope.go = function(direction) {
		$scope.pageNum = $scope.pageNum + direction;
		getTeams();
	}
	$scope.show = function(){
		$scope.pageNum = 0;
		getTeams();
		
	}
	
	var getCompetitions = function() {
		
		$http.get(baseUrlC).then(function success(res) {
			$scope.competitions = res.data;

		}, function error() {
			alert("Something went wrong.");
		});
	}
	
	getCompetitions();
	

});


app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : '/app/html/partial/home.html',
		controller : 'football'
	}).when('/football', {
		templateUrl : '/app/html/partial/football.html'
	}).when('/linije/edit/:lId', {
		templateUrl : '/app/html/partial/edit-linije.html'
	}).when('/prevoznici/add', {
		templateUrl : '/app/html/partial/add-prevoznika.html'
	}).when('/prevoznici', {
		templateUrl : '/app/html/partial/prevoznici.html'
	}).otherwise({
		redirectTo : '/'
	});
} ]);