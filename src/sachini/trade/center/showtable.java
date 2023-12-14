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
class showtable {
    private String model,spec,color,chessy,engin,status;
    private int year;
    
    public showtable(String model,String spec,String color,String chessy,String engin,int year,String status){
        
        this.model=model;
        this.spec=spec;
        this.color=color;
        this.chessy=chessy;
        this.engin=engin;
        this.year=year;
        this.status=status;
    }
    
    public String getmodel(){
        return model;
    }
    public String getspec(){
        return spec;
    }
    public String getcolor(){
        return color;
    }
    public String getchessy(){
        return chessy;
    }
    public String getengin(){
        return engin;
    }
    public int getyear(){
        return year;
    }
    public String getstats(){
        return status;
    }
    
}
