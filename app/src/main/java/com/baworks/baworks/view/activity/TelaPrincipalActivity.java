package com.baworks.baworks.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.baworks.baworks.R;

/**
 * Created by daniel on 8/12/17.
 */

public class TelaPrincipalActivity extends BaseActivity implements View.OnClickListener {

    private Button btnCadastrar;
    private Button btnLogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        btnCadastrar = (Button) findViewById(R.id.btn_cadastrar);
        btnLogar = (Button) findViewById(R.id.btn_logar);

        btnCadastrar.setOnClickListener(this);
        btnLogar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cadastrar:
                Intent intent = new Intent(this, TutorialActivity.class);
                intent.putExtra("tab", "profile");
                startActivity(intent);
                finish();
                break;
            case R.id.btn_logar:
                break;
            default:
                break;
        }
    }
}