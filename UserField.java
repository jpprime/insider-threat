public class UserField extends Node {

    String employee_name;
    String user_id;
    String domain;
    String email;
    String role;

    public UserField(String employee_name, String user_id,
            String domain, String email, String role)
    {
        this.employee_name = employee_name;
        this.user_id = user_id;
        this.domain = domain;
        this.email = email;
        this.role = role;
    }

    public UserField(String user_id)
    {
        this.user_id = user_id;
    }
}
