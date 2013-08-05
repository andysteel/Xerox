function atribui(){
	valor = "NOVO";
	document.getElementById(formpanelgsituacao).value = valor;
}

function limpa(){
	document.getElementById("form:patrimonio").value = "";
	document.getElementById("form:serie").value = "";
	document.getElementById("form:valEscolha").value = "ESCOLHA UMA COR";
}

function limpa5755(){
	document.getElementById("form:patrimonio").value = "";
	document.getElementById("form:serie").value = "";
	//document.getElementById("form:modelo").value = "XEROX 5755";
}

function alerta(){
	alert("teste de evento");
}

function refresh(){
	window.location.reload();
}

function load(){
	setTimeout("refresh()", [2500]);
}