All'interno delle cartelle troviamo l'implementazione sia in Python che in Java.

Per lo script python bisogna aver installato sulla macchina una versione di python (nel mio caso ho una 3.7.6)

eseguire in un prompt

python FibonacciDigits.py 1000

nel caso non si inserisce il paramentro verrà segnalato l'errore.

Per l'implementazione in Java il jar si trova nella cartella out/artifacts/FibonacciDigitsJava_jar e per eseguire 
il jar bisogna aver installato sulla macchina una versione di Java (nel mio caso 1.8)

eseguire in un prompt 

java -jar FibonacciDigitsJava.jar 1000

nel caso non viene inserito il paramentro verrà segnalato l'errore.

Ho implementato entrambe le soluzioni perché per eseguire la richiesta della fase1 il Java non va bene per calcoli cosi grandi
a differenza del python che riesce a calcolare il risultato di operazioni matematiche anche molto grosse in tempi
ragionevoli.