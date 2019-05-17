package AsciiMath;

import org.antlr.v4.gui.TreeViewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class IO {

    static int saveTreeImg(TreeViewer viewer, String fileName) {
        viewer.setScale(1.5);
        viewer.setSize(viewer.getPreferredSize());

        // viewer.save(fileName);
        JFrame f = new JFrame();
        Container c = f.getContentPane();
        ((JComponent) c).setBorder(BorderFactory.createEmptyBorder());
        c.add(viewer);
        Color transparent = new Color(0, true);
        c.setBackground(transparent);
        f.pack();
        f.setLocationRelativeTo(null);
        f.dispose();


        // GraphicsSupport.saveImage(viewer, fileName);
        Rectangle r = viewer.getBounds();
        BufferedImage image = new BufferedImage(r.width, r.height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(transparent);
        g.fill(r);
        c.paint(g);
        String ext = fileName.substring(fileName.lastIndexOf('.') + 1);
        try {
            ImageIO.write(image, ext, new File(fileName));
            g.dispose();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            System.err.println("Error 1: no appropriate image writer");
            return 1;
        }
        return 0;
    }
}
