package com.example.surveyx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.amplifyframework.datastore.generated.model.Inspection;

import java.util.ArrayList;

public class Two_wheeler2 extends AppCompatActivity {
private Button next;
    ArrayList<String> numbers1 = new ArrayList<>();
    EditText remark;
RadioButton FrtMudGaurd_rd,Fork_rd,Handle_rd,Speedometer_rd,FuelTank_rd,RearMudGuard_rd,Silencer_rd,CrankCase_rd,Seats_rd,LegGuard_rd,
    WheelRim_rd,HeadLamp_rd,TailLamp_rd,FrtVisorCowl_rd,FrtRhIndicator_rd,FrtLhIndicator_rd,RearRhIndicator_rd,RearLhIndicator_rd,RhSideCover_rd,
    LhSidCover_rd,ClutchBrakeLever_rd,Tyre_rd,RecommendedForInsurance_rd;
    RadioGroup FrtMudGaurd_rg,Fork_rg,Handle_rg,Speedometer_rg,FuelTank_rg,RearMudGuard_rg,Silencer_rg,CrankCase_rg,Seats_rg,LegGuard_rg,
            WheelRim_rg,HeadLamp_rg,TailLamp_rg,FrtVisorCowl_rg,FrtRhIndicator_rg,FrtLhIndicator_rg,RearRhIndicator_rg,RearLhIndicator_rg,RhSideCover_rg,
    LhSideCover_rg,ClutchBrakeLever_rg,Tyre_rg,RecommendedForInsurance_rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_wheeler2);
        remark=findViewById(R.id.remark);
        next=(Button) findViewById(R.id.gotot3);
        RecommendedForInsurance_rg=findViewById(R.id.RecommendedForInsurance_rg);
        FrtMudGaurd_rg=findViewById(R.id.FrtMudGaurd_rg);
        Fork_rg=findViewById(R.id.Fork_rg);
        Handle_rg=findViewById(R.id.Handle_rg);
        Speedometer_rg=findViewById(R.id.Speedometer_rg);
        FuelTank_rg=findViewById(R.id.FuelTank_rg);
        RearMudGuard_rg=findViewById(R.id.RearMudGuard_rg);
        Silencer_rg=findViewById(R.id.Silencer_rg);
        CrankCase_rg=findViewById(R.id.CrankCase_rg);
        Seats_rg=findViewById(R.id.Seats_rg);
        LegGuard_rg=findViewById(R.id.LegGuard_rg);
        WheelRim_rg=findViewById(R.id.WheelRim_rg);
        HeadLamp_rg=findViewById(R.id.HeadLamp_rg);
        TailLamp_rg=findViewById(R.id.TailLamp_rg);
        FrtVisorCowl_rg=findViewById(R.id.FrtVisorCowl_rg);
        FrtRhIndicator_rg=findViewById(R.id.FrtRhIndicator_rg);
        FrtLhIndicator_rg=findViewById(R.id.FrtLhIndicator_rg);
        RearRhIndicator_rg=findViewById(R.id.RearRhIndicator_rg);
        RearLhIndicator_rg=findViewById(R.id.RearLhIndicator_rg);
        RhSideCover_rg=findViewById(R.id.RhSideCover_rg);
        LhSideCover_rg=findViewById(R.id.LhSideCover_rg);
        ClutchBrakeLever_rg=findViewById(R.id.ClutchBrakeLever_rg);
        Tyre_rg=findViewById(R.id.Tyre_rg);
        ArrayList<String> numbersList = (ArrayList<String>) getIntent().getSerializableExtra("key");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("val",String.valueOf(numbersList));
                int FrtMudGaurd_id = FrtMudGaurd_rg.getCheckedRadioButtonId();
                FrtMudGaurd_rd= (RadioButton) findViewById(FrtMudGaurd_id);
                if(FrtMudGaurd_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(FrtMudGaurd_rd.getText().toString());
                  //  text1.setText(FrtMudGaurd_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int Fork_id =Fork_rg.getCheckedRadioButtonId();
                Fork_rd=(RadioButton) findViewById(Fork_id);
                if(Fork_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Fork_rd.getText().toString());
                    //text2.setText(Fork_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                ///////////222222222///
                int Handle_id = Handle_rg.getCheckedRadioButtonId();
                Handle_rd= (RadioButton) findViewById(Handle_id);
                if(Handle_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Handle_rd.getText().toString());
                    //text1.setText(Handle_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int Speedometer_id =Speedometer_rg.getCheckedRadioButtonId();
                Speedometer_rd=(RadioButton) findViewById(Speedometer_id);
                if(Speedometer_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Speedometer_rd.getText().toString());
                   // text2.setText(Speedometer_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                ////////////333333333333333333333/////////
                int RearMudGuard_id = RearMudGuard_rg.getCheckedRadioButtonId();
                RearMudGuard_rd= (RadioButton) findViewById(RearMudGuard_id);
                if(RearMudGuard_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RearMudGuard_rd.getText().toString());
                  //  text1.setText(RearMudGuard_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int Silencer_id =Silencer_rg.getCheckedRadioButtonId();
                Silencer_rd=(RadioButton) findViewById(Silencer_id);
                if(Silencer_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Silencer_rd.getText().toString());
                  //  text2.setText(Silencer_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                /////////444444444444444444444///////////
                int CrankCase_id = CrankCase_rg.getCheckedRadioButtonId();
                CrankCase_rd= (RadioButton) findViewById(CrankCase_id);
                if(CrankCase_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(CrankCase_rd.getText().toString());
                    //text1.setText(CrankCase_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int Seats_id =Seats_rg.getCheckedRadioButtonId();
                Seats_rd=(RadioButton) findViewById(Seats_id);
                if(Seats_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Seats_rd.getText().toString());
                   // text2.setText(Seats_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                //////5555555555555555555555555555555//
                int LegGuard_id = LegGuard_rg.getCheckedRadioButtonId();
                LegGuard_rd= (RadioButton) findViewById(LegGuard_id);
                if(LegGuard_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(LegGuard_rd.getText().toString());
                  //  text1.setText(LegGuard_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int WheelRim_id =WheelRim_rg.getCheckedRadioButtonId();
                WheelRim_rd=(RadioButton) findViewById(WheelRim_id);
                if(WheelRim_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(WheelRim_rd.getText().toString());
                   // text2.setText(WheelRim_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                ////////6666666666666666//////////
                int HeadLamp_id = HeadLamp_rg.getCheckedRadioButtonId();
                HeadLamp_rd= (RadioButton) findViewById(HeadLamp_id);
                if(HeadLamp_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(HeadLamp_rd.getText().toString());
                   // text1.setText(HeadLamp_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int TailLamp_id =TailLamp_rg.getCheckedRadioButtonId();
                TailLamp_rd=(RadioButton) findViewById(TailLamp_id);
                if(TailLamp_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(TailLamp_rd.getText().toString());
                    //text2.setText(TailLamp_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                ////////777777777777777777777777777//////////////////////////////
                int FrtVisorCowl_id = FrtVisorCowl_rg.getCheckedRadioButtonId();
                FrtVisorCowl_rd= (RadioButton) findViewById(FrtVisorCowl_id);
                if(FrtVisorCowl_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(FrtVisorCowl_rd.getText().toString());
                  //  text1.setText(FrtVisorCowl_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int FrtRhIndicator_id =FrtRhIndicator_rg.getCheckedRadioButtonId();
                FrtRhIndicator_rd=(RadioButton) findViewById(FrtRhIndicator_id);
                if(FrtRhIndicator_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(FrtRhIndicator_rd.getText().toString());
                   // text2.setText(TailLamp_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                ///////////////////8888888888888888888888888//
                int FrtLhIndicator_id = FrtLhIndicator_rg.getCheckedRadioButtonId();
                FrtLhIndicator_rd= (RadioButton) findViewById(FrtLhIndicator_id);
                if(FrtLhIndicator_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(FrtLhIndicator_rd.getText().toString());
                   // text1.setText(FrtLhIndicator_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int RearRhIndicator_id =RearRhIndicator_rg.getCheckedRadioButtonId();
                RearRhIndicator_rd=(RadioButton) findViewById(RearRhIndicator_id);
                if(RearRhIndicator_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RearRhIndicator_rd.getText().toString());
                   // text2.setText(RearRhIndicator_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                /////////////////9999999999999999999999999999999/////////////
                int  RearLhIndicator_id= RearLhIndicator_rg.getCheckedRadioButtonId();
                RearLhIndicator_rd= (RadioButton) findViewById(RearLhIndicator_id);
                if(RearLhIndicator_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RearLhIndicator_rd.getText().toString());
                   // text1.setText(RhSideCover_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int  RhSideCover_id= RhSideCover_rg.getCheckedRadioButtonId();
                RhSideCover_rd= (RadioButton) findViewById(RhSideCover_id);
                if(RhSideCover_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RhSideCover_rd.getText().toString());
                    // text1.setText(RhSideCover_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int LhSideCover_id =LhSideCover_rg.getCheckedRadioButtonId();
                LhSidCover_rd=(RadioButton) findViewById(LhSideCover_id);
                if(LhSideCover_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(LhSidCover_rd.getText().toString());
                   // text2.setText(LhSideCover_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int  ClutchBrakeLever_id= ClutchBrakeLever_rg.getCheckedRadioButtonId();
                ClutchBrakeLever_rd= (RadioButton) findViewById(ClutchBrakeLever_id);
                if(ClutchBrakeLever_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(ClutchBrakeLever_rd.getText().toString());
                    //text1.setText(ClutchBrakeLever_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int Tyre_id =Tyre_rg.getCheckedRadioButtonId();
                Tyre_rd=(RadioButton) findViewById(Tyre_id);
                if(Tyre_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(Tyre_rd.getText().toString());
                   // text2.setText(Tyre_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                int RecommendedForInsurance_id =RecommendedForInsurance_rg.getCheckedRadioButtonId();
                RecommendedForInsurance_rd=(RadioButton) findViewById(RecommendedForInsurance_id);
                if(RecommendedForInsurance_id==-1){
                    Toast.makeText(Two_wheeler2.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    numbers1.add(RecommendedForInsurance_rd.getText().toString());
                    // text2.setText(Tyre_rd.getText());
                    //Toast.makeText(Two_wheeler2.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
                numbers1.add(remark.getText().toString());
                Intent next=new Intent(getApplicationContext(),Two_wheeler4.class);
                next.putExtra("key1", numbers1);
               startActivity(next);
            }
        });
    }
}