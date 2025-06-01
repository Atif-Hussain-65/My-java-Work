abstract class Company {
    //only abstract class allow abstract methods
    public void companyName() {
        System.out.println("\tDocker");
    }
    public abstract void goodType();
    public abstract void materialUsed();
    public void companyBranch(){
        System.out.println("No of Company Branches 30");}
    public void companySalePerYear(){
        System.out.println("Company Sales Per Year =1000000");}
    public void companyStatus(){
        System.out.println("Status:Active");}
    public abstract void goodsPrice();
    public abstract void sellerInfo();

}
