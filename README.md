# team-4-heroes-backend
[![Build and deploy JAR app to Azure Web App - krakProject](https://github.com/team-4-heroes/team-4-heroes-backend/actions/workflows/main_krakproject.yml/badge.svg)](https://github.com/team-4-heroes/team-4-heroes-backend/actions/workflows/main_krakproject.yml)

## Names and GitHub accounts
He Englund https://github.com/SirMeows 

Simon Bøg Jørgensen https://github.com/Kaffelat 

Christian Hundahl https://github.com/ChristianHundahl 

Peter Sand https://github.com/ptsand

## Group Contract
1. Vores kommunikationsplatform er en Discord server oprettet specifikt til gruppen. Her foregår al kommunikation om projektet
2. Vi mødes mindst én gang dagligt til et daily scrum, med undtagelse af weekender 
2a. Er man forhindret i at deltage fysisk i det daglige møde, foregår deltagelse over Discord
4. Det daglige scrum afholdes kl. 9.00 morgen. Kaffe afhentning, toiletbesøg el. lign sker før og ikke efter mødetiden, så mødet kan foregå præcis kl. 9.00
5. Hvis arbejdsdagen kommer ud på et sidespor, har alle gruppemedlemmer et ansvar for at arbejdsdagen kommer på ret køl igen
6. Man respekterer hinandens behov for fordybelse og arbejdsro. Gruppemedlemmer vælger selv deres arbejdssted, alt efter hvor medlemmet kan koncentrere sig bedst
7. Gruppen udviser respekt for hinandens skemaer og forskelligheder, og tilgiver manglende læsning, forsinkelser o.l. inden for rimelighedens grænser
8. Gruppens arbejdstid er fra kl. 9.00 morgen til kl. 18.00 aften. Udenfor dette tidsrum kan det ikke forventes at gruppemedlemmer besvarer henvendelser eller laver yderligere arbejde
7a. Op mod projektets deadline kan det forventes at 7 revurderes løbende 
9. Gruppekontrakten er udarbejdet i en demokratisk proces, og kan ændres ved vedtagelse i en demokratisk samtale gruppen imellem

## Branching Strategy
Vores projekt benytter Feature Branching
# Navnekonventioner for branches
Nye branches navngives i formatet feature/feature-name

## Group Project Selection
Krak-projekt

## MiniSprint-1
1. Test Driven Development: Laver tests - tester metoder, data og endpoints der ikke er implementeret endnu for at vise hvad programmet skal kunne - så det rigtige kode kan fyldes ind senere. 
2. Lave et skelet for backend og frontend
3. CRUD for Hobby: Lave udkast til Create, Read, Update, Delete i vores kode
4. Strukturere backend: Lave hvad der kan nås af entitet-klasser

## Minisprint-2
1. Starte frontend: Skal kunne præsentere entiteter i tabeller
2. Frontend skal kunne snakke sammen med adresse api - inkl. auto-complete (se video)
3. Konverter hobbies.txt til database (se projektbeskrivelse)

## Sprint 3 description
#Goals achieved
- Backend expanded with functionality to get movies from api, make reservations and create seats for specific screenings
- Client can create a user profile, with user details saved in database for future logins 
- Frontend added sign-up, log-in and view user features, as well as page to display available movie screenings

# Who Did What
He
- Created entities Movie and Actor
- Errorhandling with Respone Status Exception
- Validation handler (SPRING native error)
- Pages realted to Movie entites and services
Peter
- Restricted access to CRUD funtionality for screenings to only Admin-type users (except read)
Simon 
- Manage Profile and related classes
- Singup and login features
Christian
- Created Reservation class
- Refactoring to fit reservation into project 

## Back-end deployed
https://krakproject.azurewebsites.net/
