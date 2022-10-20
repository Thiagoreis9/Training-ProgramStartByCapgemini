package Cadastros;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa(5, "Neymar Junior", "neymarJunior@gmail.com");
		PessoaDao pD = new PessoaDao();
		
		//pD.incluirPessoa(p);
		//System.out.println(p);
		//System.out.println("Cadastrado(a) com sucesso! ");
		
		//pD.alterarPessoa(p);
		//System.out.println(p);
		//System.out.println("Alterado(a) com sucesso! ");
		
		//pD.excluirPessoa(p);
		//System.out.println(p);
		//System.out.println("Excluido(a) com sucesso! ");
		//pD.consultarPessoaIndividual(1);
		
		pD.consultarPessoasCadastradas();
		
		
		
		
		
		
	}

}
