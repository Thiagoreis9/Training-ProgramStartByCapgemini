package Cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dao {
	
	Connection con;          //Classe que estabelece a conexão com o BD
	PreparedStatement stmt;  //Classe para acessar a Tabela ( insert, update, delete, select )
	ResultSet rs;            //Classe para consultar a Tabela ( select )
	CallableStatement call;  //Procedures e Function
	
	public void open() throws Exception{
		
		String url      = "jdbc:postgresql://localhost:5432/cadastros"; //Driver, Tipo de DB, Endereço do DB e Nome do DB
		String user     = "postgres";    //Usuario
		String password = "Thiago@0140"; //Senha de acesso ao DB
		
		try{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, password); //Atraves da classe DriverManager e de seu método getConnection() é feita a conexão com o DB.
		} catch(SQLException | ClassNotFoundException ex) {
			System.out.println("Erro de conexão com o Banco de Dados!"); //Caso ocorra algum erro na conexão, executa essa exceção tratada.
		}
		
	}
	
	
}
