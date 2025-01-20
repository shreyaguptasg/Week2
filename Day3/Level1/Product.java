package Level1;


class Product {
        static double discount = 0.05;
        final int productID;
        String productName;
        int price;
        int quantity;

        Product(String var1, int var2, int var3, int var4) {
            this.productName = var1;
            this.productID = var2;
            this.price = var3;
            this.quantity = var4;
        }

        static void updateDiscount() {
            System.out.println("discount :" + discount);
            discount = 0.09;
            System.out.println("updated discount :" + discount);
        }

        public static void main(String[] var0) {
            Product var1 = new Product("t-shirt", 1223, 400, 2);
            updateDiscount();
            if (var1 instanceof Product) {
                System.out.println("product1 is an instance of Product");
            } else {
                System.out.println("product1 is not an instance of Product");
            }

        }
    }

