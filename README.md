# Fabrick Application

Fabrick Application è un applicativo che consente, attraverso l'integrazione di API REST, di effettuare le operazioni sul conto:
  - Lettura saldo (https://www.platfr.io/#/docs/api#GET-BankingAccountBalance)
  - Bonifico (https://www.platfr.io/#/docs/api#v2.1-POST-BankingAccountCreateSCTOrder)

L'applicativo è stato scritto utilizzando il linguaggio Java e Spring Boot. Non è disponibile alcuna interfaccia grafica. Sono disponibili alcuni test JUnit per verificare le chiamate ai servizi.
Per la fase di sviluppo sono state utilizzate le versioni MOCK delle API esposte da Platfr.io

### Installazione
E' possibile importare l'applicativo su qualsiasi IDE di sviluppo che supporti MAVEN per la compilazione ed esecuzione dei test JUnit.