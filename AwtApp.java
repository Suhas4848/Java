import java.awt.*;
public class AwtApp extends Frame {
    AwtApp() {
        Label firstName = new Label("First Name");
        firstName.setBounds(30, 50, 80, 20);

        Label lastName = new Label("Last Name");
        lastName.setBounds(30, 80, 80, 20);

        Label dob = new Label("Date of Birth");
        dob.setBounds(30, 110, 80, 20);

        // Label Phone_no =new Label("Phone_no");
        // Phone_no.setBounds(30, 150, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);

        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);

        // TextField Phone_noTF = new TextField();
        // Phone_no.setBounds(120, 150, 100, 20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 180, 100, 30);

        Button reset = new Button("Reset");
        reset.setBounds(120, 200, 100, 30);

        add(firstName);
        add(lastName);
        add(dob);
        // add(Phone_no);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        // add(Phone_noTF);
        add(sbmt);
        add(reset);

        setSize(500, 800);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AwtApp awt = new AwtApp();
    }
}