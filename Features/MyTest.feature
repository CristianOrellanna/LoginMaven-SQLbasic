Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion
Given Abrir Chrome
When ingresa Username "user" y Passwoer "user"
Then inicia sesion