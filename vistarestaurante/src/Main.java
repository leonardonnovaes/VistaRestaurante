import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mesa = new ArrayList<Integer>();
        double total = 0;
        String opcComanda;
        String opcRegiaoComida;
        double tacaca, pirarucu, acai = 20.00;
        double acaraje, baiao, cuzcuz = 30.00;
        double churrasco, barreado, pinhao = 40.00;
        double feijoada, moqueca, virado = 50.00;
        double pequi, pamonha, mojica = 60.00;
        double agua, cocacola, cerveja = 5.00;

        Object[] opcInicial = {"Abrir comanda", "Adicionar a comanda", "Encerrar comanda"};
        Object[] opcAbriComanda = {"Norte", "Nordeste", "Sul", "Sudeste", "CentroOeste", "Bebidas","Sair"};
        Object[] comidaNorte = {"tacaca R$20.00", "acai R$20.00", "pirarucu R$20.00"};
        Object[] comidaNordeste = {"acaraje R$30.00", "baiao R$30.00", "cuzcuz R$30.00"};
        Object[] comidaSul = {"churrasco R$40.00", "barreado R$40.00", "pinhao R$40.00"};
        Object[] comidaSudeste = {"feijoada R$50.00", "moqueca R$50.00", "virado R$50.00"};
        Object[] comidaCentroOeste = {"pequi R$60.00", "pamonha R$60.00", "mojica R$60.00"};
        Object[] bebidas = {"agua R$5.00", "cocacola R$5.00", "cerveja R$5.00"};


        String opcI = (String) JOptionPane.showInputDialog(null, "Escolha", "Vista",
                JOptionPane.QUESTION_MESSAGE, null, opcInicial, "Abrir comanda");

        if (opcI.equals("Abrir comanda")) {
            if (mesa.size() == 0) {
                mesa.add(1);
            } else {
                mesa.add(mesa.size() + 1);
            }

            opcComanda = (String) JOptionPane.showInputDialog(null, "Escolha a Regiao", "Vista",
                    JOptionPane.QUESTION_MESSAGE, null, opcAbriComanda, "Norte");
            while (!opcComanda.equals("Sair")) {

                if (opcComanda.equals("Norte")) {
                    opcRegiaoComida = (String) JOptionPane.showInputDialog(null, "Escolha a comida", "Vista",
                            JOptionPane.QUESTION_MESSAGE, null, comidaNorte, "tacaca R$20.00");
                } else if (opcComanda.equals("Nordeste")) {
                    opcRegiaoComida = (String) JOptionPane.showInputDialog(null, "Escolha a comida", "Vista",
                            JOptionPane.QUESTION_MESSAGE, null, comidaNordeste, "acaraje R$30.00");
                } else if (opcComanda.equals("Sul")) {
                    opcRegiaoComida = (String) JOptionPane.showInputDialog(null, "Escolha a comida", "Vista",
                            JOptionPane.QUESTION_MESSAGE, null, comidaSul, "churrasco gaucho R$40.00");
                } else if (opcComanda.equals("Sudeste")) {
                    opcRegiaoComida = (String) JOptionPane.showInputDialog(null, "Escolha a comida", "Vista",
                            JOptionPane.QUESTION_MESSAGE, null, comidaSudeste, "feijoada R$50.00");
                } else if (opcComanda.equals("CentroOeste")) {
                    opcRegiaoComida = (String) JOptionPane.showInputDialog(null, "Escolha a comida", "Vista",
                            JOptionPane.QUESTION_MESSAGE, null, comidaCentroOeste, "pequi R$60.00");
                } else if (opcComanda.equals("Bebidas")) {
                    opcRegiaoComida = (String) JOptionPane.showInputDialog(null, "Escolha a bebida", "Vista",
                            JOptionPane.QUESTION_MESSAGE, null, bebidas, "agua R$5.00");
                }
                opcComanda = (String) JOptionPane.showInputDialog(null, "Escolha a Regiao", "Vista",
                        JOptionPane.QUESTION_MESSAGE, null, opcAbriComanda, "Norte");
            }


        }
    }
}