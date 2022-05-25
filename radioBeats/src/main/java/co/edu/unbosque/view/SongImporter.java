package co.edu.unbosque.view;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.unbosque.util.StringEncoder;

/**
 *
 * @author Bryan Baron
 * @author Juan Avila
 * @author Juan Tarazona
 * @author Sebastian Carrera
 *
 * @version 1.0
 *
 */
public class SongImporter extends JPanel {

    private JLabel songImporterTittleLabel;
    private JLabel songNameLabel;
    private JLabel songGenLabel;
    private JTextField songNameField;
    private JComboBox<String> songGenOptions;
    private JButton selectFileButton;
    private JButton acceptButton;
    private JButton cancelButton;

    /**
     * Creates new form SongImporter
     */
    public SongImporter() {
        initComponents();
    }

    /**
     * Initalizes the jFrame components
     */
    private void initComponents() {
        songImporterTittleLabel = new JLabel();
        songNameLabel = new JLabel();
        songGenLabel = new JLabel();
        songNameField = new JTextField();
        songGenOptions = new JComboBox<>();
        selectFileButton = new JButton();
        acceptButton = new JButton();
        cancelButton = new JButton();

        setLayout(null);
        setSize(new Dimension(420, 290));
        setPreferredSize(new Dimension(420, 290));

        songImporterTittleLabel.setFont(new Font("sansserif", 0, 24));
        songImporterTittleLabel.setBounds(113, 20, 210, 29);
        songImporterTittleLabel.setText(StringEncoder
                .encodeStringUTF8("Importar Canción"));
        add(songImporterTittleLabel);

        songNameLabel.setText("Nuevo Nombre");
        songNameLabel.setBounds(74, 80, 95, 17);
        add(songNameLabel);

        songGenLabel.setText(StringEncoder.encodeStringUTF8("Género"));
        songGenLabel.setBounds(275, 80, 47, 17);
        add(songGenLabel);

        songNameField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        songNameField.setBounds(50, 100, 140, 30);
        songGenOptions.setCursor(new Cursor(Cursor.HAND_CURSOR));
        songNameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //
            }
        });
        add(songNameField);

        songGenOptions.setCursor(new Cursor(Cursor.HAND_CURSOR));
        songGenOptions.setBounds(230, 100, 140, 30);
        songGenOptions.setModel(new DefaultComboBoxModel<>(
                    new String[] {
                        "Rock/Metal", "HipHop/Rap", "Pop", "Reaggeton",
                        "Vallenato", "Reagge", "Salsa/Merengue", "Otro" }
                    ));
        songGenOptions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //
            }
        });
        add(songGenOptions);

        selectFileButton.setText("Seleccionar Fichero");
        selectFileButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        selectFileButton.setBounds(120, 150, 170, 30);
        selectFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BaseAppFrame.reloadFrameContent(7);
                //TODO: Implement the other part
            }
        });
        add(selectFileButton);

        acceptButton.setText("Aceptar");
        acceptButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        acceptButton.setBounds(92, 210, 100, 30);
        acceptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BaseAppFrame.reloadFrameContent(-1);
                //TODO: Implement the other part
            }
        });
        add(acceptButton);

        cancelButton.setText("Cancelar");
        cancelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancelButton.setBounds(228, 210, 100, 30);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BaseAppFrame.reloadFrameContent(-1);
            }
        });
        add(cancelButton);
    }
}