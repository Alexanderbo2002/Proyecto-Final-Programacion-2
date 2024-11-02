package igueventos;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import igu.Pprincipal;

public class IguEventos {

    public static void main(String[] args) {
        FlatMaterialLighterIJTheme.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pprincipal().setVisible(true);
            }
        });
    }
}
