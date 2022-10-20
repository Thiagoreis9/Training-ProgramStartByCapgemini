package Cadastros;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Classe responsável pela persistencia de dados da classe Pessoa
public class PessoaDao extends Dao {
	
	// Cadastrar Pessoa no DB
	public void incluirPessoa(Pessoa p) throws Exception{
		
		try{
			open();
			stmt = con.prepareStatement("INSERT INTO pessoa values (?, ?, ?)");
			stmt.setInt(1, p.getIdPessoa());
			stmt.setString(2, p.getNomePessoa());
			stmt.setString(3, p.getEmailPessoa());
			stmt.execute();
			stmt.close();
		} catch(SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao cadastrar a pessoa! ");
		}
		
	}
	
	//TODO Resolver bug, está entrando na exceção.
	//Alterar Pessoa pelo Id no BD
	public void alterarPessoa(Pessoa p) throws Exception{
		
		try{
			open();
			stmt = con.prepareStatement("update pessoa  SET nomepessoa = ?, email = ? where idPessoa = ?");
			stmt.setString(1, p.getNomePessoa());
			stmt.setString(2, p.getEmailPessoa());
			stmt.setInt(3, p.getIdPessoa());
			stmt.execute();
			stmt.close();
		} catch(SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao alterar a pessoa! ");
		}
		
	}
	
	//Excluir Pessoa pelo Id no BD
	public void excluirPessoa(Pessoa p) throws Exception {
		
		try {
			open();
			stmt = con.prepareStatement("delete from Pessoa where idPessoa = ? ");
			stmt.setInt(1,p.getIdPessoa());
			stmt.execute();
			stmt.close();
		} catch(SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao excluir a pessoa! ");
		}
	}
	
	//Consulta de pessoa individualmente
	public Pessoa consultarPessoaIndividual(int cod) throws Exception {
		
		open();
		stmt = con.prepareStatement("select * from pessoa where idPessoa = ? ");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		
		Pessoa p = null;
		
		if(rs.next()) {
			p = new Pessoa();
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmailPessoa(rs.getString("email"));
			System.out.println(p);
		} else {
			System.out.println("Registro não localizado !");
		}
		
		return p;
		
	}
	
	//Consulta de todas pessoas cadastradas
	public List<Pessoa> consultarPessoasCadastradas() throws Exception {
		
		open();
		stmt = con.prepareStatement("select * from pessoa ");
		rs = stmt.executeQuery();
		
		Pessoa p = null;
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		while(rs.next()) {
			p = new Pessoa();
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmailPessoa(rs.getString("email"));
			
			listaPessoas.add(p);
			System.out.println("Código......: " + p.getIdPessoa());
			System.out.println("Nome........: " + p.getNomePessoa());
			System.out.println("Email.......: " + p.getEmailPessoa());
			System.out.println("-------------------------------------");
		}
		
		return listaPessoas;
		
	}
	
	
}



