import java.util.Scanner;

public class PetShop {
    
    Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente gabriel = new Cliente(999999, "Gabriel Weber", 49991028318l, 300);
        Animal pluto = new Animal(07023, "Pluto", "Pastor alemao", "Gabriel", 04042022, true, gabriel);

        Servicos servico = new Servicos(pluto, 02022022, "servico", 0, false, gabriel);

        System.out.println("\n\nO que você deseja fazer?");
        System.out.println("\n\n1 - incluir servicos \n 2 - atualizar saldo \n 3 - atualizar cliente \n 4 - atualizar animal");
        
        int resposta = teclado.nextInt();

        switch (resposta) {
            case 1:
                servico.InlcuiServico();
                break;
            case 2:
                gabriel.AtualizaSaldo();
                break;
            
            case 3: 
                gabriel.AtualizaCliente();
                break;

            case 4:
                pluto.StatusAnimal();
            
            default:
                System.out.println(resposta + " não é uma opção, bobão");
                break;
        }

    }




}
