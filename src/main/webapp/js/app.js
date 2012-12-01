'use strict';

/* App Module */

angular.module('demoAngular', []).
  config(['$routeProvider', function($routeProvider) {
  $routeProvider.
	  when('/tutorial.html', {templateUrl: 'partial/ex1.html', controller: Demo1DetailCtrl}).
      when('/demo/:demoName', {templateUrl: 'partial/urlRouter.html', controller: DemoDetailCtrl}).
      otherwise({redirectTo: '/tutorial.html'});
}]);
