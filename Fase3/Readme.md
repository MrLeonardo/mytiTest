All'interno delle cartelle troviamo l'implementazione sia in Python che in Java usando Spring Boot.

Per lo script python bisogna aver installato sulla macchina una versione di python (nel mio caso ho una 3.7.6)

eseguire in un prompt

python RESTStudent.py

si avvia un server in locale al http://127.0.0.1:5000

in cui ci sono in ascolto 

GET http://127.0.0.1:5000/students

POST http://127.0.0.1:5000/addStudent

per testare usare Postman o similari passando un JSON nel body della chiamata POST
per inserire un nuovo studente, inoltre se lo studente è stato già inserito non viene inserito nuovamente

{
	"firstname": "leonardo",
	"lastname": "capone",
	"birthdate": "14/11/1989",
	"grades": "30 28 26 28 27"
}


altrimenti se chiamiamo la GET riceviamo un JSON con la lista di studenti inseriti

{
    "students": [
        {
            "firstname": "leonardo",
            "lastname": "capone",
            "birthdate": "14/11/1989",
            "grades": "30 28 26 28 27"
        }
    ]
}


Per l'implementazione in Java è stato usato Spring Boot per la generazione del progetto e per testarlo
senza dover installare in locale un server web aprire il progetto con IntelliJ

aprire il file RestStudentsJavaApplication.java

cliccare con il tasto destro del mouse sul main

cliccare su Run RestStudentsJavaApplication.main()

a questo punto si avvia un server su http://localhost:8080

a questo punto anche qui con Postman o similari possiamo testare le api in ascolto per
l'inserimento di un nuovo studente e la richiesta della lista di studenti inseriti.