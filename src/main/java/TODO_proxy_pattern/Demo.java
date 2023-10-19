package TODO_proxy_pattern;


import lombok.Data;

@Data
class User {
    String name;
}

public class Demo {
    public static void main(String[] args) {
        User ram = new User();
        ram.setName("ram");

    }
}
