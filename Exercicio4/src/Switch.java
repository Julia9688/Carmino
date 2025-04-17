import javax.swing.JOptionPane;
public class Switch {
    public static void main(String[] args){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU DE ATENDIMENTO \n"
                + "1- Suporte Técnico"
                + "\n2 - Financeiro"
                + "\n3 - Falar com atendimento"
                + "\n4 - Cancelar serviço"
                + "\n5 - Encerrar atendimento"));
            
        switch (opcao){
            case 1 :
                JOptionPane.showMessageDialog(null, "SUPORTE TÉCNICO");
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "FINANCEIRO");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "FALAR COM ATENDENTE");
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "CANCELAR SERVIÇO");
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, "ENCERRAR ATENDIMENTO");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção invalida. Tente novamente");
                break;
    }
    }

}
