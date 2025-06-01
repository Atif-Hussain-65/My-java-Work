public class Branch17 extends Company{
    @Override
    public void companyBranch() {
        super.companyBranch();
        System.out.println("Branch #17");
    }
    public void goodType(){
        System.out.println("Product=White Shirt");
    }
    @Override
    public void materialUsed() {
        System.out.println("Type=Cotton");
    }
    @Override
    public void goodsPrice() {
        System.out.println("Price=Rs.100");
    }
    @Override
    public void sellerInfo() {
        System.out.println("Seller=Pathan");
    }

}
