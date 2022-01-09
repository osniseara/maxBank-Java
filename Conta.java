class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		if(agencia <=0) {
			System.out.println("Digite um Valor válido");
			return;
		}
		Conta.total++; 
		System.out.println("O total de contas é "+ total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		
		System.out.println("Estou criando uma conta  "+ this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo =+valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >=valor) {
			this.saldo-=valor;
			return true;
		} else {
			return false;
		}
	}
 	

    public boolean transfere(double valor, Conta destino) {
	
		if(this.saldo >= valor) {
			this.saldo-=valor;
			
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
    } 
    public double getSaldo() {
    	return this.saldo;
    }
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
			if(numero <=0) {
				System.out.println("Não pode valor menor igual a zero");
				return;
			}
	
	} 
	public int getAgencia() {
		return this.agencia;
	}
			
	public void setAgencia (int novaAgencia) {
				
		if (agencia <=0) {
			System.out.println("Agencia nao pode ter valor negativo ou  igual a zero");
				return;
		}
		this.agencia = novaAgencia;
	}
			
		
		
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}


	public static int getTotal() {
		return Conta.total;
	}
}