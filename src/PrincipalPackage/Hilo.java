package PrincipalPackage;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Hilo extends Thread {

    private JProgressBar barrita;
    private boolean seguir, avanzar;
    private JTextArea ta_hilo;
    private String text;

    public Hilo(JProgressBar barrita, JTextArea ta_hilo,String text) {
        this.barrita = barrita;
        this.ta_hilo=ta_hilo;
        this.text=text;
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
        while (true) {
            if (barrita.getValue()==100) {
                break;
            }
                else{
                barrita.setValue(barrita.getValue() + 1);
                //activar y modificar propiedad stringPainted para que esto funciones
                barrita.setString(Integer.toString(barrita.getValue()) + " Minutos");
            }//Fin del if
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }//fin del while principal
        ta_hilo.setText(text);
    }
}
