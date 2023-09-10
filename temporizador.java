

package com.mycompany.auto;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
public class temporizador {

    public static void main(String[] args) {
      // Crear un temporizador para actualizar el reloj cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la hora actual
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

                // Mostrar la hora actual en un cuadro de diálogo
                JOptionPane.showMessageDialog(null, sdf.format(date), "Reloj", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Iniciar el temporizador
        timer.start();

        // Mostrar un cuadro de diálogo de información inicial con un mensaje
        JOptionPane.showMessageDialog(null, "El reloj ha comenzado.", "Reloj", JOptionPane.INFORMATION_MESSAGE);

        // Esperar hasta que se cierre el cuadro de diálogo
        // Esto evita que el programa termine inmediatamente después de mostrar el reloj
        JOptionPane.showOptionDialog(null, "Haga clic en OK para detener el reloj.", "Reloj", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{}, null);

        // Detener el temporizador cuando se cierra el cuadro de diálogo
        timer.stop();

        // Mostrar un cuadro de diálogo de despedida
        JOptionPane.showMessageDialog(null, "El reloj ha sido detenido.", "Reloj", JOptionPane.INFORMATION_MESSAGE);
    }
}
