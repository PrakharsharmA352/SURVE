package com.example.surveyx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;

import java.util.ArrayList;
import java.util.Calendar;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import android.Manifest;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Four_Wheeler extends AppCompatActivity {
    private EditText insu,proposer,vehiclereg,make_model,chasiss_no,EngineNo,Milometer;
    private Button btn1;
    EditText format1, format2,currentAddTv;
    private FusedLocationProviderClient fusedLocationClient;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 2;
    private Four_Wheeler.LocationAddressResultReceiver addressResultReceiver;
    private Location currentLocation;
    private LocationCallback locationCallback;
    ImageButton calcbtn;
    EditText date;
    DatePickerDialog datePickerDialog;
    DatePicker datePicker;
    int year;
    int month;
    int dayOfMonth;
   Calendar calendar;
    private Button btn;
    ArrayList<String> numbers = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_wheeler);
        insu=(EditText)findViewById(R.id.insureDetails);
        proposer=(EditText) findViewById(R.id.NameofProposer);
        vehiclereg=(EditText)findViewById(R.id.VehicleRegdNo);
        make_model=(EditText)findViewById(R.id.MakeModel);
        chasiss_no=(EditText)findViewById(R.id.ChassisNo);
        EngineNo=(EditText)findViewById(R.id.engineno);
        Milometer=(EditText)findViewById(R.id.milo_meter);
        calcbtn= (ImageButton) findViewById(R.id.btnDate);
       date = (EditText) findViewById(R.id.tvSelectedDate);
       calcbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               calendar = Calendar.getInstance();
               year = calendar.get(Calendar.YEAR);
               month = calendar.get(Calendar.MONTH);
               dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
               datePickerDialog = new DatePickerDialog(Four_Wheeler.this,
                       new DatePickerDialog.OnDateSetListener() {
                           @Override
                           public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                               date.setText(day + "/" + (month + 1) + "/" + year);
                           }
                       }, year, month, dayOfMonth);
               datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
               datePickerDialog.show();

           }
       });
        addressResultReceiver = new Four_Wheeler.LocationAddressResultReceiver(new Handler());
        currentAddTv = findViewById(R.id.currentAddTv);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                currentLocation = locationResult.getLocations().get(0);
                getAddress();
            }
        };
        startLocationUpdates();

        format1 = findViewById(R.id.format1);
        format2 = findViewById(R.id.format2);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");
        String strDate = mdformat.format(calendar.getTime());
        format1.setText(strDate);
        format1.setEnabled(false);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String strDate1 = sdf.format(c.getTime());
        format2.setText(strDate1);
        format2.setEnabled(false);
        btn1 = findViewById(R.id.next);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*    Intent next = new Intent(getApplicationContext(),four_Wheeler2.class);
                startActivity(next);*/
                numbers.add(insu.getText().toString());
                numbers.add(proposer.getText().toString());
                numbers.add(format1.getText().toString());
                numbers.add(format2.getText().toString());
                numbers.add(currentAddTv.getText().toString());
                numbers.add(vehiclereg.getText().toString());
                numbers.add(chasiss_no.getText().toString());
                numbers.add(make_model.getText().toString());
                numbers.add(EngineNo.getText().toString());
                numbers.add(date.getText().toString());
                numbers.add(Milometer.getText().toString());
                //numbers.add("hello");
                Intent next = new Intent(getApplicationContext(),four_Wheeler2.class);
                next.putExtra("key", numbers);
                startActivity(next);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void startLocationUpdates() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new
                            String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    LOCATION_PERMISSION_REQUEST_CODE);
        }
        else {
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.setInterval(2000);
            locationRequest.setFastestInterval(1000);
            locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
            fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, null);
        }
    }
    @SuppressWarnings("MissingPermission")
    private void getAddress() {
        if (!Geocoder.isPresent()) {
            Toast.makeText(Four_Wheeler.this, "Can't find current address, ",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent=new Intent(this,GetaddressIntentService.class);
        intent.putExtra("add_receiver", addressResultReceiver);
        intent.putExtra("add_location", currentLocation);
        startService(intent);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull
            int[] grantResults) {
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                startLocationUpdates();
            }
            else {
                Toast.makeText(this, "Location permission not granted, " + "restart the app if you want the feature", Toast.LENGTH_SHORT).show();
            }
        }
    }
    private class LocationAddressResultReceiver extends ResultReceiver {
        LocationAddressResultReceiver(Handler handler) {
            super(handler);
        }
        @Override
        protected void onReceiveResult(int resultCode, Bundle resultData) {
            if (resultCode == 0) {
                Log.d("Address", "Location null retrying");
                getAddress();
            }
            if (resultCode == 1) {
                Toast.makeText(Four_Wheeler.this, "Address not found, ", Toast.LENGTH_SHORT).show();
            }
            String currentAdd = resultData.getString("address_result");
            showResults(currentAdd);
        }
    }
    private void showResults(String currentAdd) {
        currentAddTv.setText(currentAdd);
        currentAddTv.setEnabled(false);
    }
    @Override
    protected void onResume() {
        super.onResume();
        startLocationUpdates();
    }
    @Override
    protected void onPause() {
        super.onPause();
        fusedLocationClient.removeLocationUpdates(locationCallback);
    }


}
