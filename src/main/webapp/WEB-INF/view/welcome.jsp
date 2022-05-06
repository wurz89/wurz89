<%@page import="org.springframework.web.method.support.ModelAndViewContainer"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="it.web.zanzaraOrm.entity.Cliente" %>


<!DOCTYPE html>


<%     

	Cliente cliente = (Cliente)request.getAttribute("cliente");
	
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page!</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script >


document.addEventListener('DOMContentLoaded', function() {

    document.getElementById('formid').addEventListener('submit', function(event) {
        event.preventDefault();

        let nome = document.getElementById('input').value;


        chiamataAjax(nome)

    })

})


function chiamataAjax(nome) {
    
    $.ajax({
        url: "http://localhost:8081/cliente?input="+nome,
        type : "GET",
        dataType: "json",
        

    }).done(function(data){
        console.log(data)
       
            document.getElementById('result').innerHTML = "Il cognome del inserito è " + data.cognome;
        
		
        
    }).fail(function(xhr){
        console.log(xhr.status, xhr.statusText)
        console.log(xhr)

        document.getElementById('result').innerHTML ="inserimento non valido"
    })

     
}






</script>
</head>

<body>

	<% String s = cliente!=null? cliente.getNome() : ""; %>
	
	<h1>Benvenuto <%= s %></h1>
	
	
	<form id="formid" method="get">
	
		<div>
			 <label for="input">Inserisci nome cliente</label>
			 <input type = "text" id="input" >
			 
		</div>
		
		<button type = "submit"  >invia</button>
		
	
	</form>
	
	
	<div>
		<h3 id="result"></h3>
	</div>
	 
</body>
</html>