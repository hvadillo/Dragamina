package org.si.dragamina.actionListener;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class UrlAL extends MouseAdapter{

	@Override
    public void mouseClicked(MouseEvent e) {
            try {
                    Desktop.getDesktop().browse(new URI("https://github.com/hvadillo/Dragamina"));
            } catch (URISyntaxException | IOException ex) {
                    ex.printStackTrace();
            }
    }
}
