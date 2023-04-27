
-- Tabla DUAL (no tiene columnas ni registros) para realizar pruebas. Es necesaria en algunas bases de datos. En el caso de H2 no se requiere....

SELECT SUBSTRING('ABCDEEFG', 2, 5) AS PRUEBA_SUBSTRING FROM DUAL;

-- Funciones con cadenas de texto

SELECT SUBSTRING('ABCDEEFG', 2, 5) AS PRUEBA_SUBSTRING;
SELECT TRIM('              TEXTO               ')  AS PRUEBA_TRIM;

-- Forma correcta de convertir. 

SELECT convert('-128', TINYINT)
SELECT convert(23, VARCHAR(20))

-- Malas practicas

SELECT '23' * 1                                               
SELECT 23 || ''                                     

-- Importante y vital el uso de COALESCE para convertir nulos en 'otras cosas'

SELECT  UPPER(APELLIDO1 || COALESCE(' ' || APELLIDO2 , '') || ', ' || NOMBRE), *  FROM PERSONAS;

-- Para conocer los distintos valores que se almacenan en una columna...

SELECT DISTINCT GENDER FROM PERSONAS;