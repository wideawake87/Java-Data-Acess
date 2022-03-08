import jakarta.persistence.*;

@Entity
@Table(name ="employees" )
public class Employers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "last_name")
    String last_name;
    @Column(name = "dob")
    int dob;
    @Column(name = "address")
    String address;
    @Column(name = "email")
    String email;
    @Column(name = "phone_number")
    int phone_number;
    @Column(name = "salary")
    int salary;

    public Employers(int id, String name, String last_name, int dob, String address, String email, int phone_number, int salary){
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public Employers(){}

    public Employers(String name, String last_name, int dob, String address, String email, int phone_number, int salary) {
        this.name = name;
        this.last_name = last_name;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public Employers(int id) {
        this.id = id;
    }

    public Employers(int id, String address, String email, int phone_number, int salary) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public Employers(String address, int dob, String email, String last_name, String name, int phone_number, int salary) {
        this.address = address;
        this.dob = dob;
        this.email = email;
        this.last_name = last_name;
        this.name = name;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public Employers(String address, String email, int phone_number) {
        this.address = address;
        this.email = email;
        this.phone_number = phone_number;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return getId() + "\t" + getName() + "\t" + getLast_name() + "\t" + getDob() + "\t" + getAddress()+ "\t" +
                getEmail() + "\t" + getPhone_number()  + "\t" +  getSalary() + "\n" ;
    }
}
