import java.util.Scanner;

public class Principal   {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        Requisicao requisicao = new Requisicao();





        String menu = """  
                    ******************* Bem Vindo ao conversor de moedas *******************
                    
                                        
                    1 - Dólar[USD] ==> Real [BRL] 
                    2 - Real [BRL] ==> Dólar[USD] 
                    3 - Euro [EUR] ==> Real [BRL] 
                    4 - Real [BRL] ==> Euro [EUR]
                    5 - Dólar[USD] ==> Euro [EUR]
                    6 - Real [BRL] ==> Libra[GBP]
                    
                    7 - SAIR
                    
                    Escolha o par de moeda para conversão : 
                    
                    """ ;

        while (opcao != 7) {
            try {
                System.out.println(menu);
                opcao = (int) scanner.nextDouble();
                double valor;
                System.out.println("Quanto voce deseja converter?");
                valor = scanner.nextDouble();

                if(opcao == 1) {
                    Conversor conversao = requisicao.conversor("USD", "BRL", valor);
                    System.out.println( "US$" + valor + " é o mesmo que R$" + conversao + "em reais");
                    break;
                } else if (opcao == 2) {
                    Conversor conversao = requisicao.conversor("BRL", "USD", valor);
                    System.out.println( "R$" + valor + " é o mesmo que US$" + conversao + "em dolares");
                    break;
                } else if (opcao == 3) {
                    Conversor conversao = requisicao.conversor("EUR", "BRL", valor);
                    System.out.println( "€" + valor + " é o mesmo que R$" + conversao + "em reais");
                    break;
                } else if (opcao == 4) {
                    Conversor conversao = requisicao.conversor("BRL", "EUR", valor);
                    System.out.println("R$" + valor + " é o mesmo que €" + conversao + "em euro");
                    break;
                } else if (opcao == 5) {
                    Conversor conversao = requisicao.conversor("USD", "EUR", valor);
                    System.out.println("US$" + valor + " é o mesmo que €" + conversao + "em euro");
                    break;
                } else if (opcao == 6) {
                    Conversor conversao = requisicao.conversor("BRL", "GBP", valor);
                    System.out.println("R$" + valor + " é o mesmo que £" + conversao + "em Libra esterlinas");
                    break;
                } else if (opcao != 7) {
                    System.out.println("Opção invalida");
                    break;
                } else { System.out.println("Finalizando a Aplicação");
                break;
                }

            } catch (Exception e) {
                System.out.println("Não foi possivel fazer a verificação, tente novamente");
                System.out.println("Até breve");
                break;






            }


        }
    }
}