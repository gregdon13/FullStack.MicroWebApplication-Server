DROP TABLE IF EXISTS USER_PROFILE;

CREATE TABLE USER_PROFILE
(ID LONG AUTO_INCREMENT PRIMARY KEY NOT NULL,
FIRST_NAME VARCHAR(100) NOT NULL,
LAST_NAME VARCHAR(100) NOT NULL,
ADDRESS VARCHAR NOT NULL,
EMAIL VARCHAR NOT NULL,
PHONE_NUMBER VARCHAR NOT NULL,
OCCUPATION VARCHAR NOT NULL,
USER_NAME VARCHAR NOT NULL,
PASSWORD VARCHAR NOT NULL);

INSERT INTO USER_PROFILE(ID, FIRST_NAME, LAST_NAME, ADDRESS, EMAIL, PHONE_NUMBER, OCCUPATION, USER_NAME, PASSWORD)
VALUES (23, 'GREG', 'DONNELLY', '9 OLDE DUTCH DRIVE', 'GREG@GMAIL.COM', '3021234567', 'STUDENT', 'GREGDON13', 'PASSWORD123');
INSERT INTO USER_PROFILE(ID, FIRST_NAME, LAST_NAME, ADDRESS, EMAIL, PHONE_NUMBER, OCCUPATION, USER_NAME, PASSWORD)
VALUES (24, 'Jorge', 'Tapia', '200 MeadowLark Drive', 'Jorge@GMAIL.COM', '3026547894', 'STUDENT', 'JTapia93', 'PASSWORD321');


DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE ACCOUNT
(ID LONG AUTO_INCREMENT PRIMARY KEY NOT NULL,
ACCOUNT_TYPE VARCHAR(255) NOT NULL DEFAULT '',
BALANCE DOUBLE NOT NULL DEFAULT 0.00,
ACCOUNT_NUMBER LONG NOT NULL DEFAULT 000000000,
USER_ID LONG NOT NULL);

INSERT INTO ACCOUNT(ACCOUNT_TYPE, BALANCE, ACCOUNT_NUMBER, USER_ID)
VALUES('Checking', 123.45, 987654321, 23);
INSERT INTO ACCOUNT(ACCOUNT_TYPE, BALANCE, ACCOUNT_NUMBER, USER_ID)
VALUES('SAVINGS', 500.00, 123456789, 23);
INSERT INTO ACCOUNT(ACCOUNT_TYPE, BALANCE, ACCOUNT_NUMBER, USER_ID)
VALUES('INVESTMENT', 1000.00, 456123789, 23);
INSERT INTO ACCOUNT(ACCOUNT_TYPE, BALANCE, ACCOUNT_NUMBER, USER_ID)
VALUES('Checking', 123.45, 222333444, 24);
INSERT INTO ACCOUNT(ACCOUNT_TYPE, BALANCE, ACCOUNT_NUMBER, USER_ID)
VALUES('SAVINGS', 500.00, 111222333, 24);
INSERT INTO ACCOUNT(ACCOUNT_TYPE, BALANCE, ACCOUNT_NUMBER, USER_ID)
VALUES('INVESTMENT', 1000.00, 333444555, 24);

DROP TABLE IF EXISTS TRANSACTION;

CREATE TABLE TRANSACTION
(ID LONG AUTO_INCREMENT PRIMARY KEY NOT NULL,
TRANSACTION_DATE DATE NOT NULL,
ACCOUNT_ONE LONG NOT NULL,
ACCOUNT_TWO LONG,
TRANSACTION_TYPE VARCHAR(100) NOT NULL,
AMOUNT DOUBLE NOT NULL,
USER_ID LONG NOT NULL);

INSERT INTO TRANSACTION(ACCOUNT_ONE, TRANSACTION_DATE, TRANSACTION_TYPE, AMOUNT, USER_ID)
VALUES(987654321, '2021-04-18', 'Deposit', 50.00, 23);
INSERT INTO TRANSACTION(ACCOUNT_ONE, ACCOUNT_TWO, TRANSACTION_DATE, TRANSACTION_TYPE, AMOUNT, USER_ID)
VALUES(987654321, 123456789, '2021-05-04', 'Transfer', 27.32, 23);
INSERT INTO TRANSACTION(ACCOUNT_ONE, TRANSACTION_DATE, TRANSACTION_TYPE, AMOUNT, USER_ID)
VALUES(987654321, '2021-05-04', 'withdraw', 20.00, 23);
INSERT INTO TRANSACTION(ACCOUNT_ONE, TRANSACTION_DATE, TRANSACTION_TYPE, AMOUNT, USER_ID)
VALUES(123456789, '2020-12-29', 'withdraw', 20.00, 23);
INSERT INTO TRANSACTION(ACCOUNT_ONE, TRANSACTION_DATE, TRANSACTION_TYPE, AMOUNT, USER_ID)
VALUES(222333444, '2021-01-30', 'Deposit', 50.00, 24);
INSERT INTO TRANSACTION(ACCOUNT_ONE, TRANSACTION_DATE, TRANSACTION_TYPE, AMOUNT, USER_ID)
VALUES(222333444, '2021-02-14', 'Withdraw', 50.00, 24);
INSERT INTO TRANSACTION(ACCOUNT_ONE, TRANSACTION_DATE, TRANSACTION_TYPE, AMOUNT, USER_ID)
VALUES(111222333, '2021-02-28', 'Withdraw', 50.00, 24);