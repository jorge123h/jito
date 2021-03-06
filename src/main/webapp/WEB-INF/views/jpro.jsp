<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>JPro</title>  
    <style>
      .username.ng-valid {
          background-color: lightgreen;
      }
      .username.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .username.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

      .email.ng-valid {
          background-color: lightgreen;
      }
      .email.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .email.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }

    </style>
     <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
     
     
     <link href="<c:url value='/static/css/bootstrap-datetimepicker.css' />" rel="stylesheet"></link>
     
  </head>
  <body ng-app="myApp" class="ng-cloak" ng-controller="UserController as ctrl" >
      <div class="generic-container ng-cloak" >
          <div class="panel panel-default" >
              <div class="panel-heading"><span class="lead">Registro de Cosecha </span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="ctrl.user.id" />
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="cantidad">*Cantidad en Kg</label>
                              <div class="col-md-4">
                                  <input type="number" ng-model="ctrl.user.cantidad" id="cantidad" class="form-control input-sm" placeholder="Cantidad en Kg" required/>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="fecha">*Fecha de Corte</label>

							<div class="col-md-4">
								<input type="date" id="date" class="form-control input-sm"
									ng-model="example.value" placeholder="Ingresa Fecha de Corte" required/>
							</div>

						</div>
                      </div>
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="cantidad">Precio por Kilo</label>
                              <div class="col-md-4">
                                  <input type="number" ng-model="ctrl.user.precio" id="precio" class="form-control input-sm" placeholder="Precio por Kilo"/>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="descripcion">Descripcion</label>
                              <div class="col-md-4">
                              			<textarea rows="4" ng-model="ctrl.user.descricion" cols="47"></textarea>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="Agregar" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Vaciar Formulario</button>
                          </div>
                      </div>
                  </form>
              </div>
          </div>
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">Lista de Registros </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>Registrado por</th>
                              <th>Cantidad en kg</th>
                              <th>Fecha de Corte</th>
                              <th width="20%"></th>
                          </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="u in ctrl.users">
                              <td><span ng-bind="u.username"></span></td>
                              <td><span ng-bind="u.cantidad"></span></td>
                              <td><span ng-bind="u.date | date:'MM/dd/yyyy'"></span></td>
                              <td>
                              <button type="button" ng-click="" class="btn btn-success" disabled="disabled">Editar</button>
                              </td>
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
      </div>
      
      <div class="container">
    <div class="row">
        <div class='col-sm-6'>
            
        </div>

        
    </div>
</div>     
      
      <script src="<c:url value='https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js' />"></script>
      
      <script src="<c:url value='/static/js/library/angular-resource.js' />"></script> 
      
      
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/user_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/user_controller.js' />"></script>
      
      
  </body>
</html>