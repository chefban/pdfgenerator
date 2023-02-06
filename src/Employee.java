public class Employee {
    private String firstname;
    private String lastname;
    private String title;
    private String photo;
    private String service;
    private String company;

    public Employee(String firstname, String lastname, String title, String photo, String service, String company) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.title = title;
        this.photo = photo;
        this.service = service;
        this.company = company;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
