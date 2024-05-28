DROP DATABASE IF EXISTS practica_intermodular;
CREATE DATABASE practica_intermodular;
USE practica_intermodular;

-- Crear la tabla Estrellas primero
CREATE TABLE Estrellas (
  Nombre VARCHAR(50) PRIMARY KEY,
  Tipo_de_Estrella VARCHAR(10),
  Radio DECIMAL(12,1),
  Temperatura_Superficial DECIMAL(6,1),
  Distancia_Media_a_la_Tierra DECIMAL(6,1),
  Composicion VARCHAR(50),
  Fecha_creacion DATE
);

-- Insertar datos en la tabla Estrellas
INSERT INTO Estrellas VALUES (
  'Sol', 'G2V', 696340, 5500, 149.6, '74% Hidrógeno, 24% Helio, 2% Otros', '2024-05-24'
);
select * from estrellas;

-- Crear la tabla Planetas
drop table Planetas;
CREATE TABLE Planetas (
  Nombre VARCHAR(50) PRIMARY KEY,
  Radio DECIMAL,
  Distancia_Media_al_Sol DECIMAL,
  Periodo_Orbital DECIMAL,
  Temperatura_Media DECIMAL,
  Tipo_de_Planeta VARCHAR(10),
  Numero_de_Satelites INT,
  Fecha_creacion DATE,
  estrella varchar(20),
   FOREIGN KEY (estrella) REFERENCES Estrellas(Nombre)
);

-- Insertar datos en la tabla Planetas

INSERT INTO Planetas VALUES
  ('Mercurio', 2439.7, 57.9, 88, 167, 'Rocoso', 0, '2024-05-24', 'Sol'),
  ('Venus', 6051.8, 108.2, 225, 464, 'Rocoso', 0, '2024-05-24', 'Sol'),
  ('Tierra', 6371.0, 149.6, 365.25, 15, 'Rocoso', 1, '2024-05-24', 'Sol'),
  ('Marte', 3389.5, 227.9, 687, -65, 'Rocoso', 2, '2024-05-24', 'Sol'),
  ('Júpiter', 69911.0, 778.5, 4333, -110, 'Gaseoso', 79, '2024-05-24', 'Sol'),
  ('Saturno', 58232.0, 1429.4, 10759, -140, 'Gaseoso', 82, '2024-05-24', 'Sol'),
  ('Urano', 25362.0, 2870.9, 30687, -195, 'Gaseoso', 27, '2024-05-24', 'Sol'),
  ('Neptuno', 24622.0, 4498.3, 60190, -200, 'Gaseoso', 14, '2024-05-24', 'Sol');


select * from planetas;
-- Crear la tabla Satelites
drop table Satelites;

CREATE TABLE Satelites (
  Nombre VARCHAR(50) PRIMARY KEY,
  Planeta VARCHAR(50) NOT NULL,
  Radio DECIMAL,
  Distancia_Media_a_su_Planeta DECIMAL,
  Periodo_Orbital DECIMAL,
  Temperatura_Media DECIMAL,
  Tipo_de_Cuerpo VARCHAR(20),
  Fecha_creacion DATE,
  FOREIGN KEY (Planeta) REFERENCES Planetas(Nombre)
);

-- Insertar datos en la tabla Satelites
INSERT INTO Satelites VALUES
  ('Luna', 'Tierra', 1737.4, 384400, 27.3, -53, 'Sólido/Rocoso', '2024-05-24'),
  ('Fobos', 'Marte', 11.1, 9378, 0.3, -40, 'Sólido/Rocoso', '2024-05-24'),
  ('Deimos', 'Marte', 6.2, 23460, 1.3, -40, 'Sólido/Rocoso', '2024-05-24'),
  ('Ío', 'Júpiter', 1821.6, 421700, 1.8, -143, 'Sólido/Rocoso', '2024-05-24'),
  ('Europa', 'Júpiter', 1560.8, 670900, 3.5, -160, 'Sólido/Hielo', '2024-05-24'),
  ('Ganimedes', 'Júpiter', 2634.1, 1070400, 7.2, -163, 'Sólido/Hielo', '2024-05-24'),
  ('Calisto', 'Júpiter', 2410.3, 1882700, 16.7, -139, 'Sólido/Hielo', '2024-05-24'),
  ('Titán', 'Saturno', 2575.5, 1222000, 15.9, -179, 'Sólido/Hielo', '2024-05-24'),
  ('Encélado', 'Saturno', 252.1, 238000, 1.4, -201, 'Sólido/Hielo', '2024-05-24'),
  ('Titania', 'Urano', 788.4, 435900, 8.7, -203, 'Sólido/Hielo', '2024-05-24'),
  ('Oberón', 'Urano', 761.4, 583500, 13.5, -203, 'Sólido/Hielo', '2024-05-24');

-- Consulta para verificar los datos en la tabla Planetas
SELECT * FROM Satelites;


-- =================================trigger 1 ===============================
DELIMITER //
CREATE TRIGGER actualizar_numero_satelites
AFTER INSERT ON Satelites
FOR EACH ROW
BEGIN
    UPDATE Planetas
    SET Numero_de_Satelites = Numero_de_Satelites + 1
    WHERE Nombre = NEW.Planeta;
END;
//

-- =================================trigger 2: ========================================  

DELIMITER //
CREATE  TRIGGER set_creation_date_ESTRELLA
BEFORE INSERT ON Estrellas
FOR EACH ROW
BEGIN
    SET NEW.Fecha_creacion := SYSDATE;
END;
//

DELIMITER //
CREATE  TRIGGER set_creation_date_planetas
BEFORE INSERT ON Planetas
FOR EACH ROW
BEGIN
    SET NEW.Fecha_creacion := SYSDATE;
END;
//

DELIMITER //
CREATE  TRIGGER set_creation_date_satelite
BEFORE INSERT ON Satelites
FOR EACH ROW
BEGIN
     SET NEW.Fecha_creacion := SYSDATE;
END;
//
  