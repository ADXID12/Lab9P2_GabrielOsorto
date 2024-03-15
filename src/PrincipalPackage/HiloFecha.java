package PrincipalPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class HiloFecha implements Runnable {

    private JLabel Fecha;

    public HiloFecha(JLabel Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public void run() {
        while (true) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Fecha.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
