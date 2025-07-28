package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religion, category, occupation, education, income;
    JLabel panNumber, aadhaarNumbar, additionalDetails, religionType, categoryType, earning, educational, qualification, marital, seniorCitizen;
    String formno;

    SignupTwo(String formno){

        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FROM - PAGE 2");

        additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);

        religionType = new JLabel("Religion: ");
        religionType.setFont(new Font("Raleway", Font.BOLD, 20));
        religionType.setBounds(100,140,100,30);
        add(religionType);

        String valReligion[] = {"","Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        categoryType = new JLabel("Category: ");
        categoryType.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryType.setBounds(100,190,200,30);
        add(categoryType);

        String valCategory[] = {"","General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400,30);
        category.setBackground(Color.WHITE);
        add(category);

        earning = new JLabel("Income: ");
        earning.setFont(new Font("Raleway", Font.BOLD, 20));
        earning.setBounds(100,240,200,30);
        add(earning);

        String incomecategory[] = {"","Null", "< 150000", "< 250000", "500000", "Upto 1000000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400,30);
        income.setBackground(Color.WHITE);
        add(income);

        educational = new JLabel("Educational ");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100,290,200,30);
        add(educational);

        qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);

        String educationValues[] = {"","Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400,30);
        education.setBackground(Color.WHITE);
        add(education);


        marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String occupationalValues[] = {"","Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationalValues);
        occupation.setBounds(300, 390, 400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        panNumber = new JLabel("Pan Number: ");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        panNumber.setBounds(100,440,200,30);
        add(panNumber);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400,30);
        add(pan);

        aadhaarNumbar = new JLabel("Aadhar Number: ");
        aadhaarNumbar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhaarNumbar.setBounds(100,490,200,30);
        add(aadhaarNumbar);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400,30);
        add(aadhar);

        seniorCitizen = new JLabel("Senior Citizen: ");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100,540,200,30);
        add(seniorCitizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30 );
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);

        JLabel existingAccount = new JLabel("Existing Account: ");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100,590,200,30);
        add(existingAccount);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30 );
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingAccGroup = new ButtonGroup();
        existingAccGroup.add(eyes);
        existingAccGroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 650, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(270,0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String span = pan.getText();
        String saadhar = aadhar.getText();

        if (pan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pan Number required");
            return; // Exit the method if PAN is empty
        }
        else if (aadhar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aadhaar Number required");
            return; // Exit the method if Aadhaar is empty
        }
        else if (sreligion.equals("")) {
            JOptionPane.showMessageDialog(null,"Select Religion");
            return;
        }
        else if (scategory.equals("")) {
            JOptionPane.showMessageDialog(null,"Select Category");
            return;
        }
        else if (sincome.equals("")) {
            JOptionPane.showMessageDialog(null,"Select Income");
            return;
        }
        else if (seducation.equals("")) {
            JOptionPane.showMessageDialog(null,"Select Educational Qualification");
            return;
        }
        else if (soccupation.equals("")) {
            JOptionPane.showMessageDialog(null,"Select Occupation");
            return;
        }

        if ((syes.isSelected() || sno.isSelected()) && (eyes.isSelected() || eno.isSelected())) {
            String seniorcitizen = syes.isSelected() ? "Yes" : "No";
            String existingaccount = eyes.isSelected() ? "Yes" : "No";


            try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "', '" + sreligion + "', '" + scategory + "', '" + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + saadhar + "', '" + seniorcitizen + "', '" + existingaccount + "')";
                c.s.executeUpdate(query);

                // Signup3 Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            if (!(syes.isSelected() || sno.isSelected())) {
                JOptionPane.showMessageDialog(null, "Choose Senior Citizen Field");
            } else {
                JOptionPane.showMessageDialog(null, "Choose Existing Account Field");
            }
        }
    }

    public static void main(String args[]){
        new SignupTwo("");

    }
}

