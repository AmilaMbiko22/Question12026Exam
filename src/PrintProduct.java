public class PrintProduct {
    private final IProduct product;
    public PrintProduct(IProduct product){
        this.product=product;
    }

    public void PrintTotalProductSales(){
        System.out.println("TOTAL PRODUCT SALES: "+product.getTotalProductsSold());
    }
    public void PrintAverageProductSales(){
        System.out.println("AVERAGE PRODUCT SALES: "+product.getAverageProductsSold());
    }
    public void PrintMostPopularProductSales(){
        System.out.println("MOST POPULAR PRODUCT: "+product.getMostPopularProduct());
    }
    public void PrintReport(int year){
        System.out.println();
        System.out.println("PRODUCT SALES REPORT-"+year);
        System.out.println("*".repeat(60));
        PrintTotalProductSales();
        PrintAverageProductSales();
        PrintMostPopularProductSales();
    }


}
