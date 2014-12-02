package com.example.dhruv.livenyc1;

class Datos
{
    private String Cname;
    private String loc;
    private double lat;
    private double longi;

    public Datos(String s, String s1, double v, double v1) {

        Cname = s;
        loc = s1;
        lat = v * 100000D;
        longi = v1 * 1000000D;



    }

    public String getCname()
    {
        return Cname;
    }

    public String getloc()
    {
        return loc;
    }

    public void setCname(String s){ this.Cname = s;}

    public void setloc(String s1){this.loc = s1;}
}