package sg.edu.rp.c346.id20043679.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    TextView tvTranslatedText2;
    TextView tvTranslatedText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
        tvTranslatedText3 = findViewById(R.id.textViewTranslatedText3);

        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
        registerForContextMenu(tvTranslatedText3);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
       if(item.getItemId() == R.id.EnglishSelection){
           tvTranslatedText.setText("Hello");
           tvTranslatedText2.setText("Bye");
           tvTranslatedText3.setText("Welcome");
       }
       else if(item.getItemId() == R.id.italianSelection){
           tvTranslatedText.setText("Ciao");
           tvTranslatedText2.setText("Addio");
           tvTranslatedText3.setText("Benvenuto");
       }
       else if(item.getItemId() == R.id.FrenchSelection){
           tvTranslatedText.setText("Bonjour");
           tvTranslatedText2.setText("Au revoir");
           tvTranslatedText3.setText("Bienvenu");
       }
        return super.onContextItemSelected(item);
    }

}
