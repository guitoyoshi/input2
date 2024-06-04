import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Não precisa colocar nada aqui, só um mensagem",
                "WhatsApp",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Caixa de dialogo",
                2,
                null,
                null,
                "Fale algo aqui.");
        
        
        String[] acceptableValues = {"Escolha 1", "Escolha 2", "Escolhe 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Caixa de dialogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
