package dev.rodweleo.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ParentDashboard extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_dashboard);

        setActivePage(new ParentHomeFragment());
        //get the bottom nav bar
        bottomNavigationView = findViewById(R.id.parent_bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home:
                        setActivePage(new ParentHomeFragment());
                       break;
                    case R.id.scores:
                        setActivePage(new ScoresFragment());
                        break;
                }
                return true;
            }
        });


    }

    private void setActivePage(Fragment fragment){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.parent_frame_layout, fragment);
            ft.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.parent_main_toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add_student:
                Toast toast = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);
                toast.show();
                FragmentManager fm = getSupportFragmentManager();
                Fragment fragment = fm.findFragmentById(R.id.parent_add_student_fragment);
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.parent_frame_layout, fragment);
                ft.commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}