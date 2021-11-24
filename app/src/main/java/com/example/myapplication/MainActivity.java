package com.example.myapplication;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView tvX;
    private TextView tvY;
    private TextView tvZ;

    private SensorManager sm;
    private Sensor sensorAcc;
    private Object SensorEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        public void onSensorChanged(SensorEvent Object event;
        event)    {

            tvX.setText("X:"+event.values[0]);
            tvY.setText("Y:"+event.values[1]);
            tvZ.setText("Z:"+event.values[2]);

        }
        public void onAccuracyChanged(Sensor sensor int accuracy) {

            //do nothing here
        }





        //TextView-Objekte referenzieren

        tvX = findViewById(R.id.TextViewX);
        tvY = findViewById(R.id.TextViewY);
        tvZ = findViewById(R.id.TextViewZ);

        //sensormanager

        sm = (SensorManager) getSystemService(SENSOR_SERVICE);

        //acceleraiton sensor
        sensorAcc = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //register sensor listener
        sm.registerListener((SensorEventListener) this, sensorAcc, sm.SENSOR_DELAY_NORMAL);





    }

}