const URL = 'http://localhost:8080/Prg28_RicetteRegionaliTwo/api/ricette';
const btnTab = document.getElementById('btnTabella');

function caricaRicette(){
    const lista = document.createElement('ul');


    fetch(URL).then(ricette => ricette.json()).then(rJson =>{
        for (let ricetta of rJson) {
            let LI = document.createElement('li');
            LI.textContent = ricetta.nome;
            lista.appendChild(LI);
        }
        document.body.appendChild(lista);
    })   
}

btnTab.onclick = function () {
    const tabella = document.createElement('table');
    
    fetch(URL).then(ricette => ricette.json()).then(rJson =>{
        for (let ricetta of rJson) {
            const riga = document.createElement('tr');
            const td = document.createElement('td');
            td.textContent = ricetta.nome;
            riga.appendChild(td);
            tabella.appendChild(riga);

        }
        document.body.appendChild(tabella);
    })   


}