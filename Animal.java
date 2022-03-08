import java.util.Scanner;

public class Animal {
    

    Scanner Teclado = new Scanner(System.in);


    private int codigo;
    private String nome;
    private String raca;
    private String dono;
    private int DtProxVacina;
    private boolean status;
    public Cliente cliente;

    public Animal(int codigo, String nome, String raca, String dono, int dtProxVacina, boolean status, Cliente cliente) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.dono = dono;
        this.DtProxVacina = dtProxVacina;
        this.status = status;
        this.cliente = cliente;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public int getDtProxVacina() {
        return DtProxVacina;
    }
    public void setDtProxVacina(int dtProxVacina) {
        DtProxVacina = dtProxVacina;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void StatusAnimal(){
        
        status = this.isStatus();
        
        String termo1 = "default";
        String termo2 = "default";

        if(status == false){
            termo1 = "desativado";
            termo2 = "ativado";
        }
        if(status == true){
            termo1 = "ativado";
            termo2 = "desativado";
        }

        System.out.println("Tem certeza de que deseja alterar o status do animal de " + termo1 + " para " + termo2 + "? [Y/n]");
        String resposta = Teclado.nextLine();

        if(resposta.equals("y")){
            if(status == true){
                this.setStatus(false);
            }
            else this.setStatus(true);
        }
        else System.out.println("Operacao Cancelada.");
    }


    public void AtualizaDataVacina(){
        System.out.println("Insira a data da próxima vacina [ddmmaaaa]: ");
        int data = Teclado.nextInt();
        this.setDtProxVacina(data);
        System.out.println("Data alterada com sucesso! ");
    }
}
