package fr.lr.iut.transportprovider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Activity only use to allow app installation
 *
 * @author Jesús Daniel Medina Cruz
 * @since 14/12/2017
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
