class Product{
    String pname;
    int pcode,pr;


    Product(int code,String name,int price){
        pcode=code;
        pname=name;
        pr=price;

    }
    void display(){
        System.out.println("Product code:"+pcode);
        System.out.println("Product Name:"+pname);
        System.out.println("Product Price:"+pr);
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Product p1=new Product(1001,"Smartphone",4500);
        Product p2=new Product(1002,"Laptop",55500);
        Product p3=new Product(1003,"Tablet",4000);
        System.out.println("Product Details");
        p1.display();
        p2.display();
        p3.display();
        Product lowest;
        if(p1.pr<p2.pr&&p1.pr<p3.pr)
        lowest=p1;
        else if(p2.pr<p3.pr)
        lowest=p2;
        else 
        lowest=p3;
        System.out.println("Product with the lowest price:");
        lowest.display();
    }   
}