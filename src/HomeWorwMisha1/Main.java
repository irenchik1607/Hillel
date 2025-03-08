package HomeWorwMisha1;

public class Main {
    public static void main(String[] args) {
        Product allInfoAboutProduct = new Product("blouse", "123ER43", 2310, "women's jacket", true);
        System.out.println("Вся інформація щодо товару: назва: " + allInfoAboutProduct.nameOfGood + ", код товару: " + allInfoAboutProduct.codeOfGood + ", ціна товару: " + allInfoAboutProduct.priceOfGood + ", короткий опис товару - " + allInfoAboutProduct.descriptionOfGood + ", наявність: " + allInfoAboutProduct.isAvailabilityOfGood());
    }

    Product shortInfoAboutProduct = new Product("trousers",  1500, true);
        System.out.println("Коротка інформація щодо товару: назва: "+shortInfoAboutProduct.+", ціна товару: "+shortInfoAboutProduct.priceOfGood+", наявність: "+shortInfoAboutProduct.isAvailabilityOfGood());
}
}
