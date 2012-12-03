function ContactCtrl($scope) {
    $scope.contacts = [
        {"nom":"Robert Hudson",
            "groupe":"Famille",
            "mobile":"0645271845",
            "adresse":"50 rue Victor Hugo 75004 Paris"},
        {"nom":"Pierre Samal",
            "groupe":"Ami",
            "mobile":"0642154528",
            "adresse":"30 avenue des Coquelicots 69001 Lyon"},
        {"nom":"Virginie Dupont",
            "groupe":"Travail",
            "mobile":"0655554120",
            "adresse":"5 rue des Pierres 51100 Reims"}
    ];
}

function ContactListCtrl($scope) {

}

function ContactEditCtrl($scope,$routeParams,$location) {
    var newContact = false;
    if ($routeParams.contactId) {
        $scope.contact = $scope.contacts[$routeParams.contactId];
    } else {
        $scope.contact = {};
        newContact = true;
    }
    $scope.saveContact = function() {
        if (newContact) {
            $scope.contacts.push($scope.contact);
        }
        $location.path("/list");
    };
}