package hunor.ms.sapientia.ro.sapiads;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        findViewById(R.id.buttonLogout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                startActivity(intent);
            }

        });

        findViewById(R.id.recyclerView).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//fuggveny
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //initializing the productlist
        productList = new ArrayList<>();

//adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Teemo",
                        "hard af",
                        4.3,
                        3150,
                        R.drawable.teemo));

        productList.add(
                new Product(
                        1,
                        "Yasuo",
                        "ez ",
                        -1,
                        6300,
                        R.drawable.yasuo));

        productList.add(
                new Product(
                        1,
                        "Varus",
                        "mid range champion",
                        5.5,
                        4800,
                        R.drawable.varus));

        productList.add(
                new Product(
                        1,
                        "Varus",
                        "mid range champion",
                        5.5,
                        4800,
                        R.drawable.varus));
        productList.add(
                new Product(
                        1,
                        "Varus",
                        "mid range champion",
                        5.5,
                        4800,
                        R.drawable.varus));
        productList.add(
                new Product(
                        1,
                        "Varus",
                        "mid range champion",
                        5.5,
                        4800,
                        R.drawable.varus));
        productList.add(
                new Product(
                        1,
                        "Varus",
                        "mid range champion",
                        5.5,
                        4800,
                        R.drawable.varus));
        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }
}
