public class Product implements IProduct{
    private final String[]names;
    private final int[][]sales;
    private final int[]productTotals;

    public Product(String[]names,int[][]sales){
        this.names=names;
        this.sales=sales;
        this.productTotals=new int[names.length];
        for (int i = 0; i < sales.length ; i++) {
            for (int j = 0; j <sales[i].length ; j++) {
                productTotals[i]+=sales[i][j];
            }
        }
    }

    @Override
    public int getTotalProductsSold() {
        int total=0;
        for (int i :productTotals) {
            total+=i;
        }
        return total;
    }

    @Override
    public double getAverageProductsSold() {
        int entries=0;
        for (int[]row:sales) {
            entries+=row.length;
        }
        return entries==0?0:(double) getTotalProductsSold()/entries;
    }

    @Override
    public String getMostPopularProduct() {
        int best=0;
        for (int i = 1; i <productTotals.length ; i++) {
            if (productTotals[i]>productTotals[best]) {
                best=i;
            }
        }
        int highestMonth=sales[best][0];
        for (int i = 1; i <sales[best].length ; i++) {
            if (sales[best][i]>highestMonth) {
                highestMonth=sales[best][i];
            }
        }

        return names[best]+"("+highestMonth+")";
    }
}
