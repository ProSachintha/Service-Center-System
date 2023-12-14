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
class sertab {
    private String v_no,date,owner_name;
    private int km,eo,go,Do,of,af,ff,uc,bw;
    
    public sertab(String v_no,String date,String owner_name,int km,int eo,int go,int Do,int of,int af,int ff,int uc,int bw){
        
        this.v_no=v_no;
        this.date=date;
        this.owner_name=owner_name;
        this.km=km;
        this.eo=eo;
        this.go=go;
        this.Do=Do;
        this.of=of;
        this.af=af;
        this.ff=ff;
        this.uc=uc;
        this.bw=bw;
    }
    
    public String getv_no(){
        return v_no;
    }
    public String getdate(){
        return date;
    }
    public String getowner_name(){
        return owner_name;
    }
    public int getkm(){
        return km;
    }
    public int geteo(){
        return eo;
    }
    public int getgo(){
        return go;
    }
    public int getDo(){
        return Do;
    }
    public int getof(){
        return of;
    }
    public int getaf(){
        return af;
    }
    public int getff(){
        return ff;
    }
    public int getuc(){
        return uc;
    }
    public int getbw(){
        return bw;
    }
    
}
