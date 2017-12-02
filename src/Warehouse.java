public class Warehouse {
     public static void main(String[] args) {

                Device device1 = new Device("QE65Q7FAM", "Samsung", "TV", 9499.99);
                Device device2 = new Device("P9 Lite", "Huawei", "Smatyphone", 0);
                Device device3 = new Device("Playstation 4", "Sony", "Smatyphone", 1899.99);

                device2.price = 0;

                String allDevices = device1.getInfo() + "\n" + device2.getInfo() + "\n" + device3.getInfo();
                System.out.println(allDevices);
            }
}
