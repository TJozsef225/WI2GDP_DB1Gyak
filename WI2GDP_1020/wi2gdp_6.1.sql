CREATE TABLE GYARTO(adoszam integer PRIMARY KEY, nev varchar(30), telephely varchar(30));
CREATE TABLE TERMEK(tkod integer PRIMARY KEY, nev varchar(50), ear numeric check(ear>0), gyarto integer, FOREIGN KEY(gyarto) references GYARTO(nev));
