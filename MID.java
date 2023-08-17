// 65022498 MID Exam
public class MID {
    public static void main(String[] args) {
        Product myProduct = new Product("Chair", 500.0);
        myProduct.Inform(true);

        Electronics tv = new Electronics("Television", 2e4, "Samsung", "Neo QLED");
        tv.Inform();

        Smartphone iphone = new Smartphone("Iphone", 4e4, "Apple", "Iphone 99", "IOS");
        iphone.Inform();

        Book myBook = new Book("OOP Programming", 250.0d, "john Doe", 300);
        myBook.Inform();

    }
}

class Product {
    private String name;
    private double price;

    public Product(String arg_name, double arg_price) {
        this.name = arg_name; this.price = arg_price;
    }

    public String GetName() {
        return this.name;
    }

    public void SetName(String newName) {
        this.name = newName;
    }

    public double GetPrice() {
        return this.price;
    }

    public void SetPrice(double newPrice) {
        this.price = newPrice;
    }

    public void Inform(boolean haveDivide) {

        System.out.println("Product Name: " + GetName());
        System.out.println("Product Price: " + GetPrice());

        if(haveDivide)
            System.out.println(MakeDivide());
    }

    public String MakeDivide() {
        String division = "";
        for(int i = 0; i < 27; i++) {
            division += '*';
        }
        return division;
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String arg_name, double arg_price, String arg_brand, String arg_model) {
        super(arg_name, arg_price);
        this.brand = arg_brand; this.model = arg_model;
    }
    public String GetBrand() {
        return this.brand;
    } 
    public String GetModel() {
        return this.model;
    } 

    public void SetBrand(String newBrand) {
        this.brand = newBrand;
    }
    public void SetModel(String newModel) {
        this.brand = newModel;
    }

    public void Inform() {
        super.Inform(false);
        System.out.println("Brand: " + GetBrand());
        System.out.println("Model: " + GetModel());
        System.out.println(super.MakeDivide());
    }

}

class Smartphone extends Electronics {
    private String OperatingSystem;

    public Smartphone(String arg_name, double arg_price, String arg_brand, String arg_model, String arg_OS) {
        super(arg_name, arg_price, arg_brand, arg_model);
        this.OperatingSystem = arg_OS;
    }

    public String GetOperatingSystem() {
        return this.OperatingSystem;
    }

    public void SetOperatingSystem(String newSetOS) {
        this.OperatingSystem = newSetOS;
    }

    public void Inform() {
        super.Inform(false);
        System.out.println("Brand: " + super.GetBrand());
         System.out.println("Model: " + super.GetModel());
        System.out.println("Operating System: " + GetOperatingSystem());
        System.out.println(super.MakeDivide());
    }
}

class Book extends Product {
    private String author;
    private int pages; 

    public Book(String arg_name, double arg_price, String arg_author, int arg_pages) {
        super(arg_name, arg_price);
        this.author = arg_author;
        this.pages = arg_pages;
    }

    public String GetAuthor() {
        return this.author;
    }

    public int GetPages() {
        return this.pages;
    }


    public void SetAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void SetValue(int newPages) {
        this.pages = newPages;
    }

    public void Inform() {
        super.Inform(false);
        System.out.println("Author: " + GetAuthor());
        System.out.println("Number of Pages: " + GetPages());
        System.out.println(super.MakeDivide());
    }
}


