import java.awt.*;

public class Funcition_File {
    GUI gui;

    public Funcition_File(GUI gui) {
        this.gui = gui;
    }

    public void newFle() {
        gui.textArea.setText("");
        gui.window.setTitle("New");
    }

    public void open(){
        FileDialog fd = new FileDialog(gui.window,"Open", FileDialog.LOAD);
        fd.setVisible(true);
    }
}
