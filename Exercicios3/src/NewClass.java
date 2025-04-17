import javax.swing.JOptionPane;
public class NewClass {
    public static void main(String[] args){
        
        
        
    } public static void teste1(){
    int nota1,nota2,nota3;
        double media;
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua primeira nota ?"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua segunda nota ? "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Terceira nota ?"));
        media = (nota1 + nota2 + nota3)/3.0;
        String situacao = (media>7)? "Aprovado" : (media<6.9 && media >5)? "Recuperação" : "Recuperação";
        JOptionPane.showMessageDialog(null,"Sua média é:"+ media + "."+ situacao);
    }
    public static void teste2(){
        int nota1,nota2,nota3;
        double media;
        
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua primeira nota ?"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua segunda nota ? "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Terceira nota ?"));
        media = (nota1 + nota2 + nota3)/3.0;
        if (media > 7){
            System.out.println("Aprovado");
            
        }
        else if (media <6.9 && media >5){
            System.out.println("Recuperação");
            
        }
        else{
            System.out.println("Reprovado");
        }
        
    }
   
}
