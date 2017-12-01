public class Device {

        String code;
        String producer;
        String type;
        double price;

            Device(String c, String pr, String t, double p){
            code = c;
            producer = pr;
            type = t;
            price = p;
            }

            Device() {
            }

        void getInfo () {
        System.out.println("Kod: " + code + ", producent: " + producer + ", typ: " + type + ", cena: " + price);
        }

}
