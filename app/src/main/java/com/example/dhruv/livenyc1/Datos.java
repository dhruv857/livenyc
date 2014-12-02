package com.example.dhruv.livenyc1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

// Referenced classes of package drowning.zebra:
//            Selected

public class Datos
{

    private int indice;
    private double lat;
    private double lon;
    private String titulo;
    private String url;

    public Datos(String s, String s1, double d, double d1)
    {
        titulo = s;
        url = s1;
        lat = d * 1000000D;
        lon = d1 * 1000000D;
    }

    private String timestamp(boolean flag)
    {
        Date date = new Date();
        int i = 1 + date.getMonth();
        int j = date.getDate();
        int k = 1900 + date.getYear();
        String s = String.valueOf(i);
        String s1 = String.valueOf(j);
        String s2 = String.valueOf(k);
        if (i < 10)
        {
            s = (new StringBuilder("0")).append(s).toString();
        }
        if (j < 10)
        {
            s1 = (new StringBuilder("0")).append(s1).toString();
        }
        if (flag)
        {
            return (new StringBuilder(String.valueOf(s2))).append(s).append(s1).append(String.valueOf(date.getSeconds())).toString();
        } else
        {
            return (new StringBuilder(String.valueOf(s2))).append(s).append(s1).toString();
        }
    }

    public Bitmap getImage(Context context)
    {
        Bitmap bitmap;
        try
        {
            HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(getUrl())).openConnection();
            httpurlconnection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; GTB6)");
            httpurlconnection.setReadTimeout(7000);
            httpurlconnection.connect();
            bitmap = BitmapFactory.decodeStream(httpurlconnection.getInputStream());
        }
        catch (Exception exception)
        {
            System.out.println((new StringBuilder("Problem getImage -->")).append(exception.toString()).toString());
            return null;
        }
        return bitmap;
    }

    public int getIndice()
    {
        return indice;
    }

    public double getLat()
    {
        return lat;
    }

    public double getLon()
    {
        return lon;
    }

    public String getPlainUrl()
    {
        return url;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getUrl()
    {
        String s = timestamp(true);
        //Selected.getInstance();
        return (new StringBuilder(String.valueOf(url))).append("?time=").append(s).toString();
    }

    public void setIndice(int i)
    {
        indice = i;
    }

    public void setLat(double d)
    {
        lat = d;
    }

    public void setLon(double d)
    {
        lon = d;
    }

    public void setTitulo(String s)
    {
        titulo = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
