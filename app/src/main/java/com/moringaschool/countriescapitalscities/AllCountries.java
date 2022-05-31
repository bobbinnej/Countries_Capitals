package com.moringaschool.countriescapitalscities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AllCountries extends AppCompatActivity {
    private int [] images={R.drawable.algeria,R.drawable.angola, R.drawable.benin,R.drawable.botswana,
    R.drawable.burkina_faso,R.drawable.burundi,R.drawable.cameroon,R.drawable.cape_verde,R.drawable.central_african_republic,
            R.drawable.chad,R.drawable.comoros,R.drawable.democratic_republic_of_congo,R.drawable.djibouti,R.drawable.egypt,
            R.drawable.equatorial_guinea,R.drawable.eritrea,R.drawable.swaziland,R.drawable.ethiopia,R.drawable.gabon,
            R.drawable.gambia,R.drawable.ghana,R.drawable.guinea,R.drawable.guinea_bissau,R.drawable.ivory_coast,
            R.drawable.kenya,R.drawable.lesotho,R.drawable.liberia,R.drawable.libya,R.drawable.madagascar,R.drawable.malawi,
            R.drawable.mali,R.drawable.mauritania,R.drawable.mauritius,R.drawable.morocco,R.drawable.mozambique,
            R.drawable.namibia,R.drawable.niger,R.drawable.nigeria,R.drawable.congo,R.drawable.rwanda,
            R.drawable.sao_tome_and_principe,R.drawable.senegal,R.drawable.seychelles,R.drawable.sierra_leone,R.drawable.somalia,
            R.drawable.south_africa,R.drawable.south_sudan,R.drawable.sudan,R.drawable.tanzania,R.drawable.togo,R.drawable.tunisia,
            R.drawable.uganda,R.drawable.zambia,R.drawable.zimbabwe};

    private String [] countries={"Algeria", "Angola", "Benin","Botswana","Burkina Faso","Burundi","Cameroon"
            ,"Cape Verde","Central African Republic","Chad","Comoros","Democratic Republic of Congo","Djibouti"
            ,"Egypt","Equatorial Guinea","Eritrea","Eswatini/Swaziland","Ethiopia","Gabon","Gambia"
            ,"Ghana","Guinea","Guinea-Bissau","Ivory Coast/Côte d'Ivoire","Kenya","Lesotho","Liberia"
            ,"Libya","Madagascar","Malawi","Mali","Mauritania","Mauritius","Morocco","Mozambique","Namibia",
            "Niger","Nigeria","Republic of Congo","Rwanda","São Tomé and Príncipe","Senegal","Seychelles"
            ,"Sierra Leone","Somalia","South Africa","South Sudan","Sudan","Tanzania","Togo","Tunisia","Uganda","Zambia","Zimbabwe"};

    private String [] capitals={"Algiers", "Luanda", "Porto Novo", "Gaborone","Ouagadougou","Bujumbura","Yaoundé",
            "Praia","Bangui","N'Djamena","Moroni","Kinshasa","Djibouti","Cairo","Malabo","Asmara","Mbabane","Addis Ababa"
            ,"Libreville","Banjul","Accra","Conakry","Bissau","Yamoussoukro","Nairobi","Maseru"
            ,"Monrovia","Tripoli","Antananarivo","Lilongwe","Bamako","Nouakchott","Port Louis"
            ,"Rabat","Maputo","Windhoek","Niamey","Abuja","Brazzaville","Kigali","São Tomé","Dakar","Victoria","Freetown"
            ,"Mogadishu","Pretoria","Juba","Khartoum","Dodoma","Lomé","Tunis","Kampala","Lusaka","Harare"};

    private List<ItemsHolder> itemsHolderList= new ArrayList<>();

    GridView gridView;
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_countries);

        //loop through and add to list
        for(int i=0; i<countries.length; i++ ){
             ItemsHolder itemsHolder=new ItemsHolder(images[i],countries[i],capitals[i]);
             itemsHolderList.add(itemsHolder);

        }

        gridView=findViewById(R.id.countriesGridView);
        customAdapter=new CustomAdapter(itemsHolderList, this);

        gridView.setAdapter(customAdapter);
    }
    // create an adapter that will link data source to grid view
    public class CustomAdapter extends BaseAdapter{

        private List<ItemsHolder>itemsHolderList;
        private Context context;


        public CustomAdapter(List<ItemsHolder> itemsHolderList, Context context) {
            this.itemsHolderList = itemsHolderList;
            this.context = context;
        }



        @Override
        public int getCount() {
            return itemsHolderList.size();
        }

        @Override
        public Object getItem(int i) {
            return itemsHolderList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1=view;
            ItemsHolder itemsHolder=itemsHolderList.get(i);
            if(view1==null){
                view1= LayoutInflater.from(context).inflate(R.layout.activity_row_data,viewGroup,false);

            }
            ImageView imageName=view1.findViewById(R.id.imageName);
            TextView countryName=view1.findViewById(R.id.countryName);
            TextView countryCapital=view1.findViewById(R.id.countryCapital);

            String country=itemsHolder.getCountry();
            String capital=itemsHolder.getCapital();
            int image=itemsHolder.getImage();

            imageName.setImageResource(image);
            countryName.setText(country);
            countryCapital.setText(capital);


            return view1 ;

        }
    }
}