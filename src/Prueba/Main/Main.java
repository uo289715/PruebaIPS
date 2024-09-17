package Prueba.Main;


/**
 * Ejemplos de acceso a una base de datos con conexion JDBC y base de datos Sqlite
 * 
 * Incluye varios metodos que se pueden ejecutar desde los tests en src/test/java (giis.demo.jdbc.ut):
 * (1) Consulta e insercion de datos y manejo basico de excepciones
 * (2) Excepciones con Try With Resources
 * (3) Ejecucion de consultas con parametros (PreparedStatement)
 * (4) Uso de Apache Commons DbUtils para simplificar las consultas y manejo de excepciones
 * (5) Uso de campos autoincrementales
 */
public class Main {
	
	public static void main(String[] args) {
		int j=19;
		System.out.print(j);
	}
}
