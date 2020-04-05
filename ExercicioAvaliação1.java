import java.util.Scanner;
public class ExercicioAvaliação1
{
    public static void main (String [] args) 
    {
        Scanner in = new Scanner(System.in);
        
        double ValorMetro = 18.90;
        
        System.out.println("Qual a altura em metros?");
        double Altura = in.nextDouble();
        if (Altura <= 0)
        {
            System.out.println("Valor inválido! Serão aceitos apenas valores maiores que zero.");
            System.out.println("Qual a altura em metros?");
            Altura = in.nextDouble();
        }
    
        System.out.println("Qual a largura em metros?");
        double Largura = in.nextDouble();
        if (Largura <= 0)
        {
            System.out.println("Valor inválido! Serão aceitos apenas valores maiores que zero.");
            System.out.println("Qual a largura em metros?");
            Largura = in.nextDouble();
        }
    
        double Area = Altura * Largura;
        double Orcamento = Area * ValorMetro;
        
        System.out.println("Área Total: "+ Area + " " + "m².");
        System.out.println("Orçamento: "+ Orcamento + " " + "reais.");
        
        double Desconto1 = Area * ValorMetro * 0.05;
        double Desconto2 = Area * ValorMetro * 0.075;
        double Desconto3 = Area * ValorMetro * 0.10;
        if(Area <= 10)
        {
            System.out.println("Desconto apenas para compras acima de 10m².");
        }
        
        if(10 < Area && Area <= 20)
        {
            System.out.println("Seu desconto será: "+ Desconto1 + " " + "reais.");
        }
        
        if(20 < Area && Area <= 30)
        {
            System.out.println("Seu desconto será: "+ Desconto2 + " " + "reais.");
        }
        
        if(30 < Area)
        {
            System.out.println("Seu desconto será: "+ Desconto3 + " " + "reais.");
        }
        
        double Total = Orcamento;
        double Total1 = Orcamento - Desconto1;
        double Total2 = Orcamento - Desconto2;
        double Total3 = Orcamento - Desconto3;
        if(Area <= 10)
        {
            System.out.println("Valor Total a pagar: " + Total + " " + "reais.");
        }
        
        if(10 < Area && Area <= 20)
        {
            System.out.println("Valor total a pagar: " + Total1 + " " + "reais.");
        }
        
        if(20 < Area && Area <= 30)
        {
            System.out.println("Valor total a pagar: " + Total2 + " " + "reais.");
        }
        
        if(30 < Area)
        {
            System.out.println("Valor total a pagar: " + Total3 + " " + "reais.");
        }
    }
}