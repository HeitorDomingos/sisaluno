angular.module("SisAluno", []).controller("SisAlunoCtrl", function($scope){
	
	var self = $scope;
	self.app = "SisAluno";
	$http({
		method : 'GET',
		url : 'http://localhost:8080/sisaluno/app/aluno/quantidade'
	}).then(function(response) {
		console.log(response.data)
		console.log(response.status);
	}, function(response) {
		console.log(response.data)
		console.log(response.status);
	});
		
			//
			// self.chamado = undefined;
			// self.adicionar = function() {
			// self.chamado = {};
			// }
			// self.alterar = function(chamado) {
			// this.chamado = chamado;
			// }
			// self.deletar = function() {
			//
			// }
			// self.salvar = function() {
			// var metodo = 'POST'
			// if(self.chamado.id){
			// metodo = 'PUT';
			// }
			// $http({
			// method:method,
			// url:urlBase + 'chamados/',
			// data: self.chamado
			// }).then (function successCallback (response){
			// self.atualizarTabela();
			// },function errorCallback (response){
			// self.ocorreuErro();
			// });
			// }
			// self.atualizarTabela = function (){
			//			
			// }
			// self.ocorreuErro = function(){
			// alert("Ocorreu um erro inesperado!");
			//			
			// }
		});

// // $scope.contatos.push(contato);
// delete $scope.contato;

// $scope.semestres = [ {
// nome : "Oi"
// }, {
// nome : "Tim"
// }, {
// nome : "Vivo"
// }, {
// nome : "Claro"
// } ];


