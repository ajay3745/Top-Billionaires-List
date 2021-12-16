package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Jeff Bezos", "Amazon", "https://bsmedia.business-standard.com/_media/bs/img/article/2021-02/03/full/1612372052-5838.jpg", "https://twitter.com/jeffbezos"));
        contacts.add(new Contact("Elon Musk", "Tesla, SpaceX","https://www.usnews.com/dims4/USNEWS/f45ea7c/2147483647/thumbnail/640x420/quality/85/?url=http%3A%2F%2Fmedia.beam.usnews.com%2Fd1%2Fd8%2F8501ba714a21aed9a7327e02ade1%2F180515-10thingselonmusk-editorial.jpg", "https://twitter.com/elonmusk"));
        contacts.add(new Contact("Bernard Arnault & Family", "LVMH", "https://images.businessoffashion.com/site/uploads/2018/04/Magali-Delporte-Bernard-Arnault-e1555585938299.jpg", "https://twitter.com/LVMH"));
        contacts.add(new Contact("Mark Zuckerberg", "Facebook", "https://upload.wikimedia.org/wikipedia/commons/1/18/Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg", "https://twitter.com/Facebook"));
        contacts.add(new Contact("Bill Gates", "Microsoft", "https://pbs.twimg.com/profile_images/1414439092373254147/JdS8yLGI_400x400.jpg", "https://twitter.com/BillGates"));
        contacts.add(new Contact("Larry Page", "Google", "https://www.biography.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTc5ODc2NTUzODU1ODcwOTY1/gettyimages-83414114.jpg", "https://twitter.com/search?q=%23larrypage&lang=en"));
        contacts.add(new Contact("Sergey Brin", "Google", "https://www.biography.com/.image/t_share/MTc5ODc5NTMxMDczOTcxMzIy/gettyimages-456023687.jpg", "https://twitter.com/tt_sergeybrin?lang=en"));
        contacts.add(new Contact("Larry Ellison", "software", "https://cdn.vox-cdn.com/thumbor/W4ikfclc2THvcaZTeOuIvEKD5aA=/0x0:5184x3456/1200x800/filters:focal(2178x1314:3006x2142)/cdn.vox-cdn.com/uploads/chorus_image/image/68511619/1183284106.0.jpg", "https://twitter.com/larryellison"));
        contacts.add(new Contact("Warren Buffett", "Berkshire Hathaway", "https://cdn.gobankingrates.com/wp-content/uploads/2018/11/Warren-Buffett-Berkshire-Hathaway-CEO-shutterstock_6324566s.jpg", "https://twitter.com/warrenbuffett"));
        contacts.add(new Contact("Steve Ballmer", "Microsoft", "https://cdn.britannica.com/56/222556-050-0C9B4C64/American-businessman-Steve-Ballmer-2009.jpg", "https://twitter.com/steven_ballmer"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));

    }
}