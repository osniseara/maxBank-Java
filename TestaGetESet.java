
public class TestaGetESet {
	public static void main(String[] args) {
		Conta contaCorrente = new Conta(2834, 0001);
		Conta contaPoupanca = new Conta (2834, 0002);
		
		System.out.println(contaCorrente.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Bittencourt");
		paulo.setCpf("222.222.222-08");
		paulo.setProfissao("Desenvolvedor");
		contaCorrente.setTitular(paulo);
		
		System.out.println("Você acessou a conta de: " + paulo.getNome() + ", Portador do CPF:" + paulo.getCpf()
		+ ", e com a profissão dê: " + paulo.profissao() + ".");
			
		
		
		
		
		System.out.println("Realizando as operações:");
		contaCorrente.deposita(350);
		System.out.println(contaCorrente.getSaldo());
		contaCorrente.saca(50);
		System.out.println(contaCorrente.getSaldo());
		contaCorrente.transfere(299, contaPoupanca);
		System.out.println(contaCorrente.getSaldo());
		
	
		
	
		
		
		
		
		//	conta.getTitular().setProfissao("Desenvolvedor");
		//System.out.println(conta.getTitular());
		
		//Cliente titularDaconta = conta.getTitular();
		//titularDaconta.setProfissao("Desenvolvedor");
		
	}

}
