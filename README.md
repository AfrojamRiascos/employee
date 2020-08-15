# employee
CRUD RESTFul

1 Script DataBase use MySQL WorkBench

CREATE TABLE t_employee (
    id_employee INT(11) NOT NULL PRIMARY KEY auto_increment,
    fullname VARCHAR(100),
    function VARCHAR(50),
    es_jefe BOOLEAN NOT NULL DEFAULT 0
);

NetBeans 8.2
Servidor GlasFish 4.1
JDK 1.8

1 Instalar herramientas (NetBeans - MySQL WorkBench) de ser necesario
2 Clonar el repositorio
3 Importar repositorio en NetBeans
4 Ejecutar Test
