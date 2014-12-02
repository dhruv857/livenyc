package com.example.dhruv.livenyc1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.widget.Toast;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import java.util.ArrayList;
import java.util.ListIterator;


public class CameraList extends Activity {

    ListView listView;
    public int itemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_list);

        listView = (ListView) findViewById(R.id.list);



        Datos dat[];
       dat = new Datos[194];
        dat[0] = new Datos("1 AVENUE AT 124 STREET", "http://207.251.86.250/images/cams/govt_property/cctv254.jpg", 40.801010890000001D, -73.931835289999995D);
        dat[1] = new Datos("1 AVENUE AT 23 STREET", "http://207.251.86.250/images/cams/govt_property/cctv253.jpg", 40.736890000000002D, -73.978538999999998D);
        dat[2] = new Datos("1 AVENUE AT 79 STREET", "http://207.251.86.250/images/cams/govt_property/cctv252.jpg", 40.772342000000002D, -73.952681999999996D);
        dat[3] = new Datos("1 AVENUE AT 80 STREET", "http://207.251.86.250/images/cams/govt_property/cctv196.jpg", 40.773012000000001D, -73.952179999999998D);
        dat[4] = new Datos("11 AVENUE AT 34 STREET", "http://207.251.86.248/cctv200.jpg", 40.755792999999997D, -74.002018000000007D);
        dat[5] = new Datos("11 AVENUE AT 42 STREET", "http://207.251.86.248/cctv31.jpg", 40.760829999999999D, -73.998317D);
        dat[6] = new Datos("2 AVENUE AT 110 STREET", "http://207.251.86.250/images/cams/govt_property/cctv251.jpg", 40.793199999999999D, -73.940556000000001D);
        dat[7] = new Datos("2 AVENUE AT 125 STREET", "http://207.251.86.248/cctv102.jpg", 40.802754D, -73.933570000000003D);
        dat[8] = new Datos("2 AVENUE AT 36 STREET-MIDTOWN TUNNEL", "", 40.746037999999999D, -73.974917000000005D);
        dat[9] = new Datos("2 AVENUE AT QBB", "http://207.251.86.248/cctv3.jpg", 40.760916000000002D, -73.964055999999999D);
        dat[10] = new Datos("9 AVENUE AT 207 STREET", "", 40.863584000000003D, -73.916922999999997D);
        dat[11] = new Datos("5 AVENUE AT 23 STREET", "http://207.251.86.248/cctv7.jpg", 40.741517999999999D, -73.989562000000006D);
        dat[12] = new Datos("5 AVENUE AT 42 STREET", "http://207.251.86.248/cctv6.jpg", 40.753475000000002D, -73.980829D);
        dat[13] = new Datos("5 AVENUE AT 49 STREET", "http://207.251.86.248/cctv8.jpg", 40.757896000000002D, -73.977673999999993D);
        dat[14] = new Datos("6 AVENUE AT 34 STREET", "http://207.251.86.248/cctv9.jpg", 40.749744D, -73.987813000000003D);
        dat[15] = new Datos("6 AVENUE AT 42 STREET", "http://207.251.86.248/cctv12.jpg", 40.754815999999998D, -73.984121999999999D);
        dat[16] = new Datos("6 AVENUE AT 49 STREET", "http://207.251.86.248/cctv10.jpg", 40.759261000000002D, -73.980870999999993D);
        dat[17] = new Datos("7 AVENUE AT 125 STREET", "http://207.251.86.248/cctv66.jpg", 40.808971999999997D, -73.948327000000006D);
        dat[18] = new Datos("7 AVENUE AT 145 STREET", "http://207.251.86.248/cctv68.jpg", 40.821635000000001D, -73.939075000000003D);
        dat[19] = new Datos("8 AVENUE AT 110 STREET", "http://207.251.86.248/cctv70.jpg", 40.800553000000001D, -73.958194000000006D);
        dat[20] = new Datos("8 AVENUE AT 34 STREET", "http://207.251.86.248/cctv19.jpg", 40.752215D, -73.993499D);
        dat[21] = new Datos("8 AVENUE AT 42 STREET", "http://207.251.86.248/cctv20.jpg", 40.757196999999998D, -73.989755000000002D);
        dat[22] = new Datos("8 AVENUE AT COLUMBUS CIRCLE", "http://207.251.86.248/cctv18.jpg", 40.766969000000003D, -73.982264999999998D);
        dat[23] = new Datos("9 AVENUE AT 30th STREET", "http://207.251.86.250/images/cams/govt_property/cctv250.jpg", 40.750877299999999D, -73.998126499999998D);
        dat[24] = new Datos("9 AVENUE AT 34 STREET", "http://207.251.86.248/cctv17.jpg", 40.753360999999998D, -73.996300000000005D);
        dat[25] = new Datos("ADAMS AT TILLARY", "http://207.251.86.250/images/cams/govt_property/cctv89.jpg", 40.696337999999997D, -73.988882000000004D);
        dat[26] = new Datos("AMSTERDAM AVENUE AT 178 STREET", "http://207.251.86.248/cctv29.jpg", 40.846159D, -73.932344999999998D);
        dat[27] = new Datos("BAXTER AT CANAL STREET", "http://207.251.86.248/cctv11.jpg", 40.717500999999999D, -73.999270999999993D);
        dat[28] = new Datos("BELT AT 130 STREET", "", 40.666600000000003D, -73.810400000000001D);
        dat[29] = new Datos("BELT AT 225 STREET", "http://207.251.86.250/images/cams/govt_property/cctv117.jpg", 40.665838000000001D, -73.752122D);
        dat[30] = new Datos("BELT AT BROOKVILLE", "", 40.6656981D, -73.74469757D);
        dat[31] = new Datos("BELT AT KNAPP", "http://207.251.86.250/images/cams/govt_property/cctv125.jpg", 40.585799999999999D, -73.931100000000001D);
        dat[32] = new Datos("BELT PARKWAY AT PAERDEGAT BASIN BRIDGE", "http://207.251.86.250/images/cams/govt_property/cctv167.jp", 40.604500000000002D, -73.898700000000005D);
        dat[33] = new Datos("BELT PARKWAY AT 68 STREET", "http://207.251.86.250/images/cams/govt_property/cctv114.jpg", 40.639800000000001D, -74.035799999999995D);
        dat[34] = new Datos("BELT PARKWAY AT CROSS BAY BOULEVARD", "http://207.251.86.248/cctv72.jpg", 40.666091000000002D, -73.841581000000005D);
        dat[35] = new Datos("BELT PARKWAY AT ERSKINE", "http://207.251.86.250/images/cams/govt_property/cctv116.jpg", 40.651699999999998D, -73.865899999999996D);
        dat[36] = new Datos("BELT PARKWAY AT FLATBUSH", "http://207.251.86.250/images/cams/govt_property/cctv61.jpg", 40.597000000000001D, -73.907399999999996D);
        dat[37] = new Datos("BELT PARKWAY AT OCEN PARKWAY", "http://207.251.86.250/images/cams/govt_property/cctv115.jpg", 40.584099999999999D, -73.966999999999999D);
        dat[38] = new Datos("BOWERY AT CANAL STREET", "http://207.251.86.248/cctv13.jpg", 40.716168000000003D, -73.996053000000003D);
        dat[39] = new Datos("BQE AT BROOKLYN NAVY YARD", "http://207.251.86.248/cctv105.jpg", 40.698900000000002D, -73.962299999999999D);
        dat[40] = new Datos("BQE AT BROADWAY", "http://207.251.86.250/images/cams/govt_property/cctv106.jpg", 40.748744000000002D, -73.896261999999993D);
        dat[41] = new Datos("BQE AT HAMILTON AVENUE B-G RAMP", "", 40.675652999999997D, -74.000985999999997D);
        dat[42] = new Datos("BROADWAY AT 169 STREET", "http://207.251.86.248/cctv65.jpg", 40.841679999999997D, -73.939335D);
        dat[43] = new Datos("BROADWAY AT 46 STREET", "http://207.251.86.248/cctv26.jpg", 40.758699999999997D, -73.985344999999995D);
        dat[44] = new Datos("BROADWAY AT FRANKLIN STREET", "", 40.717430999999998D, -74.003658000000001D);
        dat[45] = new Datos("BROADWAY AT GREENWICH STREET", "http://207.251.86.250/images/cams/govt_property/cctv208.jpg", 40.704917000000002D, -74.015024999999994D);
        dat[46] = new Datos("BROADWAY AT HOWARD STREET", "http://207.251.86.250/images/cams/govt_property/cctv227.jpg", 40.719560999999999D, -74.000539000000003D);
        dat[47] = new Datos("BROADWAY AT PINE STREET", "", 40.708378000000003D, -74.011300000000006D);
        dat[48] = new Datos("BROADWAY AT VESEY STREET", "http://207.251.86.250/images/cams/govt_property/cctv223.jpg", 40.711503D, -74.008656000000002D);
        dat[49] = new Datos("BRONX RIVER PARKWAY AT 233 STREET", "", 40.893866000000003D, -73.863297000000003D);
        dat[50] = new Datos("BROOKLYN BATTERY TUNNEL AT WEST STREET", "http://webcam.mta.info/btimg/172.28.208.8/1/image.jpg", 40.704566999999997D, -74.015204999999995D);
        dat[51] = new Datos("BROOKLYN BRIDGE AT Centre STREET", "http://207.251.86.248/cctv14.jpg", 40.704566999999997D, -74.015204999999995D);
        dat[52] = new Datos("BROOKLYN BATTERY TUNNEL AT BROOKLYN SIDE", "http://webcam.mta.info/btimg/172.28.208.8/2/image.jpg", 40.681429999999999D, -74.005289000000005D);
        dat[53] = new Datos("BRUCKNER AT TRIBORO BRIDGE", "http://207.251.86.250/images/cams/govt_property/cctv110.jpg", 40.806336999999999D, -73.908351999999994D);
        dat[54] = new Datos("BRUCKNER EXPY AT BRONX RIVER PARKWAY", "http://207.251.86.248/cctv35.jpg", 40.824407000000001D, -73.872533000000004D);
        dat[55] = new Datos("CENTRAL PARK S AT COLUMBUS CIRCLE", "http://207.251.86.248/cctv5.jpg", 40.769078999999998D, -73.980924999999999D);
        dat[56] = new Datos("CENTRAL PARK W AT 96 STREET", "http://207.251.86.248/cctv69.jpg", 40.791652999999997D, -73.964679000000004D);
        dat[57] = new Datos("CHURCH STREET AT FRANKLIN STREET", "http://207.251.86.250/images/cams/govt_property/cctv225.jpg", 40.718257999999999D, -74.005460999999997D);
        dat[58] = new Datos("CHURCH STREET AT PARK PLAZA", "", 40.713318999999998D, -74.009063999999995D);
        dat[59] = new Datos("CHURCH STREET AT VESEY", "http://207.251.86.248/cctv2.jpg", 40.712052999999997D, -74.010129000000006D);
        dat[60] = new Datos("CLEARVIEW AT NORTHERN BOULEVARD", "", 40.758246999999997D, -73.777296000000007D);
        dat[61] = new Datos("CROSS BRONX EXPY AT EAST OF BRONX RIVER PARKWAY", "http://207.251.86.248/cctv38.jpg", 40.836359999999999D, -73.873654999999999D);
        dat[62] = new Datos("CROSS BRONX EXPY AT EAST OF UNDERCLIFF (GWB)", "", 40.844760000000001D, -73.924777000000006D);
        dat[63] = new Datos("CROSS BRONX EXPY AT RANDALL AVENUE", "http://207.251.86.248/cctv33.jpg", 40.824716000000002D, -73.824740000000006D);
        dat[64] = new Datos("CROSS BRONX PARKWAY AT BAYSIDE MARINA", "http://207.251.86.250/images/cams/govt_property/cctv178.jpg", 40.779277999999998D, -73.768563999999998D);
        dat[65] = new Datos("CROSS BRONX PARKWAY AT THROGSNECK", "http://207.251.86.250/images/cams/govt_property/cctv120.jpg", 40.788184999999999D, -73.790538999999995D);
        dat[66] = new Datos("CROSS BRONX PARKWAY AT UNION TPKE", "", 40.740752999999998D, -73.726669999999999D);
        dat[67] = new Datos("CROSSBAY AT NORTH BOUND", "http://webcam.mta.info/btimg/172.28.205.8/2/image.jpg", 40.597757999999999D, -73.820819999999998D);
        dat[68] = new Datos("CROSSBAY AT SOUTH BOUND", "http://webcam.mta.info/btimg/172.28.205.8/1/image.jpg", 40.587954000000003D, -73.818331999999998D);
        dat[69] = new Datos("DYER AT 42 STREET", "http://207.251.86.248/cctv21.jpg", 40.758982000000003D, -73.993934999999993D);
        dat[70] = new Datos("E 57 STREET AT QBB", "http://207.251.86.248/cctv15.jpg", 40.758946999999999D, -73.964461D);
        dat[71] = new Datos("E 63 STREET AT QBB", "http://207.251.86.248/cctv16.jpg", 40.762711000000003D, -73.961568999999997D);
        dat[72] = new Datos("FDR AT 111 ST", "", 40.791670000000003D, -73.935412999999997D);
        dat[73] = new Datos("FDR AT 135 STREET", "http://207.251.86.248/cctv27.jpg", 40.812347000000003D, -73.934854999999999D);
        dat[74] = new Datos("FDR AT 155 STREET", "http://207.251.86.248/cctv74.jpg", 40.828029999999998D, -73.934882000000002D);
        dat[75] = new Datos("FDR AT 23 STREET", "http://207.251.86.248/cctv134.jpg", 40.735314000000002D, -73.974777000000003D);
        dat[76] = new Datos("FDR AT 3 AVENUE", "", 40.807043999999998D, -73.933717000000001D);
        dat[77] = new Datos("FDR DR AT 36 STREET", "http://207.251.86.248/cctv23.jpg", 40.744553000000003D, -73.971171999999996D);
        dat[78] = new Datos("FDR DR AT 78 STREET", "http://207.251.86.248/cctv24.jpg", 40.769548999999998D, -73.948148000000003D);
        dat[79] = new Datos("FDR DR AT 96 STREET", "http://207.251.86.248/cctv25.jpg", 40.782881000000003D, -73.943911D);
        dat[80] = new Datos("FDR DR AT CATHERINE STREET", "http://207.251.86.248/cctv22.jpg", 40.709254999999999D, -73.996031000000002D);
        dat[81] = new Datos("FDR DR AT OLD SLIP", "http://207.251.86.248/cctv64.jpg", 40.703090000000003D, -74.007704000000004D);
        dat[82] = new Datos("FLATBUSH AT TILLARY", "http://207.251.86.248/cctv88.jpg", 40.694583000000002D, -73.984442000000001D);
        dat[83] = new Datos("FORDHAM ROAD AT HUGHES AVENUE", "http://207.251.86.250/images/cams/govt_property/cctv202.jpg", 40.858162999999998D, -73.884367999999995D);
        dat[84] = new Datos("FORDHAM ROAD AT GRAND CONCOURSE", "http://207.251.86.250/images/cams/govt_property/cctv201.jpg", 40.862555D, -73.896686000000003D);
        dat[85] = new Datos("GCP AT 166 STREET", "http://207.251.86.250/images/cams/govt_property/cctv127.jpg", 40.716878999999999D, -73.800068999999993D);
        dat[86] = new Datos("GCP AT 214 STREET", "", 40.727547000000001D, -73.754095000000007D);
        dat[87] = new Datos("GCP AT 31 ST", "", 40.770525999999997D, -73.917546999999999D);
        dat[88] = new Datos("GOWANUS EXPYAT 63 STREET", "http://207.251.86.248/cctv49.jpg", 40.639988000000002D, -74.021710999999996D);
        dat[89] = new Datos("GOWANUS EXPYAT 92 STREET", "http://207.251.86.250/images/cams/govt_property/cctv103.jpg", 40.616300000000003D, -74.026200000000003D);
        dat[90] = new Datos("GOWANUS EXPYAT GOWANUS PROSPECT", "http://207.251.86.248/cctv46.jpg", 40.667614999999998D, -73.996133999999998D);
        dat[91] = new Datos("GOWANUS EXPYAT SACKETT STREET", "http://207.251.86.248/cctv45.jpg", 40.684629000000001D, -74.001137999999997D);
        dat[92] = new Datos("Gower STREET WOF MANOR ROAD UNDERPASS", "", 40.609158999999998D, -74.123981000000001D);
        dat[93] = new Datos("GRAND BREWER AT BELT", "http://207.251.86.250/images/cams/govt_property/cctv163.jpg", 40.667400000000001D, -73.771100000000004D);
        dat[94] = new Datos("GRAND ARMY PLAZA", "http://207.251.86.250/images/cams/govt_property/cctv98.jpg", 40.672744000000002D, -73.968781000000007D);
        dat[95] = new Datos("GWB APPROACH", "http://207.251.86.248/cctv112.jpg", 40.850354000000003D, -73.940603999999993D);
        dat[96] = new Datos("H BEACH AT 158 STREET", "", 40.660449D, -73.843121999999994D);
        dat[97] = new Datos("HARLEM RIVER DR AT G WASHINGTON BRIDGE", "http://207.251.86.248/cctv67.jpg", 40.847057999999997D, -73.928667000000004D);
        dat[98] = new Datos("HENRY HUDSON AT 72 STREET", "http://207.251.86.248/cctv113.jpg", 40.780991999999998D, -73.987325999999996D);
        dat[99] = new Datos("HENRY HUDSON AT NORTH BOUND", "http://webcam.mta.info/btimg/172.28.204.8/2/image.jpg", 40.878436999999998D, -73.921058000000002D);
        dat[100] = new Datos("HENRY HUDSON AT SOUTH BOUND", "http://webcam.mta.info/btimg/172.28.204.8/1/image.jpg", 40.876071000000003D, -73.924798999999993D);
        dat[101] = new Datos("HENRY HUDSON PARKWAY AT 125 STREET", "", 40.818226299999999D, -73.961377100000007D);
        dat[102] = new Datos("HENRY HUDSON PARKWAY AT 135 STREET", "", 40.82067D, -73.958389999999994D);
        dat[103] = new Datos("HENRY HUDSON PARKWAY AT 153 STREET", "http://207.251.86.248/cctv28.jpg", 40.832695999999999D, -73.949714D);
        dat[104] = new Datos("HENRY HUDSON PARKWAY AT 232 STREET", "http://207.251.86.250/images/cams/govt_property/cctv173.jpg", 40.884560999999998D, -73.914653000000001D);
        dat[105] = new Datos("HENRY HUDSON PARKWAY AT 58 ST", "http://207.251.86.250/images/cams/govt_property/cctv176.jpg", 40.770681000000003D, -73.994320000000002D);
        dat[106] = new Datos("HENRY HUDSON PARKWAY AT 96 ST", "http://207.251.86.250/images/cams/govt_property/cctv188.jpg", 40.753681D, -73.975268D);
        dat[107] = new Datos("HOLLAND TUNNEL", "http://207.251.86.250/images/cams/govt_property/cctv92.jpg", 40.725924999999997D, -74.009506000000002D);
        dat[108] = new Datos("HUTCHISON RIVER PARKWAY AT EAST TREMONT", "http://207.251.86.248/cctv40.jpg", 40.840680999999996D, -73.838395000000006D);
        dat[109] = new Datos("HUTCHISON RIVER PARKWAY AT WHITESTONE BR", "http://207.251.86.248/cctv32.jpg", 40.814048D, -73.836466999999999D);
        dat[110] = new Datos("HYLAN BOULEVARD AT NEW DORP LANE", "http://207.251.86.250/images/cams/govt_property/cctv247.jpg", 40.570469000000003D, -74.109748999999994D);
        dat[111] = new Datos("LEXINGTON AT 59 STREET", "", 40.762487999999998D, -73.968631000000002D);
        dat[112] = new Datos("LEXINGTON AT 72 STREET", "http://207.251.86.250/images/cams/govt_property/cctv181.jpg", 40.770400000000002D, -73.962225000000004D);
        dat[113] = new Datos("LEXINGTON AT 86 STREET", "http://207.251.86.250/images/cams/govt_property/cctv182.jpg", 40.725793000000003D, -74.010917000000006D);
        dat[114] = new Datos("LIE AT 84 STREET", "http://207.251.86.248/cctv157.jpg", 40.729793999999998D, -73.877684000000002D);
        dat[115] = new Datos("LIE AT GCP", "", 40.74015D, -73.845163999999997D);
        dat[116] = new Datos("LIE AT KISSENA BOULEVARD", "http://207.251.86.250/images/cams/govt_property/cctv129.jpg'", 40.738942999999999D, -73.815047000000007D);
        dat[117] = new Datos("LIE AT MARATHON BOULEVARD", "", 40.760624999999997D, -73.731914000000003D);
        dat[118] = new Datos("LIE AT MIDTOWN TUNNEL", "http://207.251.86.248/cctv55.jpg", 40.741351999999999D, -73.954572999999996D);
        dat[119] = new Datos("LIE NEAR WOODHAVEN BOULEVARD", "http://207.251.86.248/cctv58.jpg", 40.732751999999998D, -73.868358000000001D);
        dat[120] = new Datos("LINCOLN TUNNEL", "http://207.251.86.250/images/cams/govt_property/cctv91.jpg", 40.758840999999997D, -73.999067999999994D);
        dat[121] = new Datos("MACOMBS DAM BRIDGE", "http://207.251.86.250/images/cams/govt_property/cctv191.jpg", 40.828114999999997D, -73.931447000000006D);
        dat[122] = new Datos("MAJOR DEEGAN AT TRIBORO BRIDGE", "http://207.251.86.250/images/cams/govt_property/cctv111.jpg", 40.809443000000002D, -73.929361D);
        dat[123] = new Datos("MAJOR DEEGAN EXPY AT N of ALEX HAMILTON BRIDGE", "", 40.849941999999999D, -73.923108999999997D);
        dat[124] = new Datos("MAJOR DEEGAN EXPY AT S of W 167 STREETreet", "", 40.839703999999998D, -73.929319000000007D);
        dat[125] = new Datos("MANHATTAN BBT ENTANCE", "http://207.251.86.250/images/cams/govt_property/cctv184.jpg", 40.706178999999999D, -74.016501000000005D);
        dat[126] = new Datos("MARINE PARKWAY AT NORTH BOUND", "http://webcam.mta.info/btimg/172.28.206.8/1/image.jpg", 40.580616999999997D, -73.890156000000005D);
        dat[127] = new Datos("MARINE PARKWAY AT SOUTH BOUND", "http://webcam.mta.info/btimg/172.28.206.8/2/image.jpg", 40.56814D, -73.881579000000002D);
        dat[128] = new Datos("NE THRUWAY AT CONNER STREET", "", 40.883899999999997D, -73.825900000000004D);
        dat[129] = new Datos("NEW ENGLAND THRU AT BARTOW", "http://207.251.86.250/images/cams/govt_property/cctv122.jpg", 40.868476000000001D, -73.832667000000001D);
        dat[130] = new Datos("NEW ENGLAND TRWY AT EAST TREMONT", "http://207.251.86.248/cctv36.jpg", 40.822319999999998D, -73.819169000000002D);
        dat[131] = new Datos("NORTHERN BOULEVARD AT 60 STREET", "http://207.251.86.250/images/cams/govt_property/cctv187.jpg", 40.753681D, -73.902108999999996D);
        dat[132] = new Datos("NORTHERN BOULEVARD AT GCP", "", 40.758391000000003D, -73.856048000000001D);
        dat[133] = new Datos("OCEANIA AT LIE", "http://207.251.86.250/images/cams/govt_property/cctv149.jpg", 40.745736999999998D, -73.767679000000001D);
        dat[134] = new Datos("OUTERBRIDGE CROSSING AT TYRELLAN AVENUE", "http://207.251.86.250/images/cams/govt_property/cctv95.jpg", 40.525714000000001D, -74.230356D);
        dat[135] = new Datos("PROSPECT EXPY AT FORD HAMILTON PARKWAY", "http://207.251.86.248/cctv47.jpg", 40.649769999999997D, -73.975441000000004D);
        dat[136] = new Datos("QUEENS BOULEVARD AT 65 AVENUE", "http://207.251.86.250/images/cams/govt_property/cctv146.jpg", 40.728642999999998D, -73.858018000000001D);
        dat[137] = new Datos("QUEENS BOULEVARD AT 65 PLAZA", "http://207.251.86.250/images/cams/govt_property/cctv148.jpg", 40.741495D, -73.898292999999995D);
        dat[138] = new Datos("QUEENS BOULEVARD AT QNCNT MALL", "http://207.251.86.250/images/cams/govt_property/cctv145.jpg", 40.734284000000002D, -73.872462999999996D);
        dat[139] = new Datos("QUEENS BOULEVARD AT 36 STREETreet", "", 40.744033000000002D, -73.926203000000001D);
        dat[140] = new Datos("QUEENS BOULEVARD AT 51 STREET", "http://207.251.86.250/images/cams/govt_property/cctv185.jpg", 40.742626999999999D, -73.914056000000002D);
        dat[141] = new Datos("QUEENS BOULEVARD AT VAN DAM", "", 40.743034000000002D, -73.934623999999999D);
        dat[142] = new Datos("QUEENS MIDTOWN TUNNEL AT MANHATTAN BOUND", "http://webcam.mta.info/btimg/172.28.207.8/2/image.jpg", 40.747934999999998D, -73.969031999999999D);
        dat[143] = new Datos("QUEENS MIDTOWN TUNNEL AT QUEENS BOUND", "http://webcam.mta.info/btimg/172.28.207.8/1/image.jpg", 40.742215000000002D, -73.958866999999998D);
        dat[144] = new Datos("QUEENS Plaza N AT QUEENS BORO BRIDGE", "http://207.251.86.248/cctv54.jpg", 40.750183D, -73.938096000000002D);
        dat[145] = new Datos("SIE AT 440 DR M.L.KING EXPY EXIT 9", "", 40.612065000000001D, -74.153839000000005D);
        dat[146] = new Datos("SIE AT 440 WEST SHORE EXPY EXIT 5", "http://207.251.86.248/cctv135.jpg", 40.622211D, -74.174279999999996D);
        dat[147] = new Datos("SIE AT BRADLEY AVENUE EXIT 12", "", 40.608154999999996D, -74.132084000000006D);
        dat[148] = new Datos("SIE AT CLOVE ROAD", "http://207.251.86.250/images/cams/govt_property/cctv96.jpg", 40.609361D, -74.091434000000007D);
        dat[149] = new Datos("SIE AT FINGERBOARD ROAD", "http://207.251.86.248/cctv142.jpg", 40.604000999999997D, -74.069142999999997D);
        dat[150] = new Datos("SIE AT HYLAN BOULEVARD", "http://207.251.86.248/cctv133.jpg", 40.606206999999998D, -74.077774000000005D);
        dat[151] = new Datos("SIE AT RICHMON AVENUE", "http://207.251.86.250/images/cams/govt_property/cctv83.jpg", 40.614885000000001D, -74.157435000000007D);
        dat[152] = new Datos("SIE AT SLOSSON AVENUE", "", 40.610985999999997D, -74.116799999999998D);
        dat[153] = new Datos("SIE AT VICTORY BOULEVARD EOF EXIT 9", "http://207.251.86.248/cctv137.jpg", 40.609549999999999D, -74.150046000000003D);
        dat[154] = new Datos("SIE AT WOLLEY AVENUE WOD EXIT 11", "http://207.251.86.248/cctv138.jpg", 40.607745999999999D, -74.140854000000004D);
        dat[155] = new Datos("STREET JAMES Pl AT CHATHAM SQUARE", "", 40.713436000000002D, -73.998686000000006D);
        dat[156] = new Datos("THROGS NECK BRIDGE AT BRONX BOUND", "http://webcam.mta.info/btimg/172.28.209.8/2/image.jpg", 40.821165000000001D, -73.814487999999997D);
        dat[157] = new Datos("THROGS NECK BRIDGE AT QUEENS BOUND", "", 40.789082999999998D, -73.791569999999993D);
        dat[158] = new Datos("TRIBOROUGH BRIDGE BRONX BOUND", "", 40.799604000000002D, -73.918512000000007D);
        dat[159] = new Datos("TRIBOROUGH BRIDGE QUEENS BOUND", "", 40.777965999999999D, -73.925381000000002D);
        dat[160] = new Datos("TRIBOROUGH BRIDGEs AT MANHATTAN BOUND", "http://webcam.mta.info/btimg/172.28.202.8/1/image.jpg", 40.800904000000003D, -73.929219000000003D);
        dat[161] = new Datos("TRINITY AT BROOKLYN BATTERY TUNNEL", "http://207.251.86.248/cctv63.jpg", 40.706473786856463D, -74.014334678649902D);
        dat[162] = new Datos("VAN WYCK EXPY AT ATLANTIC", "", 40.696874000000001D, -73.813464999999994D);
        dat[163] = new Datos("VAN WYCK EXPY AT 101 AVENUE", "http://207.251.86.248/cctv52.jpg", 40.728687000000001D, -73.908161000000007D);
        dat[164] = new Datos("VAN WYCK EXPY AT BELT PARKWAY", "", 40.665877999999999D, -73.801829999999995D);
        dat[165] = new Datos("VAN WYCK EXPY AT GCP INTERCHANGE", "http://207.251.86.248/cctv53.jpg", 40.743302D, -73.837672999999995D);
        dat[166] = new Datos("VAN WYCK EXPY S. OF LIE", "http://207.251.86.248/cctv198.jpg", 40.739381000000002D, -73.836954000000006D);
        dat[167] = new Datos("Varick STREET AT BEACH STREET", "", 40.720477500000001D, -74.006824399999999D);
        dat[168] = new Datos("VERRAZANO NARROWS AT BROOKLYN BOUND", "http://webcam.mta.info/btimg/172.28.211.8/1/image.jpg", 40.601213000000001D, -74.055618999999993D);
        dat[169] = new Datos("VERRAZANO NARROWS AT STREETaten Island BOUND", "", 40.603282999999998D, -74.054886999999994D);
        dat[170] = new Datos("VICTORY BOULEVARD AT BAY STREET", "", 40.637748000000002D, -74.076018000000005D);
        dat[171] = new Datos("VICTORY BOULEVARD AT JERSEY STREET", "", 40.635734999999997D, -74.083776999999998D);
        dat[172] = new Datos("VICTORY BOULEVARD WOF CAMPUS DR", "http://207.251.86.250/images/cams/govt_property/cctv232.jpg", 40.608767999999998D, -74.153616D);
        dat[173] = new Datos("WBB BROOKLYN ENTRANCE", "", 40.712459000000003D, -73.967943000000005D);
        dat[174] = new Datos("WBB MANHATTAN ENTRANCE", "http://207.251.86.248/cctv48.jpg", 40.715322D, -73.976354000000001D);
        dat[175] = new Datos("WEST BROADWAY AT CHAMBERS STREET", "", 40.715533000000001D, -74.009080999999995D);
        dat[176] = new Datos("WEST BROADWAY AT GRAND STREET", "", 40.722468999999997D, -74.003781000000004D);
        dat[177] = new Datos("WEST BROADWAY AT WORTH STREET", "http://207.251.86.250/images/cams/govt_property/cctv218.jpg", 40.717700000000001D, -74.007368999999997D);
        dat[178] = new Datos("WEST STREET AT 14 STREET", "", 40.742378000000002D, -74.008809999999997D);
        dat[179] = new Datos("WEST STREET AT 22 STREET", "http://207.251.86.248/cctv192.jpg", 40.748218999999999D, -74.007479000000004D);
        dat[180] = new Datos("WEST STREET AT 34 STREET", "http://207.251.86.248/cctv59.jpg", 40.757024000000001D, -74.004925D);
        dat[181] = new Datos("WEST STREET AT 42 STREET", "http://207.251.86.248/cctv190.jpg", 40.762020999999997D, -74.001164000000003D);
        dat[182] = new Datos("WEST STREET AT CANAL STREET", "http://207.251.86.248/cctv50.jpg", 40.725793000000003D, -74.010917000000006D);
        dat[183] = new Datos("WEST STREET AT CLARCKSON", "http://207.251.86.248/cctv189.jpg", 40.729832000000002D, -74.010658000000006D);
        dat[184] = new Datos("WEST STREET AT HARRISON STREET", "", 40.719172D, -74.012156000000004D);
        dat[185] = new Datos("WEST STREET AT INTREPID", "", 40.760891999999998D, -74.002252999999996D);
        dat[186] = new Datos("WHITESTONE AT 14 AVENUE", "http://207.251.86.248/cctv197.jpg", 40.786825D, -73.824342999999999D);
        dat[187] = new Datos("WHITESTONE AT BRONX BOUND", "http://webcam.mta.info/btimg/172.28.203.8/2/image.jpg", 40.806837000000002D, -73.832813000000002D);
        dat[188] = new Datos("WHITESTONE AT QUEENS BOUND", "http://webcam.mta.info/btimg/172.28.203.8/1/image.jpg", 40.797232999999999D, -73.826679999999996D);
        dat[189] = new Datos("WHITESTONE BRIDGE", "http://207.251.86.250/images/cams/govt_property/cctv121.jpg", 40.789712999999999D, -73.822401999999997D);
        dat[190] = new Datos("WHITESTONE NEAR OF LINDEN PLAZA", "http://207.251.86.250/images/cams/govt_property/cctv183.jpg", 40.772705000000002D, -73.830426000000003D);
        dat[191] = new Datos("WORTH STREET AT CENTRE STREET", "http://207.251.86.250/images/cams/govt_property/cctv217.jpg", 40.715147000000002D, -74.002294000000006D);
        dat[192] = new Datos("WSE AT VICTORY BOULEVARD", "", 40.590089999999996D, -74.193437000000003D);
        dat[193] = new Datos("YORK AVENUE AT 91 ST", "", 40.779142D, -73.944768999999994D);



       // String[] values = new String[]{"Broadway", "Times Square", "Union Square",
         //       "Madission Square", "Pace University"};

        ArrayList<Datos> array= new ArrayList<Datos> ();






      /*  Datos datos[];

        

    public GeoPoint getCenter()
    {
        return new GeoPoint(0x26dcab0, 0xfb97091b);
    }

    public Datos[] getDatos()
    {*/

        String[] link = new String[] {"http://207.251.86.250/images/cams/govt_property/cctv254.jpg","http://207.251.86.250/images/cams/govt_property/cctv253.jpg", "http://207.251.86.250/images/cams/govt_property/cctv252.jpg","http://207.251.86.250/images/cams/govt_property/cctv196.jpg","http://207.251.86.248/cctv200.jpg","http://207.251.86.248/cctv31.jpg", "http://207.251.86.250/images/cams/govt_property/cctv251.jpg","http://207.251.86.248/cctv102.jpg", "", "http://207.251.86.248/cctv3.jpg", "","http://207.251.86.248/cctv7.jpg", "http://207.251.86.248/cctv6.jpg","http://207.251.86.248/cctv8.jpg", "http://207.251.86.248/cctv9.jpg",
                "http://207.251.86.248/cctv12.jpg", "http://207.251.86.248/cctv10.jpg", "http://207.251.86.248/cctv66.jpg", "http://207.251.86.248/cctv68.jpg", "http://207.251.86.248/cctv70.jpg",  "http://207.251.86.248/cctv19.jpg","http://207.251.86.248/cctv20.jpg", "http://207.251.86.248/cctv18.jpg", "http://207.251.86.250/images/cams/govt_property/cctv250.jpg","http://207.251.86.248/cctv17.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv89.jpg","http://207.251.86.248/cctv29.jpg","http://207.251.86.248/cctv11.jpg","","http://207.251.86.250/images/cams/govt_property/cctv117.jpg",  "", "http://207.251.86.250/images/cams/govt_property/cctv125.jpg", "http://207.251.86.250/images/cams/govt_property/cctv167.jp",
                "http://207.251.86.250/images/cams/govt_property/cctv114.jpg","http://207.251.86.248/cctv72.jpg","http://207.251.86.250/images/cams/govt_property/cctv116.jpg", "http://207.251.86.250/images/cams/govt_property/cctv61.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv115.jpg", "http://207.251.86.248/cctv13.jpg",
                "http://207.251.86.248/cctv105.jpg", "http://207.251.86.250/images/cams/govt_property/cctv106.jpg",  "", "http://207.251.86.248/cctv65.jpg",
                "http://207.251.86.248/cctv26.jpg", "","http://207.251.86.250/images/cams/govt_property/cctv208.jpg","http://207.251.86.250/images/cams/govt_property/cctv227.jpg","",
                "http://207.251.86.250/images/cams/govt_property/cctv223.jpg",
                "",
                "http://webcam.mta.info/btimg/172.28.208.8/1/image.jpg", "http://207.251.86.248/cctv14.jpg",
                "http://webcam.mta.info/btimg/172.28.208.8/2/image.jpg", "http://207.251.86.250/images/cams/govt_property/cctv110.jpg",
                "http://207.251.86.248/cctv35.jpg","http://207.251.86.248/cctv5.jpg",
                "http://207.251.86.248/cctv69.jpg", "http://207.251.86.250/images/cams/govt_property/cctv225.jpg","",
                "http://207.251.86.248/cctv2.jpg", "","http://207.251.86.248/cctv38.jpg",  "",
                "http://207.251.86.248/cctv33.jpg", "http://207.251.86.250/images/cams/govt_property/cctv178.jpg","http://207.251.86.250/images/cams/govt_property/cctv120.jpg", "",
                "http://webcam.mta.info/btimg/172.28.205.8/2/image.jpg", "http://webcam.mta.info/btimg/172.28.205.8/1/image.jpg", "http://207.251.86.248/cctv21.jpg",
                "http://207.251.86.248/cctv15.jpg", "http://207.251.86.248/cctv16.jpg", "","http://207.251.86.248/cctv27.jpg", "http://207.251.86.248/cctv74.jpg", "http://207.251.86.248/cctv134.jpg",  "",
                "http://207.251.86.248/cctv23.jpg", "http://207.251.86.248/cctv24.jpg", "http://207.251.86.248/cctv25.jpg",
                "http://207.251.86.248/cctv22.jpg", "http://207.251.86.248/cctv64.jpg",
                "http://207.251.86.248/cctv88.jpg", "http://207.251.86.250/images/cams/govt_property/cctv202.jpg","http://207.251.86.250/images/cams/govt_property/cctv201.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv127.jpg",  "",  "",  "http://207.251.86.248/cctv49.jpg", "http://207.251.86.250/images/cams/govt_property/cctv103.jpg",
                "http://207.251.86.248/cctv46.jpg",  "http://207.251.86.248/cctv45.jpg",  "", "http://207.251.86.250/images/cams/govt_property/cctv163.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv98.jpg", "http://207.251.86.248/cctv112.jpg", "", "http://207.251.86.248/cctv67.jpg", "http://207.251.86.248/cctv113.jpg",
                "http://webcam.mta.info/btimg/172.28.204.8/2/image.jpg", "http://webcam.mta.info/btimg/172.28.204.8/1/image.jpg", "", "", "http://207.251.86.248/cctv28.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv173.jpg", "http://207.251.86.250/images/cams/govt_property/cctv176.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv188.jpg", "http://207.251.86.250/images/cams/govt_property/cctv92.jpg",
                "http://207.251.86.248/cctv40.jpg", "http://207.251.86.248/cctv32.jpg", "http://207.251.86.250/images/cams/govt_property/cctv247.jpg",
                "","http://207.251.86.250/images/cams/govt_property/cctv181.jpg", "http://207.251.86.250/images/cams/govt_property/cctv182.jpg",
                "http://207.251.86.248/cctv157.jpg", "","http://207.251.86.250/images/cams/govt_property/cctv129.jpg'", "","http://207.251.86.248/cctv55.jpg", "http://207.251.86.248/cctv58.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv91.jpg", "http://207.251.86.250/images/cams/govt_property/cctv191.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv111.jpg",  "", "", "http://207.251.86.250/images/cams/govt_property/cctv184.jpg",
                "http://webcam.mta.info/btimg/172.28.206.8/1/image.jpg", "http://webcam.mta.info/btimg/172.28.206.8/2/image.jpg", "",
                "http://207.251.86.250/images/cams/govt_property/cctv122.jpg","http://207.251.86.248/cctv36.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv187.jpg","","http://207.251.86.250/images/cams/govt_property/cctv149.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv95.jpg","http://207.251.86.248/cctv47.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv146.jpg", "http://207.251.86.250/images/cams/govt_property/cctv148.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv145.jpg", "",
                "http://207.251.86.250/images/cams/govt_property/cctv185.jpg",  "",
                "http://webcam.mta.info/btimg/172.28.207.8/2/image.jpg", "http://webcam.mta.info/btimg/172.28.207.8/1/image.jpg",
                "http://207.251.86.248/cctv54.jpg", "","http://207.251.86.248/cctv135.jpg","","http://207.251.86.250/images/cams/govt_property/cctv96.jpg",
                "http://207.251.86.248/cctv142.jpg", "http://207.251.86.248/cctv133.jpg", "http://207.251.86.250/images/cams/govt_property/cctv83.jpg", "",
                "http://207.251.86.248/cctv137.jpg", "http://207.251.86.248/cctv138.jpg","","http://webcam.mta.info/btimg/172.28.209.8/2/image.jpg",
                "", "","","http://webcam.mta.info/btimg/172.28.202.8/1/image.jpg", "http://207.251.86.248/cctv63.jpg", "", "http://207.251.86.248/cctv52.jpg",
                "","http://207.251.86.248/cctv53.jpg", "http://207.251.86.248/cctv198.jpg",  "", "http://webcam.mta.info/btimg/172.28.211.8/1/image.jpg", "",  "", "",
                "http://207.251.86.250/images/cams/govt_property/cctv232.jpg", "",  "http://207.251.86.248/cctv48.jpg", "", "","http://207.251.86.250/images/cams/govt_property/cctv218.jpg",
                "","http://207.251.86.248/cctv192.jpg", "http://207.251.86.248/cctv59.jpg", "http://207.251.86.248/cctv190.jpg","http://207.251.86.248/cctv50.jpg", "http://207.251.86.248/cctv189.jpg",
                "",  "", "http://207.251.86.248/cctv197.jpg", "http://webcam.mta.info/btimg/172.28.203.8/2/image.jpg", "http://webcam.mta.info/btimg/172.28.203.8/1/image.jpg","http://207.251.86.250/images/cams/govt_property/cctv121.jpg",
                "http://207.251.86.250/images/cams/govt_property/cctv183.jpg","http://207.251.86.250/images/cams/govt_property/cctv217.jpg", "", ""};

        String[] values = new String[]{"1 AVENUE AT 124 STREET","1 AVENUE AT 124 STREET","1 AVENUE AT 79 STREET","1 AVENUE AT 80 STREET","11 AVENUE AT 34 STREET","11 AVENUE AT 42 STREET","2 AVENUE AT 110 STREET","2 AVENUE AT 125 STREET","2 AVENUE AT 36 STREET-MIDTOWN TUNNEL","2 AVENUE AT QBB","9 AVENUE AT 207 STREET","5 AVENUE AT 23 STREET","5 AVENUE AT 42 STREET","5 AVENUE AT 49 STREET","6 AVENUE AT 34 STREET","6 AVENUE AT 42 STREET","6 AVENUE AT 49 STREET","7 AVENUE AT 125 STREET","8 AVENUE AT 110 STREET", "8 AVENUE AT 34 STREET","8 AVENUE AT 42 STREET","8 AVENUE AT COLUMBUS CIRCLE","9 AVENUE AT 30th STREET","9 AVENUE AT 34 STREET","ADAMS AT TILLARY", "AMSTERDAM AVENUE AT 178 STREET",
                "BAXTER AT CANAL STREET","BELT AT 130 STREET","BELT AT 225 STREET","BELT AT BROOKVILLE","BELT AT KNAPP","BELT PARKWAY AT PAERDEGAT BASIN BRIDGE","BELT PARKWAY AT 68 STREET","BELT PARKWAY AT CROSS BAY BOULEVARD","BELT PARKWAY AT ERSKINE","BELT PARKWAY AT FLATBUSH","BELT PARKWAY AT OCEN PARKWAY","BOWERY AT CANAL STREET",
                "BQE AT BROOKLYN NAVY YARD","BQE AT BROADWAY","BQE AT HAMILTON AVENUE B-G RAMP","BROADWAY AT 169 STREET","BROADWAY AT 46 STREET","BROADWAY AT FRANKLIN STREET","BROADWAY AT GREENWICH STREET","BROADWAY AT HOWARD STREET","BROADWAY AT PINE STREET","BROADWAY AT VESEY STREET","BRONX RIVER PARKWAY AT 233 STREET","BROOKLYN BATTERY TUNNEL AT WEST STREET","BROOKLYN BRIDGE AT Centre STREET","BROOKLYN BATTERY TUNNEL AT BROOKLYN SIDE", "BRUCKNER AT TRIBORO BRIDGE","BRUCKNER EXPY AT BRONX RIVER PARKWAY","CENTRAL PARK S AT COLUMBUS CIRCLE","CENTRAL PARK W AT 96 STREET","CHURCH STREET AT FRANKLIN STREET","CHURCH STREET AT PARK PLAZA", "CHURCH STREET AT VESEY","CLEARVIEW AT NORTHERN BOULEVARD", "CROSS BRONX EXPY AT EAST OF BRONX RIVER PARKWAY", "CROSS BRONX EXPY AT EAST OF UNDERCLIFF  GWB", "CROSS BRONX EXPY AT RANDALL AVENUE", "CROSS BRONX PARKWAY AT BAYSIDE MARINA","CROSS BRONX PARKWAY AT THROGSNECK","CROSS BRONX PARKWAY AT UNION TPKE","CROSSBAY AT NORTH BOUND","CROSSBAY AT SOUTH BOUND","DYER AT 42 STREET","E 57 STREET AT QBB","E 63 STREET AT QBB", "FDR AT 111 ST", "FDR AT 135 STREET", "FDR AT 155 STREET", "FDR AT 23 STREET", "FDR AT 3 AVENUE", "FDR DR AT 36 STREET","FDR DR AT 78 STREET", "FDR DR AT 96 STREET", "FDR DR AT CATHERINE STREET", "FDR DR AT OLD SLIP", "FLATBUSH AT TILLARY", "FORDHAM ROAD AT HUGHES AVENUE", "FORDHAM ROAD AT GRAND CONCOURSE","GCP AT 166 STREET", "GCP AT 214 STREET", "GCP AT 31 ST", "GOWANUS EXPYAT 63 STREET", "GOWANUS EXPYAT 92 STREET", "GOWANUS EXPYAT GOWANUS PROSPECT","GOWANUS EXPYAT SACKETT STREET","Gower STREET WOF MANOR ROAD UNDERPASS", "GRAND BREWER AT BELT", "GRAND ARMY PLAZA", "GWB APPROACH", "H BEACH AT 158 STREET", "HARLEM RIVER DR AT G WASHINGTON BRIDGE", "HENRY HUDSON AT 72 STREET", "HENRY HUDSON AT NORTH BOUND", "HENRY HUDSON AT SOUTH BOUND", "HENRY HUDSON PARKWAY AT 125 STREET","HENRY HUDSON PARKWAY AT 135 STREET", "HENRY HUDSON PARKWAY AT 153 STREET", "HENRY HUDSON PARKWAY AT 232 STREET", "HENRY HUDSON PARKWAY AT 58 ST", "HENRY HUDSON PARKWAY AT 96 ST", "HOLLAND TUNNEL", "HUTCHISON RIVER PARKWAY AT EAST TREMONT", "HUTCHISON RIVER PARKWAY AT WHITESTONE BR", "HYLAN BOULEVARD AT NEW DORP LANE", "LEXINGTON AT 59 STREET", "LEXINGTON AT 72 STREET", "LEXINGTON AT 86 STREET", "LIE AT 84 STREET","LIE AT GCP", "LIE AT KISSENA BOULEVARD", "LIE AT MARATHON BOULEVARD", "LIE AT MIDTOWN TUNNEL", "LIE NEAR WOODHAVEN BOULEVARD", "LINCOLN TUNNEL", "MACOMBS DAM BRIDGE", "MAJOR DEEGAN AT TRIBORO BRIDGE", "MAJOR DEEGAN EXPY AT N of ALEX HAMILTON BRIDGE", "MAJOR DEEGAN EXPY AT S of W 167 STREETreet", "MANHATTAN BBT ENTANCE", "MARINE PARKWAY AT NORTH BOUND", "MARINE PARKWAY AT SOUTH BOUND", "NE THRUWAY AT CONNER STREET", "NEW ENGLAND THRU AT BARTOW", "NEW ENGLAND TRWY AT EAST TREMONT", "NORTHERN BOULEVARD AT 60 STREET", "NORTHERN BOULEVARD AT GCP", "OCEANIA AT LIE", "OUTERBRIDGE CROSSING AT TYRELLAN AVENUE", "PROSPECT EXPY AT FORD HAMILTON PARKWAY", "QUEENS BOULEVARD AT 65 AVENUE", "QUEENS BOULEVARD AT 65 PLAZA","QUEENS BOULEVARD AT QNCNT MALL", "QUEENS BOULEVARD AT 36 STREETreet", "QUEENS BOULEVARD AT 51 STREET", "QUEENS BOULEVARD AT VAN DAM", "QUEENS MIDTOWN TUNNEL AT MANHATTAN BOUND", "QUEENS MIDTOWN TUNNEL AT QUEENS BOUND", "QUEENS Plaza N AT QUEENS BORO BRIDGE", "SIE AT 440 DR M.L.KING EXPY EXIT 9","SIE AT 440 WEST SHORE EXPY EXIT 5", "SIE AT BRADLEY AVENUE EXIT 12","SIE AT CLOVE ROAD", "SIE AT FINGERBOARD ROAD", "SIE AT HYLAN BOULEVARD", "SIE AT RICHMON AVENUE", "SIE AT SLOSSON AVENUE", "SIE AT VICTORY BOULEVARD EOF EXIT 9", "SIE AT WOLLEY AVENUE WOD EXIT 11", "STREET JAMES Pl AT CHATHAM SQUARE", "THROGS NECK BRIDGE AT BRONX BOUND", "THROGS NECK BRIDGE AT QUEENS BOUND", "TRIBOROUGH BRIDGE BRONX BOUND", "TRIBOROUGH BRIDGE QUEENS BOUND", "TRIBOROUGH BRIDGEs AT MANHATTAN BOUND", "TRINITY AT BROOKLYN BATTERY TUNNEL",  "VAN WYCK EXPY AT ATLANTIC", "VAN WYCK EXPY AT 101 AVENUE","VAN WYCK EXPY AT BELT PARKWAY","VAN WYCK EXPY AT GCP INTERCHANGE", "VAN WYCK EXPY S. OF LIE","Varick STREET AT BEACH STREET","VERRAZANO NARROWS AT BROOKLYN BOUND", "VERRAZANO NARROWS AT STREETaten Island BOUND", "VICTORY BOULEVARD AT BAY STREET", "VICTORY BOULEVARD AT JERSEY STREET", "VICTORY BOULEVARD WOF CAMPUS DR", "WBB BROOKLYN ENTRANCE", "WBB MANHATTAN ENTRANCE", "WEST BROADWAY AT CHAMBERS STREET","WEST BROADWAY AT GRAND STREET", "WEST BROADWAY AT WORTH STREET", "WEST STREET AT 14 STREET", "WEST STREET AT 22 STREET", "WEST STREET AT 34 STREET", "WEST STREET AT 42 STREET",
                "WEST STREET AT CANAL STREET", "WEST STREET AT CLARCKSON", "WEST STREET AT HARRISON STREET", "WEST STREET AT INTREPID", "WHITESTONE AT 14 AVENUE", "WHITESTONE AT BRONX BOUND", "WHITESTONE AT QUEENS BOUND", "WHITESTONE BRIDGE", "WHITESTONE NEAR OF LINDEN PLAZA", "WORTH STREET AT CENTRE STREET", "WSE AT VICTORY BOULEVARD", "YORK AVENUE AT 91 ST" };


        ArrayAdapter adapter;
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView listView, View view,
                                    int position, long id) {

                // ListView Clicked item index
                itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                //Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();


                 public void onClick(View v) {
                Intent ioo = new Intent(CameraList.this, Feed.class);
                String pass = link(itemPosition);
                ioo.putExtra(link, pass);
                startActivity(ioo);
            }







            /*@Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_camera_list, menu);
                return true;
            }*/
            }

            /* @Override
              public boolean onOptionsItemSelected(MenuItem item) {
             // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
            return true;
            }

            return super.onOptionsItemSelected(item);*/


        })
    }

}