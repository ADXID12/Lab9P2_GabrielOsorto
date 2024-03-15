package PrincipalPackage;

import javax.swing.JProgressBar;

public class Hilo extends Thread {

    private JProgressBar barrita;
    private boolean seguir, avanzar;

    public Hilo(JProgressBar barrita) {
        this.barrita = barrita;
        seguir = true;
        avanzar = true;
    }

    public void setseguir(boolean seguir) {
        this.seguir = seguir;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
        while (seguir) {
            if (avanzar) {
                barrita.setValue(barrita.getValue() + 1);
                //activar y modificar propiedad stringPainted para que esto funciones
                barrita.setString(Integer.toString(barrita.getValue()) + " Minutos");

            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
