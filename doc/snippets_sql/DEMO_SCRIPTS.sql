
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

-- Vamos a transformar el valor de una columna (GENDER)

SELECT 	GENDER, 
       	NOMBRE,                                      
       	CASE GENDER
        	WHEN IS NULL    THEN 0
            WHEN 'Male'     THEN 1
            WHEN 'Female'   THEN 2
            WHEN 'Bigender' THEN 3       
        END AS GENDER_CODE
FROM PERSONAS

-- Filtros con WHERE

SELECT * FROM PERSONAS WHERE SALARIO > 8000
SELECT * FROM PERSONAS WHERE NOMBRE = 'Alvin'
SELECT * FROM PERSONAS WHERE UPPER(NOMBRE) = 'DIETER'

-- Queremos un listado de personas cuyo nombre empieze por... acabe en... contenga tal cosa, 

-- Comodín % equivale a "cualquier cosa"
-- Comodín _ equivale a "cualquier caracter"

SELECT * FROM PERSONAS WHERE NOMBRE LIKE 'D%';
SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%r';
SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%a%';

-- listado de personas cuyo nombre contenga una 'a' en la tercera posición

SELECT * FROM PERSONAS WHERE NOMBRE LIKE '__a%'

-- Obtención del salario medio

SELECT AVG(SALARIO) FROM PERSONAS

SELECT * FROM PERSONAS WHERE SALARIO >= SELECT AVG(SALARIO) FROM PERSONAS

SELECT * FROM PERSONAS WHERE APELLIDO1 = APELLIDO2

SELECT 	 APELLIDO1,
         APELLIDO2,
         LENGTH(APELLIDO1) AS NUMERO_CARACTERES
FROM     PERSONAS 
WHERE 	 LENGTH(APELLIDO1) = LENGTH(APELLIDO2)
ORDER BY LENGTH(APELLIDO1) DESC

-- Filtro IN (para evitar GENDER = 'A' OR GENDER = 'B' OR GENDER = 'C')

SELECT  * 
FROM     PERSONAS
WHERE  GENDER IN ('Female', 'Male', 'Bigender');     
             
-- Filtro BETWEEN (para evitar SALARIO >= 1000 AND SALARIO <= 5000)

SELECT SALARIO
FROM PERSONAS 
WHERE SALARIO BETWEEN 4431.63 AND 5000.00
ORDER BY SALARIO

-- Filtro IS NULL (tmbién se puede preguntar por los que no son null: IS NOT NULL)

SELECT * FROM PERSONAS
WHERE APELLIDO2 IS NULL

-- Group BY (GENDER es una columna interesante para agrupas los datos y extraer conclusiones)

SELECT  GENDER,
        COUNT(*)     AS NUMERO_PERSONAS,
        MAX(SALARIO) AS SALARIO_MAXIMO,
        MIN(SALARIO) AS SALARIO_MINIMO,
        AVG(SALARIO) AS SALARIO_MEDIO
FROM    PERSONAS
GROUP BY GENDER ORDER BY GENDER

-- Obtención de datos estadísticos generales

SELECT  COUNT(*)     AS NUMERO_PERSONAS_TOTAL,
        MAX(SALARIO) AS SALARIO_MAXIMO,
        MIN(SALARIO) AS SALARIO_MINIMO,
        AVG(SALARIO) AS SALARIO_MEDIO
FROM PERSONAS

-- Inserción de datos

-- Eliminación de datos


-- Actualización de datos


-- Creación de vistas


-- Modelo con más de una tabla I (Jugadores, Equipos)


-- Modelo con más de una tabla II (Alumnos, Asignaturas)


-- Consultas sobre más de una tabla

-- Normalización I (ejemplo con GENDER)
-- Normalización II (ejemplo con calculo precio... Precio Coste + Margen....)

-- EJERCICIO -> Pollos Hermanados!!!!
