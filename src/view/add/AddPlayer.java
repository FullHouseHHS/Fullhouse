/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.add;

import controller.PlayerController;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Nick
 */
public class AddPlayer extends javax.swing.JPanel {

    private String surname, lastName, address, zipCode, emailAddress, city;
    private final int rating = 250;
    int phoneNumber;
    boolean isFamous;
    
    JTextField[] textFields;
        
    String[] stringFields;
        
    JLabel[] errorLabels;
        
    boolean[] textBools;


    /**
     * Creates new form AddPlayer
     */
    public AddPlayer() {
        initComponents();
        initArrays();
        hideLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jInvalidInput = new javax.swing.JLabel();
        jKnownPlayer = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEmailAddress = new javax.swing.JTextField();
        jPhoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFirstName = new javax.swing.JTextField();
        jLastName = new javax.swing.JTextField();
        jAddressLetters = new javax.swing.JTextField();
        jAddressNumbers = new javax.swing.JTextField();
        jZipCodeLetters = new javax.swing.JTextField();
        jZipCodeNumbers = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCity = new javax.swing.JTextField();
        jFirstNameError = new javax.swing.JLabel();
        jLastNameError = new javax.swing.JLabel();
        jAddressError = new javax.swing.JLabel();
        jZipCodeError = new javax.swing.JLabel();
        jPhoneError = new javax.swing.JLabel();
        jCityError = new javax.swing.JLabel();
        jEmailError = new javax.swing.JLabel();

        jButton1.setText("Voeg toe");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jInvalidInput.setForeground(new java.awt.Color(255, 0, 0));
        jInvalidInput.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jInvalidInput.setText("dummy");

        jKnownPlayer.setText("Is bekende speler");

        jLabel6.setText("Bekende speler?");

        jLabel5.setText("E-mail adres");

        jLabel4.setText("Telefoonnummer");

        jAddressNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddressNumbersActionPerformed(evt);
            }
        });

        jLabel7.setText("Voornaam");

        jLabel8.setText("Achternaam");

        jLabel9.setText("Adres");

        jLabel10.setText("Postcode");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Speler toevoegen");

        jLabel2.setText("Plaats");
        jLabel2.setMaximumSize(new java.awt.Dimension(44, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(44, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(44, 14));

        jCity.setToolTipText("");

        jFirstNameError.setForeground(new java.awt.Color(240, 0, 0));
        jFirstNameError.setText("*");

        jLastNameError.setForeground(new java.awt.Color(240, 0, 0));
        jLastNameError.setText("*");

        jAddressError.setForeground(new java.awt.Color(240, 0, 0));
        jAddressError.setText("*");
        jAddressError.setMaximumSize(new java.awt.Dimension(50, 14));
        jAddressError.setMinimumSize(new java.awt.Dimension(50, 14));
        jAddressError.setPreferredSize(new java.awt.Dimension(50, 14));

        jZipCodeError.setForeground(new java.awt.Color(240, 0, 0));
        jZipCodeError.setText("*");

        jPhoneError.setForeground(new java.awt.Color(240, 0, 0));
        jPhoneError.setText("*");

        jCityError.setForeground(new java.awt.Color(240, 0, 0));
        jCityError.setText("*");

        jEmailError.setForeground(new java.awt.Color(240, 0, 0));
        jEmailError.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCity, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jZipCodeNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jZipCodeLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jZipCodeError, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jCityError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jAddressLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jAddressNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFirstNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLastNameError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jAddressError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmailError, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPhoneError, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(95, 95, 95)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(486, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jInvalidInput, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jKnownPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(145, 145, 145)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFirstNameError)
                    .addComponent(jPhoneError)
                    .addComponent(jFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLastNameError)
                    .addComponent(jEmailError)
                    .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jAddressError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddressLetters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddressNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jZipCodeError)
                            .addComponent(jZipCodeNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jZipCodeLetters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCityError))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jKnownPlayer)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                    .addComponent(jInvalidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1)
                    .addGap(186, 186, 186)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        boolean incorrectInput = false;

        /* //checkName
         incorrectInput = InputVerifier.checkLetters(this.jFirstName.getText()) ? incorrectInput : true;
         incorrectInput = InputVerifier.checkLetters(this.jLastName.getText()) ? incorrectInput : true;

         //checkAddress
         incorrectInput = InputVerifier.checkAmountOfCharacters(this.jAddressNumbers.getText(), addressNumberLength ) ? incorrectInput : true;
         incorrectInput = InputVerifier.checkLetters(this.jAddressLetters.getText()) ? incorrectInput : true;
         incorrectInput = InputVerifier.checkNumbers(this.jAddressNumbers.getText()) ? incorrectInput : true;

         //checkZip
         incorrectInput = InputVerifier.checkAmountOfCharacters(this.jZipCodeNumbers.getText(), zipcodeNumberLength ) ? incorrectInput : true;
         incorrectInput = InputVerifier.checkAmountOfCharacters(this.jZipCodeLetters.getText(), zipcodeNumberLength ) ? incorrectInput : true;
         incorrectInput = InputVerifier.checkNumbers(this.jZipCodeNumbers.getText()) ? incorrectInput : true;
         incorrectInput = InputVerifier.checkLetters(this.jZipCodeLetters.getText()) ? incorrectInput : true;

         //checkPhoneNumber
         incorrectInput = InputVerifier.checkAmountOfCharacters(this.jPhoneNumber.getText(), phoneNumberLength ) ? incorrectInput : true;
         incorrectInput = InputVerifier.checkNumbers(this.jPhoneNumber.getText()) ? incorrectInput : true;

        
         //checkEmail
         incorrectInput = InputVerifier.checkEmail(this.jEmailAddress.getText()) ? incorrectInput : true;
         */
        for (int i = 0; i < stringFields.length; i++) {
            stringFields[i] = textFields[i].getText();
        }
        
        
        //First name
        textBools[0] = InputVerifier.checkLetters(stringFields[0]);
        textBools[0] = InputVerifier.checkAmountOfCharacters(stringFields[0], 2, 25);
        if (!textBools[0]) errorLabels[0].setVisible(true);
        //Last name
        textBools[1] = InputVerifier.checkLetters(stringFields[1]);
        textBools[1] = InputVerifier.checkAmountOfCharacters(stringFields[1], 2, 25);
        if (!textBools[1]) errorLabels[1].setVisible(true);
        //Address
        textBools[2] = InputVerifier.checkNumbers(stringFields[2]);
        textBools[2] = InputVerifier.checkAmountOfCharacters(stringFields[2], 2, 25);
        textBools[3] = InputVerifier.checkLetters(stringFields[3]);
        textBools[3] = InputVerifier.checkAmountOfCharacters(stringFields[3], 2, 25);
        if (!textBools[2]) errorLabels[2].setVisible(true);

        //Zipcode
        textBools[4] = InputVerifier.checkNumbers(stringFields[4]);
        textBools[4] = InputVerifier.checkAmountOfCharacters(stringFields[4], 4, 4);
        textBools[5] = InputVerifier.checkLetters(stringFields[5]);
        textBools[5] = InputVerifier.checkAmountOfCharacters(stringFields[5], 2, 2);
        if (!textBools[3]) errorLabels[3].setVisible(true);
        //City
        textBools[6] = InputVerifier.checkLetters(stringFields[6]);
        textBools[6] = InputVerifier.checkAmountOfCharacters(stringFields[6], 2, 25);
        if (!textBools[4]) errorLabels[4].setVisible(true);
        //Phone
        textBools[7] = InputVerifier.checkNumbers(stringFields[7]);
        textBools[7] = InputVerifier.checkAmountOfCharacters(stringFields[7], 10, 10);
        if (!textBools[5]) errorLabels[5].setVisible(true);
        //Email
        textBools[8] = InputVerifier.checkEmail(stringFields[8]);
        textBools[8] = InputVerifier.checkAmountOfCharacters(stringFields[8], 6, 254);
        if (!textBools[6]) errorLabels[6].setVisible(true);
        
 
        
        
        //checkInput
        if (!incorrectInput) {
            setValues();
            //Submit to database
            String addedToDatabase = PlayerController.addPlayer(surname, lastName, phoneNumber, emailAddress, rating, isFamous, address, zipCode, city);
            if (addedToDatabase.contains("fout")) {
                this.jInvalidInput.setVisible(true);
                this.jInvalidInput.setForeground(Color.RED);
                this.jInvalidInput.setText(addedToDatabase);
            } else {
                this.jInvalidInput.setVisible(true);
                this.jInvalidInput.setForeground(new Color(0, 155, 50));
                this.jInvalidInput.setText(addedToDatabase);
            }
        } else {
            //Something wrong has been entered
            this.jInvalidInput.setVisible(true);
            this.jInvalidInput.setForeground(Color.RED);
            this.jInvalidInput.setText("Sommige velden zijn niet goed of volledig ingevuld.");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jAddressNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddressNumbersActionPerformed

    }//GEN-LAST:event_jAddressNumbersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAddressError;
    private javax.swing.JTextField jAddressLetters;
    private javax.swing.JTextField jAddressNumbers;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCity;
    private javax.swing.JLabel jCityError;
    private javax.swing.JTextField jEmailAddress;
    private javax.swing.JLabel jEmailError;
    private javax.swing.JTextField jFirstName;
    private javax.swing.JLabel jFirstNameError;
    private javax.swing.JLabel jInvalidInput;
    private javax.swing.JCheckBox jKnownPlayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLastName;
    private javax.swing.JLabel jLastNameError;
    private javax.swing.JLabel jPhoneError;
    private javax.swing.JTextField jPhoneNumber;
    private javax.swing.JLabel jZipCodeError;
    private javax.swing.JTextField jZipCodeLetters;
    private javax.swing.JTextField jZipCodeNumbers;
    // End of variables declaration//GEN-END:variables

    private void setValues() {
        surname = this.jFirstName.getText();
        lastName = this.jLastName.getText();
        address = this.jAddressLetters.getText() + " " + this.jAddressNumbers.getText();
        zipCode = this.jZipCodeNumbers.getText() + " " + this.jZipCodeLetters.getText();
        city = this.jCity.getText();
        phoneNumber = Integer.parseInt(this.jPhoneNumber.getText());
        emailAddress = this.jEmailAddress.getText();
    }

    private void initArrays() { 
        textFields = new JTextField[]{jFirstName, jLastName, jAddressNumbers, jAddressLetters, jZipCodeNumbers, jZipCodeLetters, jCity, jPhoneNumber, jEmailAddress};
        stringFields = new String[9];
        errorLabels = new JLabel[]{jFirstNameError, jLastNameError, jAddressError, jZipCodeError, jCityError, jPhoneError, jEmailError};
        textBools = new boolean[9];
    }

    private void hideLabels() {
        this.jInvalidInput.setVisible(false);
        for (JLabel label : errorLabels){
            label.setVisible(false);
        }
    }
}
