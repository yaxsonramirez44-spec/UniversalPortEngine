package com.port;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.File;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lobby_layout);

        TextView statusText = findViewById(R.id.statusText);
        Button startButton = findViewById(R.id.startButton);

        File internalDir = getFilesDir();
        boolean assetsExist = AssetDownloader.checkAssetsExist(internalDir);

        if (assetsExist) {
            statusText.setText("Motor listo para iniciar");
        } else {
            statusText.setText("Verificando recursos del motor...");
        }

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusText.setText("Iniciando Universal Port Engine...");
            }
        });
    }
}
