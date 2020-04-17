import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.Border;

public class CalculatorMain{
    final static boolean shouldFill = true;

    public static void addComponentsToPane(Container pane) {

        JLabel answer;

        Checkbox fever; Checkbox leukopenia; Checkbox thrombo; Checkbox hemo; Checkbox delirium;
        Checkbox psych; Checkbox seize; Checkbox alopecia; Checkbox ulcer; Checkbox disc;
        Checkbox cute; Checkbox joint; Checkbox pro; Checkbox neph2; Checkbox neph3;
        Checkbox effuse; Checkbox pc; Checkbox c3; Checkbox c4; Checkbox smith; Checkbox apl;

        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        fever = new Checkbox("Fever");
        c.ipady = 5;
        c.ipadx = 5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 0;
        pane.add(fever, c);

        leukopenia = new Checkbox("Leukopenia");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 1;
        pane.add(leukopenia, c);

        thrombo = new Checkbox("Thrombocytopenia");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 2;
        pane.add(thrombo, c);

        hemo = new Checkbox("Autoimmune Hemolysis");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 3;
        pane.add(hemo, c);

        delirium = new Checkbox("Delirium");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 4;
        pane.add(delirium, c);

        psych = new Checkbox("Psychosis");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 5;
        pane.add(psych, c);

        seize = new Checkbox("Seizure");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 6;
        pane.add(seize, c);

        alopecia = new Checkbox("Non-Scarring Alopecia");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 7;
        pane.add(alopecia, c);

        ulcer = new Checkbox("Oral Ulcers");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 8;
        pane.add(ulcer, c);

        disc = new Checkbox("Subacute Cutaneous or Discoid Lupus");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 9;
        pane.add(disc, c);

        cute = new Checkbox("Acute Cutaneous Lupus");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 10;
        pane.add(cute, c);

        joint = new Checkbox("Joint Involvement");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 11;
        pane.add(joint, c);

        pro = new Checkbox("Proteinuria > 0.5g / 24 hours");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 12;
        pane.add(pro, c);

        neph2 = new Checkbox("Class II or V Lupus Nephritis");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 13;
        pane.add(neph2, c);

        neph3 = new Checkbox("Class III or IV Lupus Nephritis");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 14;
        pane.add(neph3, c);

        effuse = new Checkbox("Pleural or Pericardial Effusion");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 15;
        pane.add(effuse, c);

        pc = new Checkbox("Acute Pericarditis");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 16;
        pane.add(pc, c);

        c3 = new Checkbox("Low C3 Complement");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 17;
        pane.add(c3, c);

        c4 = new Checkbox("Low C4 Complement");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 18;
        pane.add(c4, c);


        smith = new Checkbox("Anti-dsDNA OR Anti-Smith Antibodies");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 19;
        pane.add(smith, c);


        apl = new Checkbox("Positive Antiphospholipid Antibodies");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.weightx = 1;
        c.gridy = 20;
        pane.add(apl, c);

        answer = new JLabel("SLE Criteria Not Met");
        answer.setHorizontalAlignment(JLabel.CENTER);
        answer.setFont(new Font("Arial", Font.BOLD, 14));
        answer.setBackground(Color.RED);
        answer.setOpaque(true);
        c.gridx = 0;
        c.gridy = 21;       //third row
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = 2;

        pane.add(answer, c);

        // Groups for using radio buttons
        /*ButtonGroup hematologic = new ButtonGroup();
        ButtonGroup neuropsychiatric = new ButtonGroup();
        ButtonGroup mucocutaneous = new ButtonGroup();
        ButtonGroup renal = new ButtonGroup();
        ButtonGroup serosa = new ButtonGroup();
        ButtonGroup complementProteins = new ButtonGroup();*/

        ItemListener listener = e -> {

            int tally = 0;

            // constitutional
            if (fever.getState()) {
                tally += 2;
            }

            // hematologic
            if (thrombo.getState() || hemo.getState()) {
                tally += 4;
            }
            else if (leukopenia.getState()) {
                tally += 3;
            }

            // neuropsychiatric
            if (seize.getState()) {
                tally += 5;
            }
            else if (psych.getState()) {
                tally += 3;
            }
            else if (delirium.getState()) {
                tally += 2;
            }

            // mucocutaneous
            if (cute.getState()) {
                tally += 6;
            }
            else if (disc.getState()) {
                tally += 4;
            }
            else if (ulcer.getState()) {
                tally += 2;
            }
            else if (alopecia.getState()) {
                tally += 2;
            }

            // musculoskeletal
            if (joint.getState()) {
                tally += 6;
            }

            // renal
            if (neph3.getState()) {
                tally += 10;
            }
            else if (neph2.getState()) {
                tally += 8;
            }
            else if (pro.getState()) {
                tally += 4;
            }

            // serosa
            if (pc.getState()) { tally += 6; }
            else if (effuse.getState()) { tally += 5; }

            // complement proteins
            if (c4.getState()) { tally += 4; }
            else if (c3.getState()) { tally += 3; }

            // SLE-specific antibodies
            tally += smith.getState() ? 6 : 0;

            // Antiphospholipid antibodies
            tally += apl.getState() ? 2 : 0;

            // update bottom label?
            if (tally > 9) {
                answer.setText("SLE Criteria Met");
                answer.setBackground(Color.green);
            }
            else {
                answer.setText("SLE Criteria Not Met");
                answer.setBackground(Color.RED);
            }
        };

        fever.addItemListener(listener); leukopenia.addItemListener(listener);
        thrombo.addItemListener(listener); hemo.addItemListener(listener);
        delirium.addItemListener(listener); psych.addItemListener(listener);
        seize.addItemListener(listener); alopecia.addItemListener(listener);
        ulcer.addItemListener(listener); disc.addItemListener(listener);
        cute.addItemListener(listener); joint.addItemListener(listener);
        pro.addItemListener(listener); neph2.addItemListener(listener);
        neph3.addItemListener(listener); effuse.addItemListener(listener);
        pc.addItemListener(listener); c3.addItemListener(listener);
        c4.addItemListener(listener); smith.addItemListener(listener);
        apl.addItemListener(listener);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Lupus Calculator v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        contentPanel.setBorder(padding);
        frame.setContentPane(contentPanel);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
