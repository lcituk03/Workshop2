# Workshop 2 – User DAO

## Opis projektu
W projekcie zaimplementowano klasę `UserDao`, która umożliwia wykonywanie operacji CRUD na tabeli `users` w bazie danych `workshop2`.

Dane użytkowników są przechowywane w relacyjnej bazie danych, a dostęp do nich realizowany jest przy użyciu JDBC.

## Struktura bazy danych
Tabela `users` zawiera następujące kolumny:
- `id` – klucz główny, AUTO_INCREMENT
- `email` – unikalny adres e-mail
- `username` – nazwa użytkownika
- `password` – hasło użytkownika (hashowane)

## Funkcjonalności
Projekt umożliwia:
- dodawanie użytkownika
- pobieranie użytkownika po ID
- aktualizację danych użytkownika
- usuwanie użytkownika
- pobieranie wszystkich użytkowników

Hasła użytkowników są zabezpieczone przy użyciu **BCrypt**.

## Wykorzystane technologie
- Java
- JDBC
- MySQL
- Maven
- IntelliJ IDEA
- Git / GitHub
