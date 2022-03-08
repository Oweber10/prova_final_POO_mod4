import java.util.Scanner;

public class Cliente {
    private int cpf;
    private String nome;
    private long fone;
    private float saldo;
    

    Scanner Teclado = new Scanner(System.in);
    
    public Cliente(int cpf, String nome, long fone, float saldo) {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
        this.saldo = saldo;
    }


    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public long getFone() {
        return fone;
    }


    public void setFone(long fone) {
        this.fone = fone;
    }


    public float getSaldo() {
        return saldo;
    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



    public void AtualizaSaldo(){
        System.out.println("Insira o novo saldo do cliente: ");
        float saldo = Teclado.nextFloat();
        setSaldo(saldo);
        System.out.println("Saldo alterado com sucesso!");
    }

    public void AtualizaCliente(){
        System.out.println("Os dados atuais são: ");
        System.out.println("1 - CPF: " + this.getCpf());
        System.out.println("2 - Nome: " + this.getNome());
        System.out.println("3 - Saldo: " + this.getSaldo());
        System.out.println("4 - Fone: " + this.getFone());

        System.out.println("\n Qual dado você deseja alterar? [1-4]");
        int resposta = Teclado.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("Insira o novo CPF: ");
                this.setCpf(Teclado.nextInt());
                break;
            
            case 2:
                System.out.println("Insira o novo nome: ");
                this.setNome(Teclado.next());
                break;
            
            case 3:
                System.out.println("Insira o novo saldo: ");
                this.setSaldo(Teclado.nextFloat());
                break;

            case 4:
                System.out.println("Insira o novo telefone: ");
                this.setFone(Teclado.nextLong());
                break;

            default:
            break;
        }
        System.out.println("Operação realizada com sucesso!");
    }

}
