(function() {
    'use strict';

    angular
        .module('myRetailProductsApp')
        .controller('ProductDetailController', ProductDetailController);

    ProductDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Product'];

    function ProductDetailController($scope, $rootScope, $stateParams, previousState, entity, Product) {
        var vm = this;

        vm.product = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('myRetailProductsApp:productUpdate', function(event, result) {
            vm.product = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
