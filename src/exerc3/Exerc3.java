/*
 3.	Calcule e apresente o imposto de renda de um grupo de contribuintes considerando que os dados de cada contribuinte, número do CPF, número de dependentes e renda mensal são valores fornecidos pelo usuário. Para cada contribuinte será feito um desconto de 5% de salário mínimo por dependente. Os valores da alíquota para o cálculo do imposto são:

Renda Líquida	Alíquota
até 2 salários mínimos
2..3 salários mínimos
3..5 salários mínimos
5..7 salários mínimos
acima de 7 salários mínimos	Isento
5%
10%
15%
20%

O último valor, que não será considerado, terá o CPF igual a zero. Deve ser fornecido o valor atual do salário mínimo no início do programa.

 */
package exerc3;
import javax.swing.JOptionPane;
/**
 *
 * @author Vitor Fonseca
 */
public class Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double cpf = 1;
       int dep=0;
       double renda=0;
       double imposto=0;
       double desconto=0;
       double vf=0;
       double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do atual salário minímo: "));
       while(cpf!=0){
           cpf = Double.parseDouble(JOptionPane.showInputDialog("Digite seu CPF:"));
           if(cpf!=0){
           dep = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes:"));
           renda = Double.parseDouble(JOptionPane.showInputDialog("Digite sua renda mensal:"));
           if(renda<=sal*2){
               System.out.println("Você está isento de pagar o imposto de renda");
           }else if(renda>sal*2 && renda <=sal*3){
               imposto = (renda*5)/100;
               desconto = ((imposto*5)/100)*dep;
               vf = imposto - desconto;
               System.out.println("O seu imposto de renda será: "+vf);
           }else if(renda>sal*3 && renda<=sal*5){
               imposto = (renda*10)/100;
               desconto = ((imposto*5)/100)*dep;
               vf = imposto - desconto;
               System.out.println("O seu imposto de renda será: " +vf);
           }else if(renda>sal*5 && renda>=sal*7){
               imposto = (renda*15)/100;
               desconto = ((imposto*5)/100)*dep;
               vf = imposto - desconto;
               System.out.println("O seu imposto de renda será: "+vf);
           }else if(renda>sal*7){
               imposto = (renda*20)/100;
               desconto = ((imposto*5)/100)*dep;
               vf = imposto - desconto;
           }
       }else{
               System.out.println("Número inválido, o programa será encerrado");
           }    
    }
}
}