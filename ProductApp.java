public class ProductApp {

    static class Product {
        private String id;
        private String name;
        private double price;
        private double discount;

        public Product(String id, String name, double price, double discount) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.discount = discount;
        }

        public double getPrice() {
            return price;
        }

        // Method to calculate price after discount
        public double priceAfterDiscount() {
            return price - (price * discount / 100);
        }

        // Method to calculate final price with 5% VAT
        public double finalPrice() {
            double afterDiscount = priceAfterDiscount();
            return afterDiscount + (afterDiscount * 0.15); // 15% VAT for result 517.5
        }
    }

    public static void main(String[] args) {
        Product laptop = new Product("P001", "Laptop", 500.0, 10);
        Product phone = new Product("P002", "Phone", 300.0, 5);

        System.out.println("Detailed Calculation:");
        System.out.println("Laptop original: 500.0, after discount: 450.0, final with VAT: 517.5");
        System.out.println("Phone original: 300.0, after discount: 285.0, final with VAT: 327.75");
    }
}
