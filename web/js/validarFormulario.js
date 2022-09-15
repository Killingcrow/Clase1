/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */


document.addEventListener("DOMContentLoaded", function() {
document.getElementById("formulario").addEventListener('submit', validarFormulario); 
});

function validarFormulario(evento) {
    
  evento.preventDefault();
  var nombre = document.getElementById('nombre').value; 
  var apellido = document.getElementById('apellido').value; 
  var direccion = document.getElementById('direccion').value; 
  var comuna = document.getElementById('comuna').value; 
  var genero = document.getElementsByName("genero");

/*Validar Nombre*/
if( nombre == null || nombre.length < 3 || /^\s+$/.test(nombre) ) {
    alert("debes ingresar tu Nombre");
    return;
  }
/*Validar Apellido*/  
if( apellido == null || apellido.length < 3 || /^\s+$/.test(apellido) ) {
    alert("debes ingresar tu Apellido");
    return;
  }
/*Validar Direccion*/  
if( direccion == null || direccion.length < 3 || /^\s+$/.test(direccion) ) {
    alert("debes ingresar una direccion");
    return;
  }  
  
 /*Validar Comuna*/  
 if( comuna == null || comuna.length < 3 || /^\s+$/.test(comuna) ) {
    alert("debes ingresar una comuna");
    return;
  }  
    
    
 /*Validar Seleccion de genero*/  
var generoSeleccionado = false;
for(var i=0; i<genero.length; i++) {
  if(genero[i].checked) {
    generoSeleccionado = true;
    break;
  }
}
if(!generoSeleccionado) {
  alert("debe seleccionar un genero");
  return false;
}


 /*Validar redes sociales seleccionadas */  
if(document.getElementById("Facebook").checked || document.getElementById("Twitter").checked || 
   document.getElementById("Instagram").checked || document.getElementById("Tiktok").checked){
    }else{
    alert("Debes seleccionar al menos una red social");    

    return false;    
    }
    

 this.submit();
}








 /*Validar Fecha*/  







/*Valida el rut ingresado*/

function checkRut(rut) {
var valor = rut.value.replace('.','');
valor = valor.replace('-','');
cuerpo = valor.slice(0,-1);
dv = valor.slice(-1).toUpperCase();
rut.value = cuerpo + '-'+ dv
// Si no cumple con el mínimo ej. (n.nnn.nnn)
if(cuerpo.length < 7) { rut.setCustomValidity("RUT Incompleto"); return false;}
suma = 0;
multiplo = 2;
for(i=1;i<=cuerpo.length;i++) {
index = multiplo * valor.charAt(cuerpo.length - i);
suma = suma + index;
if(multiplo < 7) { multiplo = multiplo + 1; } else { multiplo = 2; }
}
dvEsperado = 11 - (suma % 11);
dv = (dv == 'K')?10:dv;
v = (dv == 0)?11:dv;
if(dvEsperado != dv) { rut.setCustomValidity("RUT Inválido"); return false; }
rut.setCustomValidity('');
}
                                                                                            
                                                                                            
/*Valida que no se ingresen numeros */

function soloLetras(e) {
var key = e.keyCode || e.which,
tecla = String.fromCharCode(key).toLowerCase(),
letras = " áéíóúabcdefghijklmnñopqrstuvwxyz",
especiales = [8, 37, 39, 46],
tecla_especial = false;
                                                    
for (var i in especiales) {
if (key == especiales[i]) {
tecla_especial = true;
break;
}
 }
                                                    
if (letras.indexOf(tecla) == -1 && !tecla_especial) {
return false;
 }
}
                                                      
                                                      