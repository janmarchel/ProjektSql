INSERT INTO Classes (zajecia_id, nazwa_zajec, prowadzacy_imie, prowadzacy_nazwisko, semestr, rodzaj_studiow) VALUES
('Matematyka','Pawel','Kwas', 2,'stacjonarne'),
('Informatyka','Jan', 'Choroba', 4,'niestacjonarne');

INSERT INTO University (nazwa_uczelni, adres_miast, adres_ulica, adres_nr_bud, strona_internetowa,nr_tel) VALUES
('Uniwersytet Gdanski', 'Gdansk','Grunwaldzka', 5, 'ug.edu.pl', '12313123312'),
('Uniwersytet Warszawski', 'Warszawa','Warszawska', 3, 'uw.edu.pl', '21312312');

INSERT INTO Faculty (nazwa_wydzialu, nr_tel) VALUES

('Wydzial Humanistyczny','Gdansk','Grunwaldzka',3,'131231231),
('Wydzial Techniczny','Olszytn', 'Olsztynska', 4,'123123121');

INSERT INTO Group (grout_id, numerGrupy, liczbaStudentow) VALUES
(10001,4,20),
(10002,3,23);

INSERT INTO Lecturer (lecturer_id, imie, nazwisko, adres_email, nr_tel, tytul, login, haslo) VALUES
(1,'Pawel','Pawlowski', 'p_pawlowski@email.com', '3123213213', 'doktor', 'ppawlowski','haselko'),
(2,'Adam','Adamowski', 'a_adamowski@email.com', '21321312', 'profesor', 'aadamowski','haseleczko')

INSERT INTO Materials (lecturer_id, dostepnosc,tresc) VALUES
(1,'wszyscy','cos madrego cos madrego'),
(2,'3',"nic madrego")''

INSERT INTO Student (student_id, imie, nazwisko, rok, indeks, adres_email, nr_tel, login, haslo) VALUES
(1,'Jan','Janczyk', 'j_janczyk@email.com', 3,'111111' 'jjanczyk','haselko'),
(2,'Krystian','Krystianowski', 'k_krystianowski@email.com', 4,'222222' 'kkrystianowski','haseleczko')


INSERT INTO Adress (adres_miasto, adres_ulica, adres_nr_bud, kod_pocztowy) VALUES
('Gdansk','Grunwaldzka',3,'80-213),
('Olszytn', 'Olsztynska', 4,'22-232');

