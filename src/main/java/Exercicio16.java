import javax.swing.JOptionPane;

public class Exercicio16{

    public static void main(String[] args) {
     
        String nome;
        double preco; 
        
        
         nome =  JOptionPane.showInputDialog("Coloque seu nome: ");
            
         preco =   Double.parseDouble(JOptionPane.showInputDialog("Coloque o preço do seu produto: "));
          
             String categoria = JOptionPane.showInputDialog("Digite a categoria do produto (a, b, c, d, e):");
   
             double desconto = 0;
             
             switch (categoria) {
            case "a":
                desconto = 0.10; // 10% de desconto
                break;
            case "b":
                desconto = 0.15; // 15% de desconto
                break;
            case "c":
                desconto = 0.20; // 20% de desconto
                break;
            case "d":
                desconto = 0.25; // 25% de desconto
                break;
            case "e":
                desconto = 0.50; // 50% de desconto
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoria inválida. Nenhum desconto aplicado.");
    }

             double precofinal = preco -(preco * desconto);
             
                JOptionPane.showMessageDialog(null,"Seu preço total é: " +String.format("%.2f", precofinal) );
    }   
    }