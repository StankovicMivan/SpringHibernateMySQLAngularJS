var app = angular.module("tracingRecords", [ "ngRoute" ]);

app.controller("footballCtrl", function($scope, $http, $location, $routeParams) {
	var baseUrlT = "/api/teams";

//	creating new team
	$scope.teams = [];


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
	$scope.competitionId =1;
	
	
	var getTeams = function() {

		var config = {params:{}};
		config.params.competitionId = $scope.competitionId;
		config.params.pageNum = $scope.pageNum;
		config.params.showParam = $scope.showParam;

		$http.get(baseUrlT, config).then(function success(res) {
			$scope.teams = res.data;
			$scope.totalPages = res.headers("totalPages");

		}, function error() {
			alert("Something went wrong.");
		});
	}

//	getTeams();
	
	
//	creating new comment form
	var baseUrlComment = "/api/comments";
	$scope.comments = [];

	$scope.newComment = {};

//	$scope.newComment.id = "";
	$scope.newComment.userName = "";
	$scope.newComment.comment = "";
	

	var postComment = function() {
		$scope.newComment.competitionId =$scope.competitionId;	
		$http.post(baseUrlComment,$scope.newComment).then(function success(res) {
//			$scope.comments = res.data;
			getComments();
			$scope.newComment.userName = "";
			$scope.newComment.comment = "";
			$scope.newComment.competitionId =$scope.competitionId;	
		}, function error() {
			alert("Something went wrong.");
		});
	}

	$scope.addComment = function() {
		postComment();
		getComments();
	}
	var getComments = function() {
		var config = {params:{}};
		config.params.competitionId = $scope.competitionId;
		
		$http.get(baseUrlComment,config).then(function success(res) {
			$scope.comments = res.data;
		}, function error() {
			alert("Something went wrong.");
		});
	}
//	getComments();
	
//	competitions
	var baseUrlC = "/api/competitions";
	$scope.competitions = [];

	var getCompetitions = function() {

		$http.get(baseUrlC).then(function success(res) {
			$scope.competitions = res.data;

		}, function error() {
			alert("Something went wrong.");
		});
	}

	getCompetitions();
//	Methods	
	

	$scope.go = function(direction) {
		$scope.pageNum = $scope.pageNum + direction;
		getTeams();
	}
	$scope.show = function(){
		$scope.pageNum = 0;
		getTeams();

	}


	$scope.chosenOne = function() {
		getTeams();	
		getComments();
		$scope.newComment.competitionId =$scope.competitionId;	
		$scope.selectedFlag =1;
	}

	$scope.selectedFlag = 0;
	var myEl = angular.element( document.querySelector( '#selectedCompetition' ) );
	myEl.addClass('ng-hide');
	var selectedFlagCheck = function() {
		if($scope.selectedFlag != 0){
			$scope.selectedFlag=1;
			myE1.removeClass('ng-hide');
		}
	}
	//New features
	
	$scope.eventR = function() {
		$location.path("/event/"+$scope.competitionId);
	}
//	/ + $scope.competitionId
});
app.controller("eventCtrl", function($scope, $http, $location, $routeParams) {
	$scope.teams = [];
	$scope.competitions = [];
	
	$scope.competitionId = $routeParams.competitionId;
	$scope.firstTeam ="";
	$scope.secondTeam ="";
	$scope.score= "";
	
	var baseUrlC = "/api/competitions";
	

	var baseUrlT = "/api/teams";
	var getTeams = function() {

		$http.get(baseUrlT+ "/" +$scope.competitionId).then(function success(res) {
			$scope.teams = res.data;

		}, function error() {
			alert("Something went wrong.");
		});
	}
	$scope.saveFlag = function() {
		if($scope.firstTeam =="" || $scope.secondTeam=="" || $scope.score=="" || $scope.firstTeam==$scope.secondTeam){
			$scope.saveFlagBoolean = true;
		}else{
			$scope.saveFlagBoolean =  false;		
		}
	}
	getTeams();
	$scope.saveFlagBoolean = true;
	
	
	var saveEvent = function() {
		var EventDto = {};
		EventDto.competitionId = $scope.competitionId;
		EventDto.firstTeam = $scope.firstTeam;
		EventDto.secondTeam = $scope.secondTeam;
		EventDto.score = $scope.score;

		$http.post(baseUrlT,EventDto).then(function success(res) {
			backFunction();
		}, function error() {
			alert("Something went wrong.");
		});
	}
	
	$scope.selectCompetitions = function() {
		getTeams();	
	}

	$scope.save = function() {
		saveEvent();
		
	}
	var backFunction = function() {
		$location.path('/football');
	}
	$scope.back = function() {
		$location.path('/football');
	}
	
});

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : '/app/html/partial/home.html',
		controller : 'football'
	}).when('/football', {
		templateUrl : '/app/html/partial/football.html'
	}).when('/event/:competitionId', {
		templateUrl : '/app/html/partial/event.html'
	}).otherwise({
		redirectTo : '/'
	});
} ]);