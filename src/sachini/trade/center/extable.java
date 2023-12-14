/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sachini.trade.center;

/**
 *
 * @author Sandakelum
 */
class extable {
    private String vmodel,part_no,part_name,side,status;
    private int qu,item_price;
    
    public extable(String vmodel,String part_no,String part_name,int qu,int item_price,String side,String status){
        
        this.vmodel=vmodel;
        this.part_no=part_no;
        this.part_name=part_name;
        this.qu=qu;
        this.item_price=item_price;
        this.side=side;
        this.status=status;
    }
    
    public String getvmodel(){
        return vmodel;
    }
    public String getpart_no(){
        return part_no;
    }
    public String getpart_name(){
        return part_name;
    }
    public int getqu(){
        return qu;
    }
    public int getitem_price(){
        return item_price;
    }
    public String getside(){
        return side;
    }
    public String getstats(){
        return status;
    }
    
    
}
