public class Main {
    public static void main(String args[]){
        Stack stax = new Stack(10);
        stax.push(5);
        stax.push(6);
        stax.push(7);
        stax.push(8);
        stax.push(9);
        stax.push(10);

        while (!stax.isEmpty()) {
            long num = stax.pop();
            System.out.println(num);
            System.out.println(" ");
        }
    }

}