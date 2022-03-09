import java.util.Scanner;

public class Servicos {
    
    private Animal animal;
    private int data;
    private String servico;
    private float valor;
    private boolean pagto;
    private Cliente cliente;

    Scanner Teclado = new Scanner(System.in);
    
    
    public Servicos(Animal animal, int data, String servico, float valor, boolean pagto, Cliente cliente) {
        this.animal = animal;
        this.data = data;
        this.servico = servico;
        this.valor = valor;
        this.pagto = pagto;
        this.cliente = cliente;
    }


    public Animal getAnimal() {
        return animal;
    }


    public void setAnimal(Animal animal) {
        this.animal = animal;
    }


    public int getData() {
        return data;
    }


    public void setData(int data) {
        this.data = data;
    }


    public String getServico() {
        return servico;
    }


    public void setServico(String servico) {
        this.servico = servico;
    }


    public float getValor() {
        return valor;
    }


    public void setValor(float valor) {
        this.valor = valor;
    }


    public boolean getPagto() {
        return pagto;
    }


    public void setPagto(boolean pagto) {
        this.pagto = pagto;
    }

    private float valservico = 0f;

    public void InlcuiServico(){

        if(this.animal.isStatus() != false){
            if(this.cliente.getSaldo() != 0){
                Boolean continuar = true;
                while(continuar == true){
                    System.out.println("\nOs serviços disponíveis são: \n1 - Banho = R$ 20,00, \n 2 - Tosa = R$ 15,00, \n 3 - Diária = R$ 80,00 \n 4 - Vacina = R$ 50,00 \n 0 - Encerrar pedido");
                    System.out.println("\n\nServiço a ser adicionado: ");
                    int servico = Teclado.nextInt();

                    int erro = 0;

                    switch (servico) {
                        case 1:
                            valservico = valservico + 20f;
                            break;
                        
                        case 2:
                            valservico = valservico + 15f;
                            break;
                        
                        case 3:
                            valservico = valservico + 80f;
                            break;

                        case 4:
                            valservico = valservico + 50f;
                            break;
                        case 0:
                            continuar = false;
                            break;
                        default:
                            System.out.println("Opção inesistente!");
                            erro = 1;
                            break;
                    }
                    if(erro == 0) System.out.println("\n\nServiço aicionado com sucesso!");
                    
                }
                
                if(this.pagto){
                    this.cliente.setSaldo(this.cliente.getSaldo() - valservico);
                    valservico = 0;
                }
                else {
                    System.out.println("Para realizar o débito, é necessário atualizar o pagamento. Digite 1 para atualizar agora, ou 0 para cancelar a operação.");
                    if(Teclado.nextInt() == 1) AtualizaPagto();
                }
            }
            else System.out.println("O cliente está negativado ou não possui saldo.");
        }
        else System.out.println("O animal não está ativo.");
    }

    void AtualizaPagto(){
        if (this.valservico <= 0){
            System.out.println("Não há mais pagamentos pendentes!");
        }
        else {
            pagto = true;
            System.out.println("O pagamento foi atualizado com sucesso. Deseja realizar o débito agora?[Y/n]");
            if(Teclado.next().equals("y")){
                if(pagto = true){
                    this.cliente.setSaldo(this.cliente.getSaldo() - valservico);
                    valservico = 0;
                }
            }
            else System.out.println("Operação finalizada.");
        }
    }

}
