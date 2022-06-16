package finalodevi;

import java.io.IOException;
// loading sınıfı yapar
public class baslama {
    
    public static void main(String[] args) throws IOException {
        progress p = new progress();
        ogrenci o = new ogrenci();
        p.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                p.setJLabel(Integer.toString(i) + "%");
                if (i == 100) {
                    p.setVisible(false);
                    o.setVisible(true);
                    
                }
            }
        } catch (InterruptedException ex) {
        }
    }
}
