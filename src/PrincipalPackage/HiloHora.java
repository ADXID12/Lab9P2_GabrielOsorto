package PrincipalPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class HiloHora implements Runnable {

    private JLabel hora;

    public HiloHora(JLabel hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
        while (true) {
            Date hora = new Date();
            DateFormat f = SimpleDateFormat("hh:mm:ss");
            hora.setText(f.format(hora));
            try {
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
