import jakarta.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.swing.*;
import java.util.ArrayList;
@Entity
public class Employee extends JFrame {
    Session session = HibernateUtil.createSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();

    private JTextField txtName;
    private JTextField txtLastName;
    private JTextField txtDob;
    private JTextField txtAddress;
    private JTextField txtPhone;
    private JTextField txtEmail;
    private JTextField txtSalary;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JTextField txtId;
    private JLabel CompanyDbmSystem;
    private JPanel MainFrame;
    private JButton showBtn;
    private JTextArea txtArea;
    private JPanel Employee;
    int number;

    public Employee() {
        setContentPane(MainFrame);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(1100, 600);
        addComponent();
        delete();
        showAll();
        change();
       search();
    }

    public void addComponent() {
        addButton.addActionListener(e -> {

            Employers emp = new Employers(txtAddress.getText(), Integer.parseInt(txtDob.getText()), txtEmail.getText(), txtLastName.getText(), txtName.getText(), Integer.parseInt(txtPhone.getText()), Integer.parseInt(txtSalary.getText(), Integer.parseInt(txtId.getText())));
            Db.insertEmployee(session, transaction, emp);
            JOptionPane.showMessageDialog(MainFrame, "Insert Successful");
        });
    }

    public void delete() {
        deleteButton.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());
            Db.deleteEmployee(session, transaction, id);
            JOptionPane.showMessageDialog(MainFrame, "Delete Successful");
        });
    }

    public void showAll() {
        showBtn.addActionListener(e -> {
            try {
                ArrayList<Employers> emp = new Db().showTables(session, transaction);
                txtArea.setText(String.valueOf(emp));

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    public void change() {
        updateButton.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());
            Employers emp = new Employers(txtAddress.getText(), txtEmail.getText(), Integer.parseInt(txtPhone.getText(), Integer.parseInt(txtSalary.getText())));
            Db.changeEmp(session, transaction, id, emp);
            JOptionPane.showMessageDialog(MainFrame, "Update Successful");
        });
    }
        public void search(){
        searchButton.addActionListener(e -> {
           Employers emp = new Db().getEmployee(session,transaction,Integer.parseInt(txtId.getText()));
           txtArea.setText(String.valueOf(emp));
        });
        }

}







