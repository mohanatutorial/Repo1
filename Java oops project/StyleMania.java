interface prices {
    int Entry_fee = 100;
    int Hair_style = 3600;
    int Nail_care = 1950;
    int makeup = 2500;
    int Party_dress = 50000;
    int Traditonal_dress = 100000;
}
class StyleMania extends SalonService implements prices {
    String customer_name;
    int totalAmount = 0;

    public void customer(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getcustomer() {
        return this.customer_name;
    }

    public void addServiceCost(int cost) {
        totalAmount += cost;
    }

    public void printTotal() {
        System.out.println("The total cost spent by " + customer_name + " is " + totalAmount);
    }
	public static void main(String[] args) {
    System.out.println("Welcome to the Happy Stylist Parlour Mall");
    StyleMania customer1 = new StyleMania("Carolyn");
    customer1.addService("Entry Fee", Entry_fee);
    customer1.addService("Party Dress", Party_dress);
    customer1.addService("Manicure", Nail_care);
    customer1.printReceipt();

    StyleMania customer2 = new StyleMania("Jessi");
    customer2.addService("Entry Fee", Entry_fee);
    customer2.addService("Makeup", makeup);
    customer2.addService("Hair Style", Hair_style);
    customer2.printReceipt();
	}

    public StyleMania(String name) {
        super(name);
    }

    void addService(String serviceName, int cost) {
        System.out.println(customerName + " added service: " + serviceName + " (" + cost + ")");
        totalCost += cost;
    }

}
class shops {
    public static void Fashion_designing_dresses(StyleMania obj) {
        System.out.println(obj.customer_name + " wants designer dresses. Range: 500–50,00,000");
        obj.addServiceCost(obj.Party_dress);
    }

    public static void Traditional_wear(StyleMania obj) {
        System.out.println(obj.customer_name + " chooses traditional wear for " + obj.Traditonal_dress);
        obj.addServiceCost(obj.Traditonal_dress);
    }

    public static void Hair_saloon(StyleMania obj) {
        System.out.println(obj.customer_name + " wants a hairstyle. It costs " + obj.Hair_style);
        obj.addServiceCost(obj.Hair_style);
    }

    public static void Manicure_and_pedicure_saloon(StyleMania obj) {
        System.out.println(obj.customer_name + " wants nail care. It costs " + obj.Nail_care);
        obj.addServiceCost(obj.Nail_care);
    }

    public static void Makeup_Arts(StyleMania obj) {
        System.out.println(obj.customer_name + " wants makeup. It costs " + obj.makeup);
        obj.addServiceCost(obj.makeup);
    }
}
abstract class SalonService {
    String customerName;
    int totalCost = 0;

    public SalonService(String name) {
        this.customerName = name;
    }
    abstract void addService(String serviceName, int cost);
	public void printReceipt() {
		System.out.println("Customer: " + customerName);
		System.out.println();
        System.out.println("Total Cost: " + totalCost);
		System.out.println();
    }
}

/*Welcome to the Happy Stylist Parlour Mall
Carolyn added service: Entry Fee (100)
Carolyn added service: Party Dress (50000)
Carolyn added service: Manicure (1950)
Customer: Carolyn

Total Cost: 52050

Jessi added service: Entry Fee (100)
Jessi added service: Makeup (2500)
Jessi added service: Hair Style (3600)
Customer: Jessi

Total Cost: 6200*/
