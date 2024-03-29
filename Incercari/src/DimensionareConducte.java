import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Math.round;

public class DimensionareConducte {
    private JPanel panel1;
    private JTextField vasClosetTextField;
    private JTextField spalatorTextField;
    private JTextField lavoarTextField;
    private JTextField nrLavoar;
    private JTextField nrSpalator;
    private JTextField nrVasCloset;
    private JTextField cadaBaieTextField;
    private JTextField masinaDeSpalatTextField;
    private JTextField dusTextField;
    private JTextField pisoarTextField;
    private JTextField bideuTextField;
    private JTextField nrCadaBaie;
    private JTextField nrMS;
    private JTextField nrDus;
    private JTextField nrBideu;
    private JTextField Rezultat;
    private JButton debitLSButton;
    private JTextField nrPisoar;

    public DimensionareConducte() {
        debitLSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int nrLavoare = Integer.parseInt(nrLavoar.getText());
                    int nrToalete = Integer.parseInt(nrVasCloset.getText());
                    int nrDusuri = Integer.parseInt(nrDus.getText());
                    int nrSpalatoare = Integer.parseInt(nrSpalator.getText());
                    int nrMasiniSpalat = Integer.parseInt(nrMS.getText());
                    int nrBideuri = Integer.parseInt(nrBideu.getText());
                    int nrCaziBaie = Integer.parseInt(nrCadaBaie.getText());
                    int nrPisoare = Integer.parseInt(nrPisoar.getText());

                    double debitTotal = 0.45 * Math.sqrt(nrLavoare * 0.07 + nrSpalatoare * 0.3 + nrToalete * 0.15 + nrCaziBaie * 0.3 + nrMasiniSpalat * 0.17
                            + nrDusuri * 0.3 + nrPisoare * 0.035 + nrBideuri * 0.07);
                    Rezultat.setText(String.valueOf(round(debitTotal, 2)));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers for all fixture categories.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DimensionareConducte");
        frame.setContentPane(new DimensionareConducte().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}