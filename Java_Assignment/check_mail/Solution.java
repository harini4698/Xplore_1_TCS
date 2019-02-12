public class Solution {

    public static void main(String[] args) {

        Customer e1 = new Customer(1, "c1", "abc@gmail.com");
        Customer e2 = new Customer(2, "c2", "xyz@gmail.com");

        int res = checkEmail(e1, e2, "gmail");
        if (res == 1)
            System.out.println("True");
        else
            System.out.println("False");

    }

    public static int checkEmail(Customer e1, Customer e2, String mail) {
        if (e1.email.toLowerCase().contains(mail.toLowerCase())
                && e2.email.toLowerCase().contains(mail.toLowerCase())) {
            return 1;
        } else {
            return 0;
        }

    }
}