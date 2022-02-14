const URL = 'http://localhost:8080/Prg31_Jukebox/api/cantanti';

const ELENCO = document.getElementById('cantanti');
const LISTA = document.getElementById('listaBrani');

function riempiTendina() {
    fetch(URL).then(c => c.json()).then(cjson =>{
        for (const cantante of cjson) {
            const OPTION = document.createElement('option');
            OPTION.value(cantante);
            OPTION.textContent = cantante;
            ELENCO.appendChild(OPTION);
        }
    })
}

ELENCO.onchange = function () {
    let cantante = ELENCO.value;
    fetch(URL + "?cantante= " + cantante).then(j => j.json()).then(cjs => {
        LISTA.innerHTML = '';
        for (const canzone of cjs) {
            const LI = document.createElement('li');
            const LINK = document.createElement('a');
            LINK.setAttribute('href','https://www.google.com/search?q='+canzone.titolo);
            LINK.setAttribute('target','_blank');
            LINK.textContent = canzone.titolo;
            LI.appendChild(LINK);
            LI.setAttribute('class','list-group-item');
            LISTA.appendChild(LI);
        }
    })
}

riempiTendina();