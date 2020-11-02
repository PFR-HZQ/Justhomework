public class guest implements giveorder{
    @Override
    public void Giveorder( getorder shop ) {
        System.out.println("顾客发出电脑订单" );
        shop.Getorder();//接受订单
    }
}
