'use strict';

/* Controllers */


function TutorialMenuCtrl($scope, $http) {
	$http.get('rest/menuTuto2').success(function(data) {
		$scope.urlList = data.links;
	});
    
}
//TutorialMenuCtrl.$inject = ['$scope', '$http'];

function DemoDetailCtrl($scope, $routeParams) {
	$scope.templateUrl = 'partial/'+$routeParams.demoName+'.html';
	$scope.demoName = $routeParams.demoName;
	$("#navDemo > li").each(function(index) {
		$(this).removeClass('active');
	});
	$("#nav_"+$routeParams.demoName).addClass('active');
}
//DemoDetailCtrl.$inject = ['$scope', '$routeParams'];

function Demo1DetailCtrl($scope, $routeParams) {
	$("#nav_ex1").addClass('active');
}
