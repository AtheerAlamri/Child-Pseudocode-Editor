package childeditor;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Analyser extends javax.swing.JFrame {
    //Compiling the regular expression to find the required character

    final static String primitiveTypes = "double|int|float|char|boolean ";
    final static String keyWordsIf = "if|else|else if";
    final static String keyWordsLoop = "for|while|do";
//    final static String keyWords = "if|else|else if|for|while|do";

    final static String identifiers = "[a-zA-Z][a-zA-Z0-9_]*";
    final static String string = "^(\".*\")$";
    final static String charecter = "^(\'.\')$";

    final static String assignmentOperator = "[=]";
    final static String arithmeticOperator = "\\+|\\-|\\*|%";
    final static String unaryOperator = "([\\+]{2}|[\\-]{2})";
    final static String relationalOperator = "<=|>=|==|=|>|<|!=";
    final static String conditionalOperator = "[\\&\\|]{2}";

    final static String symbol = "[\\(\\)\\{\\}\\[\\]\\.\\,\\:\\'\\\"]";
    final static String semicolon = "[;]";

    final static String integerNumbers = "([0-9]+|\\-[0-9]+)";
    final static String floatNumbers = "([0-9]+\\.[0-9]+|\\-[0-9]+\\.[0-9]+)";
    final static String boolean2 = "true|false";

    final static String startBlock = "[:]";
    final static String endBlock = "EndBlock";
    final static String program = "program";
    final static String end = "End";

    public Analyser() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Full Screen

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Child Pesudocode editor");

        jPanel1.setBackground(new java.awt.Color(192, 222, 225));

        jPanel2.setBackground(new java.awt.Color(134, 134, 125));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 3, 24)); // NOI18N
        jLabel1.setText("Child Pesudocode editor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(192, 222, 225));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        jLabel2.setText("</> Code:");

        jScrollPane1.setBackground(new java.awt.Color(112, 112, 95));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        jTextArea1.setCaretColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jButton2.setText("Analyze");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(192, 222, 225));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        jLabel3.setText("Syntax error:");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), null));
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Dubai Light", 0, 18)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setRows(5);
        jTextArea4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(jTextArea4);

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 3, 18)); // NOI18N
        jLabel4.setText("Lexical error:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(519, 519, 519))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jButton3.setText("Exit");
        jButton3.setMaximumSize(new java.awt.Dimension(149, 27));
        jButton3.setMinimumSize(new java.awt.Dimension(149, 27));
        jButton3.setPreferredSize(new java.awt.Dimension(149, 27));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.setMaximumSize(new java.awt.Dimension(149, 27));
        jButton4.setMinimumSize(new java.awt.Dimension(149, 27));
        jButton4.setPreferredSize(new java.awt.Dimension(149, 27));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jButton5.setText("RegexToDFA");
        jButton5.setMaximumSize(new java.awt.Dimension(149, 27));
        jButton5.setMinimumSize(new java.awt.Dimension(149, 27));
        jButton5.setPreferredSize(new java.awt.Dimension(149, 27));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)))
                .addGap(1, 1, 1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        press();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea4.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConvertRegextoDFA regexToDFA = new ConvertRegextoDFA();
        regexToDFA.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    public void press() {

        String error = "";
        String simpleTable = "";

        // The text in jTextArea1 save in string type
        String input = jTextArea1.getText();

        // Get text after adding spaces after calling the space method
        String inputSpace = space(input);

        ArrayList<String> fortokenCategory = new ArrayList<String>();

        try {

            //Write the text entered in the jTextArea1 in an external file
            try (FileWriter filewrite = new FileWriter("JtextArea input.txt")) {
                filewrite.write(inputSpace);
            }

            int l = 1;

            ArrayList<Token> tokensText = new ArrayList<>(inputSpace.length());

            // Read the filewrite
            FileReader file = new FileReader("JtextArea input.txt");

            // Scan file 
            Scanner reader = new Scanner(file);

            String tokenCategory = null;

            while ((reader.hasNextLine())) {

                // To get the line number
                String st = new String(reader.nextLine().getBytes(), "UTF-8");

                // Split string for some cases
                String[] result = st.split("^|\\s|\\n|\\t|[ ]$");
                int i = 0;
                for (String result1 : result) {
                    //If any match
                    if (result1.matches(program)) {
                        tokenCategory = "program";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(keyWordsIf)) {
                        tokenCategory = "KeywordsIf";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(keyWordsLoop)) {
                        tokenCategory = "KeywordsLoop";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(startBlock)) {
                        tokenCategory = "StartBlock";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(endBlock)) {
                        tokenCategory = "EndBlock";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(primitiveTypes)) {
                        tokenCategory = "PrimitiveTypes";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(assignmentOperator)) {
                        tokenCategory = "AssignmentOperator";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(unaryOperator)) {
                        tokenCategory = "UnaryOperator";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(arithmeticOperator)) {
                        tokenCategory = "ArithmeticOperator";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(relationalOperator)) {
                        tokenCategory = "RelationalOperator";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(conditionalOperator)) {
                        tokenCategory = "ConditionalOperator";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(symbol)) {
                        tokenCategory = "Symbol";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(semicolon)) {
                        tokenCategory = "Semicolon";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(integerNumbers)) {
                        tokenCategory = "IntegerNumbers";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(floatNumbers)) {
                        tokenCategory = "FloatNumbers";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(boolean2)) {
                        tokenCategory = "Boolean";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(string)) {
                        tokenCategory = "String";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(charecter)) {
                        tokenCategory = "Charecter";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(end)) {
                        tokenCategory = "End";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches(identifiers)) {
                        tokenCategory = "identifiers";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    } else if (result1.matches("^|\\s|\\n|\\t|[ ]$")) {
                        continue;
                    } else {
                        error += "In line: " + l + " ---> There is an error in token [ " + result1 + " ]!\n";
                        tokenCategory = "Not defined";
                        tokensText.add(new Token(l, result1, tokenCategory));
                    }

                    // Save the information of the token in a variable simpleTable
                    simpleTable += String.format("%-20s %-20s %-20s \n", l, result1, tokenCategory);

                    fortokenCategory.add(tokenCategory);

                }
                l = l + 1;
            }

            //Write the Sample Table to ecternal file
            FileWriter myWriter = new FileWriter("SampleTable.txt");
            myWriter.write(String.format("%-20s %-20s %-20s \n", "Line Number:", "Token:", "Type:") + simpleTable);
            myWriter.close();

            Process process = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "SampleTable.txt");
            process.waitFor();

        } catch (IOException e2) {
            System.out.println("An error occurred.");
        } catch (InterruptedException ex) {
            Logger.getLogger(Analyser.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Print Error
        if ("".equals(error)) {
            jTextArea2.setText("No Errors Pravo!");
        } else {
            jTextArea2.setText(error + "\n");
        }

        // ..... parser part ....
        LR1(fortokenCategory);

    }

    public static String space(String input) {
        String before = "";
        String after = "";
        String current = "";

        for (int i = 0; i < input.length(); i++) {// adding spases 

            if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '(' 
                    || input.charAt(i) == ')' || input.charAt(i) == '*' || input.charAt(i) == '/' 
                    || input.charAt(i) == '%' || input.charAt(i) == '=' || input.charAt(i) == '"' 
                    || input.charAt(i) == ':' || input.charAt(i) == ';' || input.charAt(i) == '<' 
                    || input.charAt(i) == '>' || input.charAt(i) == '!') {
                if (i == input.length() - 1) {
                    if (i != 0) {//end add space before

                        before = input.substring(0, i);//index i is i-1 
                        current = input.substring(i, input.length());//index input.length() is input.length()-1
                        input = before + " " + current;
                        before = "";
                        current = "";
                        i = i + 1;//move index to correct postion after adding spase

                    } else {//end and first no add
                        break;
                    }
                } else {//fist or middle

                    if (i != 0) {// middle add space after and before
                        if (input.length() >= i + 2) {//to sure no out of range 
                            //spetial case
                            if ((input.charAt(i) == '+' && input.charAt(i + 1) == '+') || (input.charAt(i) == '-' && input.charAt(i + 1) == '-') || (input.charAt(i) == '<' && input.charAt(i + 1) == '=') || (input.charAt(i) == '>' && input.charAt(i + 1) == '=') || (input.charAt(i) == '=' && input.charAt(i + 1) == '=') || (input.charAt(i) == '!' && input.charAt(i + 1) == '=')) {
                                before = input.substring(0, i);//index i is i+1 when i write i like i-1
                                after = input.substring(i + 2, input.length());//index input.length() is input.length()-1, no error with i here first parametre

                                input = before + " " + input.charAt(i) + input.charAt(i + 1) + " " + after;
                                before = "";
                                after = "";
                                i = i + 3;//move index to correct postion after adding spases(add 2 for spaces and 1 for another sympol)  

                            } else {//not spetial case &  middle
                                before = input.substring(0, i);//index i is i+1
                                after = input.substring(i + 1, input.length());//index input.length() is input.length()-1
                                input = before + " " + input.charAt(i) + " " + after;
                                before = "";
                                after = "";
                                i = i + 2;//move index to correct postion after adding spases
                            }
                        } else {//not spetial case sprate to keeping value of i correct
                            before = input.substring(0, i);//index i is i+1
                            after = input.substring(i + 1, input.length());//index input.length() is input.length()-1
                            input = before + " " + input.charAt(i) + " " + after;
                            before = "";
                            after = "";
                            i = i + 2;//move index to correct postion after adding spases
                        }

                    } else {// first add space after
                        // ^pointer after i++ in loop(Error pointed to auther opretor need move to char after space we add)
                        //#of adding on i =#of adding spaces or special case

                        if (input.length() >= i + 2) {//to sure no out of range 
                            //special case
                            if ((input.charAt(i) == '+' && input.charAt(i + 1) == '+') || (input.charAt(i) == '-' && input.charAt(i + 1) == '-') || (input.charAt(i) == '<' && input.charAt(i + 1) == '=') || (input.charAt(i) == '>' && input.charAt(i + 1) == '=')
                                    || (input.charAt(i) == '<' && input.charAt(i + 1) == '=')
                                    || (input.charAt(i) == '=' && input.charAt(i + 1) == '=') || (input.charAt(i) == '!' && input.charAt(i + 1) == '=')) {
                                after = input.substring(i + 2, input.length());//index input.length() is input.length()-1

                                input = input.charAt(i) + input.charAt(i + 1) + " " + after;
                                after = "";
                                i = i + 2;//move index to correct postion after adding spases(add 1 for spaces and 1 for another sympol skepped)  

                            } else {//not spetial case
                                // ^pointer after i++ in loop(Error pointed to space need move to char after space we add)
                                after = input.substring(i + 1, input.length());//index input.length() is input.length()-1
                                input = input.charAt(i) + " " + after;
                                after = "";
                                i = i + 1;//move index to correct postion after adding spase
                            }
                        } else {//not spetial case sprate to keeping value of i correct

                            after = input.substring(i + 1, input.length());//index input.length() is input.length()-1
                            input = input.charAt(i) + " " + after;
                            after = "";
                            i = i + 1;//move index to correct postion after adding spase
                        }
                    }
                }
            }
        }
        return input;
    }

    // ***** parser part *****
    public void LR1(ArrayList<String> input) {

        // Save input of category in string variable
        String s = "";
        for (int i = 0; i < input.size(); i++) {

            if (i == input.size() - 1) {
                s = s + input.get(i);
            } else {
                s = s + input.get(i) + " ";
            }
        }

        try {
            // Read the filewrite
            FileReader file1 = new FileReader("JtextArea input.txt");

            // Scan file 
            Scanner reader = new Scanner(file1);

            int l = 1;
            while ((reader.hasNextLine())) {

                String st = new String(reader.nextLine().getBytes(), "UTF-8");
                LR1Parser obj1 = new LR1Parser();

                obj1.read_grammar("LR0.txt");
                obj1.buildDFA();
                System.out.println(obj1.getParsingTable(false) ? "Grammar is LR1 :)" : "Grammar isn't LR1  :(");
                System.out.println(obj1.parse(s, false) ? "Successfully parsed" : "Parse Failure");

//                System.out.println(obj3.states);
//                obj3.print_transitions();
                obj1.getParsingTable(true);

                if (!obj1.parse(s, true)) {
                    jTextArea4.setText("The parse error line number is in line: " + l + "\n");
                } else {
                    jTextArea4.setText("Woohoo no syntax error, accepted :)\n");
                }
                l = l + 1;
            }
        } catch (IOException e2) {
            System.out.println("An error occurred.");
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analyser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Analyser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}