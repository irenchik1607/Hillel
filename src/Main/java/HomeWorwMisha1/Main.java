package java.HomeWorwMisha1;

public class Main {
    public static void main(String[] args) {

        // клас Product
        Product allInfoAboutProduct = new Product("blouse", "123ER43", 2310, "women's jacket", true);
        System.out.println("Вся інформація щодо товару: назва: " + allInfoAboutProduct.getNameOfGood() + ", код товару: " + allInfoAboutProduct.getCodeOfGood() + ", ціна товару: " + allInfoAboutProduct.getPriceOfGood() + ", короткий опис товару - " + allInfoAboutProduct.getDescriptionOfGood() + ", наявність: " + allInfoAboutProduct.isAvailabilityOfGood());

        Product shortInfoAboutProduct = new Product("trousers", 1500, true);
        System.out.println("Коротка інформація щодо товару: назва: " + shortInfoAboutProduct.getNameOfGood() + ", ціна товару: " + shortInfoAboutProduct.getPriceOfGood() + ", наявність: " + shortInfoAboutProduct.isAvailabilityOfGood());
        System.out.println();

        // клас Employee
        Employee employee1 = new Employee("Шевченко", "Тарас", "Маркетолог нижньої ланки", 120);
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " на позиції \"" + employee1.getPosition() + "\" має щоденну оплату в розмірі " + employee1.infoSalaryPerDay() + "грн");

        Employee employee2 = new Employee("Чиркова", "Ірина", "Тестувальник");
        System.out.println(employee2.shortIfoAboutEmployee());

        employee2.setPosition("QA automation");
        System.out.println(employee2.shortIfoAboutEmployee());
        System.out.println();

        // клас Triangle: периметр та площа
        Triangle triangle = new Triangle(10, 20, 20.5);
        System.out.println("Периметр трикутника складає: " + triangle.perimeterOfTriangle());
        System.out.println("Площа трикутника складає: " + triangle.areaOfTriangle());
        System.out.println();

        // клас Credit: розрахунок щомісячного платежу по кредиту
        Credit credit = new Credit(100000,35,10);
        System.out.println("Щомісяця необхідно будес плачувати " +String.format("%.1f", credit.annuityPayment()));
        credit.setSumOfCredit(150000);
        credit.setAnnualRate(50);
        System.out.println("Щомісяця необхідно будес плачувати " +String.format("%.1f", credit.annuityPayment()));
    }


}
